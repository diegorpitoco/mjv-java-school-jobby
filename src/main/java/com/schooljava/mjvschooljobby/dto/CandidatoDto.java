package com.schooljava.mjvschooljobby.dto;

import com.schooljava.mjvschooljobby.enums.Sexo;
import com.schooljava.mjvschooljobby.model.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CandidatoDto {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private Contato contato;
    private Endereco endereco;
    private Profissao profissao;
    private Experiencia experiencia;
    private PretensaoSalarial pretensaoSalarial;
    private List<Experiencia> experiencias;
    private List<String> habilidades;
}
