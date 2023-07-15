package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    CandidatoRepository candidatoRepository;

}
