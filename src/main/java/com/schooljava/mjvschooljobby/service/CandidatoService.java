package com.schooljava.mjvschooljobby.service;


import com.schooljava.mjvschooljobby.dto.CandidatoCadastroDto;
import com.schooljava.mjvschooljobby.dto.EnderecoDto;
import com.schooljava.mjvschooljobby.model.*;
import com.schooljava.mjvschooljobby.repository.CandidatoRepository;
import com.schooljava.mjvschooljobby.repository.CidadeRepository;
import com.schooljava.mjvschooljobby.repository.HabilidadeRepository;
import com.schooljava.mjvschooljobby.repository.ProfissaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.schooljava.mjvschooljobby.dto.CandidatoDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CandidatoService {

    private CandidatoRepository candidatoRepository;
    private ProfissaoRepository profissaoRepository;
    private HabilidadeRepository habilidadeRepository;
    private CidadeRepository cidadeRepository;
    private ModelMapper modelMapper;

    @Autowired
    public CandidatoService(
            CandidatoRepository candidatoRepository,
            ProfissaoRepository profissaoRepository,
            HabilidadeRepository habilidadeRepository,
            CidadeRepository cidadeRepository,
            ModelMapper modelMapper
    ) {
        this.candidatoRepository = candidatoRepository;
        this.profissaoRepository = profissaoRepository;
        this.habilidadeRepository = habilidadeRepository;
        this.cidadeRepository = cidadeRepository;
        this.modelMapper = modelMapper;
    }

    public CandidatoCadastroDto cadastrarCandidato(CandidatoCadastroDto candidatoCadastroDto) {
        Optional<Candidato> candidatoExistente = candidatoRepository.findByCpf(candidatoCadastroDto.getCpf());

        if (candidatoExistente.isPresent()) {
            throw new IllegalArgumentException("Candidato já está cadastrado");
        }

        Candidato candidato = modelMapper.map(candidatoCadastroDto, Candidato.class);
        Profissao profissao = profissaoRepository.findById(candidatoCadastroDto.getProfissaoId())
                .orElseThrow(() -> new IllegalArgumentException("Profissão não encontrada"));

        candidato.setProfissao(profissao);

        // Verificação do ID da cidade
        EnderecoDto enderecoDto = candidatoCadastroDto.getEndereco();
        Integer cidadeId = enderecoDto.getCidade();
        Cidade cidade = cidadeRepository.findById(cidadeId)
                .orElseThrow(() -> new IllegalArgumentException("Cidade não encontrada"));
        System.out.println("ID da cidade do candidato: " + cidade.getIdCidade());

        Endereco endereco = modelMapper.map(enderecoDto, Endereco.class);
        endereco.setCidade(cidade);
        candidato.setEndereco(endereco);

        Candidato novoCandidato = candidatoRepository.save(candidato);

        CandidatoCadastroDto novoCandidatoDto = modelMapper.map(novoCandidato, CandidatoCadastroDto.class);
        return novoCandidatoDto;
    }


    public CandidatoDto alterarCandidato(Integer id, CandidatoDto candidatoDto) {
        Optional<Candidato> optionalCandidato = candidatoRepository.findById(id);

        if (optionalCandidato.isEmpty()) {
            throw new IllegalArgumentException("Candidato não encontrado");
        }

        Candidato candidatoExistente = optionalCandidato.get();
        modelMapper.map(candidatoDto, candidatoExistente);

        Candidato candidatoAtualizado = candidatoRepository.save(candidatoExistente);
        return modelMapper.map(candidatoAtualizado, CandidatoDto.class);
    }

    public List<CandidatoDto> listarCandidatos() {
        List<Candidato> candidatos = candidatoRepository.findAll();
        return candidatos.stream()
                .map(candidato -> modelMapper.map(candidato, CandidatoDto.class))
                .collect(Collectors.toList());
    }

    public List<Candidato> listarCandidato() {
        return candidatoRepository.findAll();
    }


    public CandidatoDto buscarCandidatoPorId(Integer id) {
        Candidato candidato = candidatoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Candidato não encontrado"));

        return modelMapper.map(candidato, CandidatoDto.class);
    }

    public void deletarCandidato(Integer id) {
        Candidato candidato = candidatoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Candidato não encontrado"));

        candidatoRepository.delete(candidato);
    }
}
