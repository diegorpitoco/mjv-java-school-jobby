package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.CidadeDto;
import com.schooljava.mjvschooljobby.dto.EmpresaDto;
import com.schooljava.mjvschooljobby.model.Cidade;
import com.schooljava.mjvschooljobby.model.Empresa;
import com.schooljava.mjvschooljobby.service.CandidatoService;
import com.schooljava.mjvschooljobby.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping("/nova")
    public ResponseEntity<EmpresaDto> cadastrarEmpresa (@RequestBody EmpresaDto empresaDto) {
        return ResponseEntity.ok(empresaService.cadastrarEmpresa(empresaDto));
    }
    @GetMapping("/buscar-empresa/{id}")
    public ResponseEntity<Empresa> buscarEmpresa(@PathVariable Integer id){
        return ResponseEntity.ok(empresaService.buscarEmpresaId(id));
    }

    @GetMapping("/listar-empresas")
    public ResponseEntity<List<Empresa>> listarEmpresas() {
        return ResponseEntity.ok(empresaService.listarEmpresas());
    }

    @DeleteMapping("/deletar-empresa/{id}")
    public ResponseEntity<String> deletarEmpresa(@PathVariable Integer id) {
        boolean deletada = empresaService.deletarEmpresa(id);
        if (deletada) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não encontrado!");
    }
}
