package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Embeddable
public class Endereco {

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    @OneToOne(cascade = CascadeType.ALL)
    private Cidade cidade;


}
