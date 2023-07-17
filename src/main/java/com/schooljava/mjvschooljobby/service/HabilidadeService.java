package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.dto.HabilidadeDto;
import com.schooljava.mjvschooljobby.model.Habilidade;
import com.schooljava.mjvschooljobby.repository.HabilidadeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HabilidadeService {

    private final HabilidadeRepository habilidadeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public HabilidadeService(HabilidadeRepository habilidadeRepository, ModelMapper modelMapper) {
        this.habilidadeRepository = habilidadeRepository;
        this.modelMapper = modelMapper;
    }

    public HabilidadeDto criarHabilidade(HabilidadeDto habilidadeDto) {
        Habilidade habilidade = modelMapper.map(habilidadeDto, Habilidade.class);
        Habilidade novaHabilidade = habilidadeRepository.save(habilidade);
        return modelMapper.map(novaHabilidade, HabilidadeDto.class);
    }

    public HabilidadeDto alterarHabilidade(Integer id, HabilidadeDto habilidadeDto) {
        Optional<Habilidade> optionalHabilidade = habilidadeRepository.findById(id);

        if (optionalHabilidade.isEmpty()) {
            throw new IllegalArgumentException("Habilidade não encontrada");
        }

        Habilidade habilidadeExistente = optionalHabilidade.get();
        habilidadeExistente.setNome(habilidadeDto.getNome());

        Habilidade habilidadeAtualizada = habilidadeRepository.save(habilidadeExistente);
        return modelMapper.map(habilidadeAtualizada, HabilidadeDto.class);
    }

    public List<HabilidadeDto> listarHabilidades() {
        List<Habilidade> habilidades = habilidadeRepository.findAll();
        return habilidades.stream()
                .map(habilidade -> modelMapper.map(habilidade, HabilidadeDto.class))
                .collect(Collectors.toList());
    }

    public HabilidadeDto buscarHabilidadePorId(Integer id) {
        Habilidade habilidade = habilidadeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Habilidade não encontrada"));

        return modelMapper.map(habilidade, HabilidadeDto.class);
    }

    public void deletarHabilidade(Integer id) {
        Habilidade habilidade = habilidadeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Habilidade não encontrada"));

        habilidadeRepository.delete(habilidade);
    }
}