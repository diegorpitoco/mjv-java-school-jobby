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
    public ResponseEntity<String> cadastrarCandidato(@RequestBody CandidatoDto candidatoDto) {
        CandidatoDto novoCandidato = candidatoService.cadastrarCandidato(candidatoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Cadastro realizado com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<CandidatoDto> alterarCandidato(@PathVariable Integer id, @RequestBody CandidatoDto candidatoDto) {
        CandidatoDto candidatoAlterado = candidatoService.alterarCandidato(id, candidatoDto);
        return ResponseEntity.ok(candidatoAlterado);
    }


    @GetMapping("/lista-candidatos")
    public ResponseEntity<List<CandidatoDto>> listarCandidatos() {
        List<CandidatoDto> candidatos = candidatoService.listarCandidatos();
        return ResponseEntity.ok(candidatos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidatoDto> buscarCandidatoPorId(@PathVariable Integer id) {
        CandidatoDto candidato = candidatoService.buscarCandidatoPorId(id);
        return ResponseEntity.ok(candidato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCandidato(@PathVariable Integer id) {
        candidatoService.deletarCandidato(id);
        return ResponseEntity.noContent().build();
    }

}
