package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.ExperienciaDto;
import com.schooljava.mjvschooljobby.dto.ExperienciaDtoModif;
import com.schooljava.mjvschooljobby.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {

    private ExperienciaService experienciaService;

    @Autowired
    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @PostMapping("/nova-experiencia")
    public ExperienciaDtoModif criarExperiencia(@RequestBody ExperienciaDtoModif experienciaDtoModif) {
        return experienciaService.criarExperiencia(experienciaDtoModif);
    }

    @PutMapping("/editar-experiencia/{id}")
    public ExperienciaDto alterarExperiencia(@PathVariable Integer id, @RequestBody ExperienciaDto experienciaDto) {
        return experienciaService.alterarExperiencia(id, experienciaDto);
    }

    @GetMapping("/listar-experiencias")
    public List<ExperienciaDtoModif> listarExperiencias() {
        return experienciaService.listarExperiencias();
    }

    @GetMapping("/buscar-experiencia-por-id-candidato/{idCandidato}")
    public List<ExperienciaDtoModif> buscarExperienciaPorIdCandidato(@PathVariable Integer idCandidato) {
        return experienciaService.buscarExperienciaPorIdCandidato(idCandidato);
    }

    @DeleteMapping("/deletar-experiencia/{id}")
    public void deletarExperiencia(@PathVariable Integer id) {
        experienciaService.deletarExperiencia(id);
    }
}

