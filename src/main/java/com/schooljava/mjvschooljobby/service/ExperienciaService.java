package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.dto.ExperienciaDto;
import com.schooljava.mjvschooljobby.dto.EmpresaDto;
import com.schooljava.mjvschooljobby.dto.ExperienciaDtoModif;
import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.model.Empresa;
import com.schooljava.mjvschooljobby.model.Experiencia;
import com.schooljava.mjvschooljobby.repository.CandidatoRepository;
import com.schooljava.mjvschooljobby.repository.EmpresaRepository;
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
    private EmpresaRepository empresaRepository;
    private CandidatoRepository candidatoRepository;

    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository, ModelMapper modelMapper, EmpresaRepository empresaRepository, CandidatoRepository candidatoRepository) {
        this.experienciaRepository = experienciaRepository;
        this.modelMapper = modelMapper;
        this.empresaRepository = empresaRepository;
        this.candidatoRepository = candidatoRepository;
    }

    public ExperienciaDtoModif criarExperiencia(ExperienciaDtoModif experienciaDtoModif) {
        Candidato candidato = candidatoRepository.findById(experienciaDtoModif.getIdCandidato())
                .orElseThrow(() -> new IllegalArgumentException("Candidato não encontrado: " + experienciaDtoModif.getIdCandidato()));

        Experiencia experiencia = modelMapper.map(experienciaDtoModif, Experiencia.class);
        experiencia.setCandidato(candidato);

        if (experienciaDtoModif.getEmpresa() != null) {
            Empresa empresa = empresaRepository.findById(experienciaDtoModif.getEmpresa())
                    .orElseThrow(() -> new IllegalArgumentException("Empresa não encontrada: " + experienciaDtoModif.getEmpresa()));

            experiencia.setEmpresa(empresa);
        }

        Experiencia novaExperiencia = experienciaRepository.save(experiencia);
        return modelMapper.map(novaExperiencia, ExperienciaDtoModif.class);
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

    public List<ExperienciaDtoModif> listarExperiencias() {
        List<Experiencia> experiencias = experienciaRepository.findAll();
        return experiencias.stream()
                .map(experiencia -> modelMapper.map(experiencia, ExperienciaDtoModif.class))
                .collect(Collectors.toList());
    }

    public List<ExperienciaDtoModif> buscarExperienciaPorIdCandidato(Integer idCandidato) {
        List<Experiencia> experiencias = experienciaRepository.findByCandidatoId(idCandidato);
        return experiencias.stream()
                .map(experiencia -> modelMapper.map(experiencia, ExperienciaDtoModif.class))
                .collect(Collectors.toList());
    }


    public void deletarExperiencia(Integer id) {
        Experiencia experiencia = experienciaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Experiência não encontrada"));
        experienciaRepository.delete(experiencia);
    }
}

