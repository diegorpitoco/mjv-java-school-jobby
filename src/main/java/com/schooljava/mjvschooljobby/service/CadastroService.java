package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.repository.CadastroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroService {

    final CadastroRepository cadastroRepository;

}
