package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.service.CandidatoService;
import com.schooljava.mjvschooljobby.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;
}