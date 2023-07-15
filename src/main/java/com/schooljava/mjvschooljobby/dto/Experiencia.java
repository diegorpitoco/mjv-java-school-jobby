package com.schooljava.mjvschooljobby.dto;

import com.schooljava.mjvschooljobby.enums.RegimeContratacao;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Experiencia {
    private Integer idExperiencia;
    private double salario;
    private boolean empregoAtual;
    private LocalDate dataContratacao;
    private LocalDate dataDesligamento;
    private String empresa;
    private RegimeContratacao regimeContratacao;

    public Experiencia(Experiencia experiencia) {
        this.salario = experiencia.getSalario();
        this.empregoAtual = experiencia.isEmpregoAtual();
        this.dataContratacao = experiencia.getDataContratacao();
        this.dataDesligamento = experiencia.getDataDesligamento();
        this.empresa = experiencia.getEmpresa();
        this.regimeContratacao = experiencia.getRegimeContratacao();
    }
}
