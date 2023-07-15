package com.schooljava.mjvschooljobby.dto;

import com.schooljava.mjvschooljobby.enums.Sexo;
import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.model.Contato;
import com.schooljava.mjvschooljobby.model.Endereco;
import com.schooljava.mjvschooljobby.model.Experiencia;
import com.schooljava.mjvschooljobby.model.PretensaoSalarial;
import com.schooljava.mjvschooljobby.model.Profissao;
import lombok.Data;


import java.time.LocalDate;

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

}
