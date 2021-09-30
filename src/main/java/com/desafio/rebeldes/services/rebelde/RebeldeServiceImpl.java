package com.desafio.rebeldes.services.rebelde;

import org.springframework.stereotype.Service;

import com.desafio.rebeldes.domain.models.RebeldeEntity;
import com.desafio.rebeldes.domain.repositories.RebeldeRepository;

@Service
public class RebeldeServiceImpl implements RebeldeService {

	private final RebeldeRepository repository;
	
	public RebeldeServiceImpl(RebeldeRepository repository) {
		this.repository = repository;
	}

	@Override
	public RebeldeEntity criar(RebeldeEntity rebelde) {
		return repository.save(rebelde);
	}
 
}
