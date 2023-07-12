package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
