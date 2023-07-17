package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.CidadeDto;
import com.schooljava.mjvschooljobby.model.Cidade;
import com.schooljava.mjvschooljobby.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping("/nova-cidade")
    public ResponseEntity<CidadeDto> cadastrarCidade (@RequestBody CidadeDto cidadeDto) {
        return ResponseEntity.ok(cidadeService.cadastrarCidade(cidadeDto));
    }

    @GetMapping("/listar-cidades")
    public ResponseEntity<List<Cidade>> listarCidades() {
        return ResponseEntity.ok(cidadeService.listarCidades());
    }

    @GetMapping("/buscar-cidade/{id}")
    public ResponseEntity<Cidade> buscarCidade(@PathVariable Integer id){
        return ResponseEntity.ok(cidadeService.buscarCidadeId(id));
    }
    @DeleteMapping("/deletar-cidade/{id}")
    public ResponseEntity<String> deletarCidade(@PathVariable Integer id) {
        boolean deletada = cidadeService.deletarCidade(id);
        if (deletada) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não encontrado!");
    }
}
