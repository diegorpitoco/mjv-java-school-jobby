package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;
}
