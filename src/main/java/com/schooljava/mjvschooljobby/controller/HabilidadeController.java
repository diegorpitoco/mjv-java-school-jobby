package com.schooljava.mjvschooljobby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeController {

    @Autowired
    private HabilidadeService habilidadeService;
}
