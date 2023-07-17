package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.dto.ExperienciaDto;
import com.schooljava.mjvschooljobby.model.Experiencia;
import com.schooljava.mjvschooljobby.repository.ExperienciaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ExperienciaService {
    private ExperienciaRepository experienciaRepository;
    private ModelMapper modelMapper;

    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository, ModelMapper modelMapper) {
        this.experienciaRepository = experienciaRepository;
        this.modelMapper = modelMapper;
    }

    public ExperienciaDto criarExperiencia(ExperienciaDto experienciaDto) {
        Experiencia experiencia = modelMapper.map(experienciaDto, Experiencia.class);
        Experiencia novaExperiencia = experienciaRepository.save(experiencia);
        return modelMapper.map(novaExperiencia, ExperienciaDto.class);
    }

    public ExperienciaDto alterarExperiencia(Integer id, ExperienciaDto experienciaDto) {
        Optional<Experiencia> optionalExperiencia = experienciaRepository.findById(id);
        if (optionalExperiencia.isEmpty()) {
            throw new IllegalArgumentException("Experiência não encontrada");
        }

        Experiencia experienciaExistente = optionalExperiencia.get();
        modelMapper.map(experienciaDto, experienciaExistente);

        Experiencia experienciaAtualizada = experienciaRepository.save(experienciaExistente);
        return modelMapper.map(experienciaAtualizada, ExperienciaDto.class);
    }

    public List<ExperienciaDto> listarExperiencias() {
        List<Experiencia> experiencias = experienciaRepository.findAll();
        return experiencias.stream()
                .map(experiencia -> modelMapper.map(experiencia, ExperienciaDto.class))
                .collect(Collectors.toList());
    }

    public ExperienciaDto buscarExperienciaPorId(Integer id) {
        Experiencia experiencia = experienciaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Experiência não encontrada"));
        return modelMapper.map(experiencia, ExperienciaDto.class);
    }

    public void deletarExperiencia(Integer id) {
        Experiencia experiencia = experienciaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Experiência não encontrada"));
        experienciaRepository.delete(experiencia);
    }
}

