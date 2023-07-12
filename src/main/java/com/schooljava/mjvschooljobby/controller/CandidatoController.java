package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

//    @Autowired
//    CandidatoService candidatoService;
//
//    @PostMapping("/cadastrar-candidato")
//    public Candidato cadastrarCandidato (@RequestBody Candidato candidato){
//        return candidatoService.cadastrarCandidato(candidato);
//    }
//
//    @GetMapping ("/{id}")
//    public Optional<Candidato> buscarPorId(@PathVariable Integer id){
//        return candidatoService.buscarPorId(id);
//    }
//
//    @PutMapping ("/{id}")
//    public Candidato alterarDados(@PathVariable Integer id, @RequestBody Candidato candidato){
//        candidato.setIdCadastro(id);
//        return candidatoService.alterarDados(candidato);
//    }
//    @DeleteMapping ("/{id}")
//    public Candidato deletarDados(@PathVariable Integer id){
//        return candidatoService.deletarDados(id);
//    }
//
//    @GetMapping("/habilidade-java")
//    public Integer contarHabilidadeJava(){
//        return candidatoService.contarHabilidadeJava();
//    }
//
//    @GetMapping("/sem-habilidades")
//    public List<Candidato> listarCandidatosSemHabilidades(){
//        return candidatoService.listarCandidatosSemHabilidades();
//    }
//
//    @GetMapping("/sexo-feminino-sp")
//    public List<Candidato> listarCandidatoFemininoSP(){
//        return candidatoService.listarCandidatoFemininoSP();
//    }

}
