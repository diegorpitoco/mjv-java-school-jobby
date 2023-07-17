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
import java.util.stream.Collectors;

@Service
public class EmpresaService {

    private EmpresaRepository empresaRepository;
    private ModelMapper modelMapper;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository, ModelMapper modelMapper) {
        this.empresaRepository = empresaRepository;
        this.modelMapper = modelMapper;
    }

    public EmpresaDto cadastrarEmpresa(EmpresaDto empresaDto) {
        Empresa empresa = modelMapper.map(empresaDto, Empresa.class);
        Empresa novaEmpresa = empresaRepository.save(empresa);
        return modelMapper.map(novaEmpresa, EmpresaDto.class);
    }

    public List<EmpresaDto> listarEmpresas() {
        List<Empresa> empresas = empresaRepository.findAll();
        return empresas.stream()
                .map(empresa -> modelMapper.map(empresa, EmpresaDto.class))
                .collect(Collectors.toList());
    }
    public EmpresaDto buscarEmpresaId(Integer id) {
        Empresa empresa = empresaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Empresa não encontrada"));
        return modelMapper.map(empresa, EmpresaDto.class);
    }
    public boolean deletarEmpresa(Integer id) {
        Optional<Empresa> optionalEmpresa = empresaRepository.findById(id);
        if (optionalEmpresa.isPresent()) {
            Empresa empresa = optionalEmpresa.get();
            empresaRepository.delete(empresa);
            return true;
        }
        return false;
    }
}
