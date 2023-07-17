package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.ExperienciaDto;
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

    @PostMapping
    public ExperienciaDto criarExperiencia(@RequestBody ExperienciaDto experienciaDto) {
        return experienciaService.criarExperiencia(experienciaDto);
    }

    @PutMapping("/{id}")
    public ExperienciaDto alterarExperiencia(@PathVariable Integer id, @RequestBody ExperienciaDto experienciaDto) {
        return experienciaService.alterarExperiencia(id, experienciaDto);
    }

    @GetMapping
    public List<ExperienciaDto> listarExperiencias() {
        return experienciaService.listarExperiencias();
    }

    @GetMapping("/{id}")
    public ExperienciaDto buscarExperienciaPorId(@PathVariable Integer id) {
        return experienciaService.buscarExperienciaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarExperiencia(@PathVariable Integer id) {
        experienciaService.deletarExperiencia(id);
    }
}

