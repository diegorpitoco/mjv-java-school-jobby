package com.schooljava.mjvschooljobby.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Table(name = "profissao")
public class Profissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_profissao")
    private Integer idProfissao;

    @Column(name = "nome")
    private String nome;

}
