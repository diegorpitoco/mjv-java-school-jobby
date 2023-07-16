package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.CandidatoDto;
import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @PostMapping("/novo")
    public ResponseEntity<Candidato> cadastrarCandidato (@RequestBody CandidatoDto candidato) {
        return ResponseEntity.ok(candidatoService.cadastrarCandidato(candidato));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Candidato> alterarCandidato(@PathVariable Integer id, @RequestBody CandidatoDto candidato) {
        return ResponseEntity.ok(candidatoService.alterarCandidato(candidato));
    }

    @GetMapping("/lista-candidatos")
    public ResponseEntity<List<Candidato>> listarCandidato() {
        return ResponseEntity.ok(candidatoService.listarCandidato());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidato> buscarCandidatoId(@PathVariable Integer id) {
        Candidato candidato = candidatoService.buscarCandidatoId(id);
        return ResponseEntity.ok(candidato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCandidato(@PathVariable Integer id) {
        boolean deletado = candidatoService.deletarCandidato(id);
        if (deletado) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não encontrado!");
    }
}
