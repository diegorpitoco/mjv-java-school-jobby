<<<<<<< HEAD
//package com.schooljava.mjvschooljobby.model;
//
//public class PretensaoSalarial {
//
//    private Double valorMinimo;
//    private Double valorMaximo;
//
//}
=======
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
>>>>>>> 5a1a9bfaf14ab0c48ca6c19c90094f99e159f62f
