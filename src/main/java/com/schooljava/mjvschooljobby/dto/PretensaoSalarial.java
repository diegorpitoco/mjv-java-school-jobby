package com.schooljava.mjvschooljobby.dto;


import lombok.Data;

@Data
public class PretensaoSalarial {

    private Double valorMinimo;
    private Double valorMaximo;


    public PretensaoSalarial(PretensaoSalarial pretensaoSalarial) {
        this.valorMinimo = pretensaoSalarial.getValorMinimo();
        this.valorMaximo = pretensaoSalarial.getValorMaximo();
    }
}
