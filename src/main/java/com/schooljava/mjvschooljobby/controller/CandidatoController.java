package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.service.CandidatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    @Autowired
    CandidatoService candidatoService;

//    @PostMapping("/cadastrar-candidato")
//    public Candidato cadastrarCandidato (@RequestBody Candidato candidato){
//        candidatoService.cadastrarCandidato(candidato);
//        return candidato;
//    }
//
//    @GetMapping ("/{id}")
//    public Optional<Candidato> buscarPorId(@RequestParam Integer id){
//        return candidatoService.buscarPorId(id);
//    }
//
//    @PostMapping("/alterar-dados-candidato")
//    public Candidato alterarDados(@RequestBody Candidato candidato){
//        candidatoService.alterarDados(candidato);
//        return candidato;
//    }
//    @DeleteMapping ("/{id}")
//    public Candidato deletarDados(@RequestParam Integer id){
//        return candidatoService.deletarDados(id);
//    }

}
