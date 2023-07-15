package com.schooljava.mjvschooljobby.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
}
