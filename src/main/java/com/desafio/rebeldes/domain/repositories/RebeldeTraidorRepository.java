package com.desafio.rebeldes.domain.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.desafio.rebeldes.domain.models.RebeldeTraidor;

public interface RebeldeTraidorRepository extends CrudRepository<RebeldeTraidor, Integer> {
	Optional<RebeldeTraidor>  findByRebeldeIdAndRebeldeTraidorId(Integer id, Integer idTraidor);
}
