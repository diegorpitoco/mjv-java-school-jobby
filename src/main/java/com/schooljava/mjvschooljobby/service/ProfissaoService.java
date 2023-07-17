package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.model.Profissao;
import com.schooljava.mjvschooljobby.dto.ProfissaoDto;
import com.schooljava.mjvschooljobby.repository.ProfissaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfissaoService {

    private final ProfissaoRepository profissaoRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ProfissaoService(ProfissaoRepository profissaoRepository, ModelMapper modelMapper) {
        this.profissaoRepository = profissaoRepository;
        this.modelMapper = modelMapper;
    }

    public ProfissaoDto cadastrarProfissao(ProfissaoDto profissaoDto) {
        Profissao profissao = modelMapper.map(profissaoDto, Profissao.class);
        Profissao novaProfissao = profissaoRepository.save(profissao);
        return modelMapper.map(novaProfissao, ProfissaoDto.class);
    }

    public ProfissaoDto alterarProfissao(Integer id, ProfissaoDto profissaoDto) {
        Optional<Profissao> optionalProfissao = profissaoRepository.findById(id);
        if (optionalProfissao.isEmpty()) {
            throw new IllegalArgumentException("Profissão não encontrada");
        }
        Profissao profissao = optionalProfissao.get();
        profissao.setNome(profissaoDto.getNome());
        Profissao profissaoAlterada = profissaoRepository.save(profissao);
        return modelMapper.map(profissaoAlterada, ProfissaoDto.class);
    }

    public List<ProfissaoDto> listarProfissoes() {
        List<Profissao> profissoes = profissaoRepository.findAll();
        return profissoes.stream()
                .map(profissao -> modelMapper.map(profissao, ProfissaoDto.class))
                .collect(Collectors.toList());
    }

    public ProfissaoDto buscarProfissaoPorId(Integer id) {
        Profissao profissao = profissaoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Profissão não encontrada"));
        return modelMapper.map(profissao, ProfissaoDto.class);
    }

    public void deletarProfissao(Integer id) {
        Optional<Profissao> optionalProfissao = profissaoRepository.findById(id);
        if (optionalProfissao.isEmpty()) {
            throw new IllegalArgumentException("Profissão não encontrada");
        }
        profissaoRepository.delete(optionalProfissao.get());
    }
}
