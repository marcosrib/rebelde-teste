package com.desafio.rebeldes.domain.repositories;

import org.springframework.data.repository.CrudRepository;

import com.desafio.rebeldes.domain.models.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{

}
