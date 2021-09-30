package com.desafio.rebeldes.services.rebelde;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio.rebeldes.domain.models.RebeldeItem;
import com.desafio.rebeldes.domain.repositories.RebeldeItemRepository;

@Service
public class RebeldeItemServiceImpl implements RebeldeItemServce {
	
	private RebeldeItemRepository repository;
	
	public RebeldeItemServiceImpl(RebeldeItemRepository repository) {
		this.repository = repository;
	}


	@Override
	public Iterable<RebeldeItem> criar(List<RebeldeItem> rebeldeItens) {
		return repository.saveAll(rebeldeItens);
	}

}
