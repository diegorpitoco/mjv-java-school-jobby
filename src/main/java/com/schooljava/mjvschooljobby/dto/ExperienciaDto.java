package com.schooljava.mjvschooljobby.dto;

import com.schooljava.mjvschooljobby.enums.RegimeContratacao;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExperienciaDto {
    private Integer idExperiencia;
    private double salario;
    private boolean empregoAtual;
    private LocalDate dataContratacao;
    private LocalDate dataDesligamento;
    private String empresa;
    private RegimeContratacao regimeContratacao;

}
