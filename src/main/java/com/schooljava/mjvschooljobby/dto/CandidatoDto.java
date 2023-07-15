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
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> e46a11dc5ff32db66c458ea0df59be02130152b0

@Data

public class CandidatoDto {


    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
<<<<<<< HEAD
    private Contato contato;
    private Endereco endereco;
    private Profissao profissao;
    private Experiencia experiencia;
    private PretensaoSalarial pretensaoSalarial;

=======
//    private Contato contato;
//    private Endereco endereco;
//    private Profissao profissao;
//    private Experiencia experiencia;
//    private PretensaoSalarial pretensaoSalarial;
//    private List<Experiencia> experiencias;
    private List<String> habilidades;
>>>>>>> e46a11dc5ff32db66c458ea0df59be02130152b0
}
