package com.filipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filipe.model.Pergunta;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {

}
