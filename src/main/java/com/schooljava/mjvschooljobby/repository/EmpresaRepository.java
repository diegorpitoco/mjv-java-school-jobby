package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
