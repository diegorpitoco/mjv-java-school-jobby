package com.schooljava.mjvschooljobby.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCidade;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String estado;

    private String sigla;
}
