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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public CidadeDto cadastrarCidade (CidadeDto cidadeDto) {
        Cidade cidade = new Cidade();
        BeanUtils.copyProperties(cidadeDto, cidade, "id");
        cidadeRepository.save(cidade);
        return cidadeDto;
    }

    public List<Cidade> listarCidades() {
        return cidadeRepository.findAll();
    }
    public Cidade buscarCidadeId(Integer id) {
        return cidadeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cidade não encontrada"));
    }
    public boolean deletarCidade(Integer id) {
        Optional<Cidade> optionalCidade = cidadeRepository.findById(id);
        if (optionalCidade.isPresent()) {
            Cidade cidade = optionalCidade.get();
            cidadeRepository.delete(cidade);
            return true;
        }
        return false;
    }
}
