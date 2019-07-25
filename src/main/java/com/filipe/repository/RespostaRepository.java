package com.filipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filipe.model.Resposta;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Long> {

}
