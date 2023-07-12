package com.schooljava.mjvschooljobby.model;

import com.schooljava.mjvschooljobby.enums.Sexo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Data
public class Cadastro {

    @Id
    private Integer idCadastro;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    @ManyToOne
    @JoinColumn(name = "contato_id_contato")
    private Contato contato;
    private Endereco endereco;
    private Profissao profissao;
    private Experiencia experiencia;
    private PretensaoSalarial pretensaoSalarial;



}
