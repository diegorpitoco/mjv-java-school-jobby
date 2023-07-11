package com.schooljava.mjvschooljobby.model;

import com.schooljava.mjvschooljobby.enums.RegimeContratacao;

import java.time.LocalDate;

public class Experiencia {

    private Integer idExperiencia;
    private double salario;
    private boolean empregoAtual;
    private LocalDate dataContratacao;
    private LocalDate dataDesligamento;
    private String empresa;
    private RegimeContratacao regimeContratacao;
}
