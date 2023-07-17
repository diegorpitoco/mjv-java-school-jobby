package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.HabilidadeDto;
import com.schooljava.mjvschooljobby.service.HabilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeController {

    private final HabilidadeService habilidadeService;

    @Autowired
    public HabilidadeController(HabilidadeService habilidadeService) {
        this.habilidadeService = habilidadeService;
    }

    @PostMapping("/nova-habilidade")
    public ResponseEntity<HabilidadeDto> criarHabilidade(@RequestBody HabilidadeDto habilidadeDto) {
        HabilidadeDto novaHabilidade = habilidadeService.criarHabilidade(habilidadeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaHabilidade);
    }

    @PutMapping("/editar-habilidade/{id}")
    public ResponseEntity<HabilidadeDto> alterarHabilidade(@PathVariable Integer id, @RequestBody HabilidadeDto habilidadeDto) {
        HabilidadeDto habilidadeAlterada = habilidadeService.alterarHabilidade(id, habilidadeDto);
        return ResponseEntity.ok(habilidadeAlterada);
    }

    @GetMapping("/listar-habilidades")
    public ResponseEntity<List<HabilidadeDto>> listarHabilidades() {
        List<HabilidadeDto> habilidades = habilidadeService.listarHabilidades();
        return ResponseEntity.ok(habilidades);
    }

    @GetMapping("/buscar-habilidade/{id}")
    public ResponseEntity<HabilidadeDto> buscarHabilidadePorId(@PathVariable Integer id) {
        HabilidadeDto habilidade = habilidadeService.buscarHabilidadePorId(id);
        return ResponseEntity.ok(habilidade);
    }

    @DeleteMapping("/deletar-habilidade/{id}")
    public ResponseEntity<Void> deletarHabilidade(@PathVariable Integer id) {
        habilidadeService.deletarHabilidade(id);
        return ResponseEntity.noContent().build();
    }
}