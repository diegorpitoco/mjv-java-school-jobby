package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.service.CandidatoService;
import com.schooljava.mjvschooljobby.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;
}
