package com.schooljava.mjvschooljobby.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "profissao")
public class Profissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfissao;

    @Column(nullable = false)
    private String nome;

}
