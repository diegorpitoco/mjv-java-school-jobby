package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Embeddable
public class Endereco {

    @Column(nullable = false)
    private Long cep;

    @Column(nullable = false)
    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    @OneToOne(cascade = CascadeType.ALL)
    private Cidade cidade;


}
