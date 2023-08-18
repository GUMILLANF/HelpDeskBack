package com.ifsp.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifsp.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
