package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.dto.CidadeDto;
import com.schooljava.mjvschooljobby.dto.EmpresaDto;
import com.schooljava.mjvschooljobby.model.Cidade;
import com.schooljava.mjvschooljobby.model.Empresa;
import com.schooljava.mjvschooljobby.repository.CidadeRepository;
import com.schooljava.mjvschooljobby.repository.EmpresaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    private final ModelMapper modelMapper;

    public CidadeService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Cidade cadastrarCidade (CidadeDto cidadeDto) {
        Cidade cidade = new Cidade();
        BeanUtils.copyProperties(cidadeDto, cidade);
        return cidadeRepository.save(cidade);
    }

    public Cidade alterarCidade(CidadeDto cidadeDto) {
        Cidade cidade = modelMapper.map(cidadeDto, Cidade.class);
        Optional<Cidade> optionalCidade = cidadeRepository.findById(cidade.getIdCidade());

        if (optionalCidade.isPresent()) {
            Cidade cidadeExistente = optionalCidade.get();
            modelMapper.map(cidadeDto, cidadeExistente);
            return cidadeRepository.save(cidadeExistente);
        } else {
            throw new IllegalArgumentException("Empresa não encontrada");
        }
    }

    public List<Cidade> listarCidade() {
        return cidadeRepository.findAll();
    }
    public Cidade buscarCidadeId(Integer id) {
        return cidadeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cidade não encontrada"));
    }
    public boolean deletarCidadea(Integer id) {
        Optional<Cidade> optionalCidade = cidadeRepository.findById(id);
        if (optionalCidade.isPresent()) {
            Cidade cidade = optionalCidade.get();
            cidadeRepository.delete(cidade);
            return true;
        }
        return false;
    }
}
