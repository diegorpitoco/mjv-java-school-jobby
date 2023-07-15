package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import jakarta.persistence.*;
@Entity
@Table(name = "tb_habilidade")
@Data
public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
}
