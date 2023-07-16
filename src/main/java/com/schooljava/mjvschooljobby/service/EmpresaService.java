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

    public Empresa cadastrarEmpresa(EmpresaDto empresaDto) {
        Empresa empresa = new Empresa();
        BeanUtils.copyProperties(empresaDto, empresa);
        return empresaRepository.save(empresa);
    }

    public List<Empresa> listarEmpresas() {
        return empresaRepository.findAll();
    }
    public Empresa buscarEmpresaId(Integer id) {
        return empresaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Empresa não encontrada"));
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
