package com.ifsp.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifsp.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
