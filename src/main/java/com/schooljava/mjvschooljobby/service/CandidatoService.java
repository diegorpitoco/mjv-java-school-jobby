package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.repository.CandidatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidatoService {

    final CandidatoRepository cadastroRepository;

}
