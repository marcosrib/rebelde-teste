package com.desafio.rebeldes.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.rebeldes.domain.models.RebeldeEntity;
@Repository
public interface RebeldeRepository extends CrudRepository<RebeldeEntity, Integer> {

}
