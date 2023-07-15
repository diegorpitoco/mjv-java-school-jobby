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
    private Integer idProfissao;

    @Column(nullable = false)
    private String nome;

}
