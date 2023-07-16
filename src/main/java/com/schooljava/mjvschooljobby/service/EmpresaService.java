package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.dto.EmpresaDto;
import com.schooljava.mjvschooljobby.model.Empresa;
import com.schooljava.mjvschooljobby.repository.EmpresaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    private final ModelMapper modelMapper;

    public EmpresaService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Empresa cadastrarEmpresa(EmpresaDto empresaDto) {
        Empresa empresa = new Empresa();
        BeanUtils.copyProperties(empresaDto, empresa);
        return empresaRepository.save(empresa);
    }

    public Empresa alterarEmpresa(EmpresaDto empresaDto) {
        Empresa empresa = modelMapper.map(empresaDto, Empresa.class);
        Optional<Empresa> optionalEmpresa = empresaRepository.findById(empresa.getIdEmpresa());

        if (optionalEmpresa.isPresent()) {
            Empresa empresaExistente = optionalEmpresa.get();
            modelMapper.map(empresaDto, empresaExistente);
            return empresaRepository.save(empresaExistente);
        } else {
            throw new IllegalArgumentException("Empresa não encontrada");
        }
    }

    public List<Empresa> listarEmpresa() {
        return empresaRepository.findAll();
    }
    public Empresa buscarEmpresaId(Integer id) {
        return empresaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Empresa não encontrada"));
    }
    public boolean deletarEmrpesa(Integer id) {
        Optional<Empresa> optionalEmpresa = empresaRepository.findById(id);
        if (optionalEmpresa.isPresent()) {
            Empresa empresa = optionalEmpresa.get();
            empresaRepository.delete(empresa);
            return true;
        }
        return false;
    }
}
