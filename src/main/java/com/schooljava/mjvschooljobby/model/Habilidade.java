package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "habilidade")
@Data
public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHabilidade;

    private String nome;

    @ManyToMany(mappedBy = "habilidades")
    private List<Candidato> candidatoList;
}
