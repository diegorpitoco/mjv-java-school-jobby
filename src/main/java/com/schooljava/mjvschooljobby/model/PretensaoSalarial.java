package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Embeddable
public class PretensaoSalarial {

    @Column(nullable = false)
    private Double valorMinimo;

    @Column(nullable = false)
    private Double valorMaximo;

}
