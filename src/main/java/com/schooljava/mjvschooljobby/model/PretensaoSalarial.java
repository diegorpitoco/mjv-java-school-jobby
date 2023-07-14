package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Embeddable
public class PretensaoSalarial {

    @Column(name = "vl_min")
    private Double valorMinimo;

    @Column(name = "vl_max")
    private Double valorMaximo;

}
