package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissaoRepository extends JpaRepository<Profissao, Integer> {
}
