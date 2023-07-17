package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.EmpresaDto;
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

    private EmpresaService empresaService;

    @Autowired
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
    @PostMapping("/nova-empresa")
    public ResponseEntity<EmpresaDto> cadastrarEmpresa (@RequestBody EmpresaDto empresaDto) {
        return ResponseEntity.ok(empresaService.cadastrarEmpresa(empresaDto));
    }

    @GetMapping("/listar-empresas")
    public ResponseEntity<List<EmpresaDto>> listarEmpresas() {
        List<EmpresaDto> empresasDto = empresaService.listarEmpresas();
        return ResponseEntity.ok(empresasDto);
    }

    @GetMapping("/buscar-empresa/{id}")
    public ResponseEntity<EmpresaDto> buscarEmpresaId(@PathVariable Integer id){
        EmpresaDto empresaDto = empresaService.buscarEmpresaId(id);
        return ResponseEntity.ok(empresaDto);
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
