package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {
}
