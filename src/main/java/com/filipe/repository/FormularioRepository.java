package com.filipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filipe.model.Formulario;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Long> {

}
