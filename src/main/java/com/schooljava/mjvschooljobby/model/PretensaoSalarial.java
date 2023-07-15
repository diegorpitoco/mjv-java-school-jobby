package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Embeddable
public class PretensaoSalarial {

    @Column(nullable = false)
    private Double valorMinimo;

    @Column(nullable = false)
    private Double valorMaximo;

}
