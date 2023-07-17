package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.ProfissaoDto;
import com.schooljava.mjvschooljobby.service.ProfissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissoes")
public class ProfissaoController {

    private final ProfissaoService profissaoService;

    @Autowired
    public ProfissaoController(ProfissaoService profissaoService) {
        this.profissaoService = profissaoService;
    }

    @PostMapping("/nova-profissao")
    public ResponseEntity<ProfissaoDto> cadastrarProfissao(@RequestBody ProfissaoDto profissaoDto) {
        ProfissaoDto novaProfissao = profissaoService.cadastrarProfissao(profissaoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaProfissao);
    }

    @PutMapping("/editar-profissao/{id}")
    public ResponseEntity<ProfissaoDto> alterarProfissao(@PathVariable Integer id, @RequestBody ProfissaoDto profissaoDto) {
        ProfissaoDto profissaoAlterada = profissaoService.alterarProfissao(id, profissaoDto);
        return ResponseEntity.ok(profissaoAlterada);
    }

    @GetMapping("/listar-profissoes")
    public ResponseEntity<List<ProfissaoDto>> listarProfissoes() {
        List<ProfissaoDto> profissoes = profissaoService.listarProfissoes();
        return ResponseEntity.ok(profissoes);
    }

    @GetMapping("/buscar-profissao/{id}")
    public ResponseEntity<ProfissaoDto> buscarProfissaoPorId(@PathVariable Integer id) {
        ProfissaoDto profissao = profissaoService.buscarProfissaoPorId(id);
        return ResponseEntity.ok(profissao);
    }

    @DeleteMapping("/deletar-profissao/{id}")
    public ResponseEntity<Void> deletarProfissao(@PathVariable Integer id) {
        profissaoService.deletarProfissao(id);
        return ResponseEntity.noContent().build();
    }
}
