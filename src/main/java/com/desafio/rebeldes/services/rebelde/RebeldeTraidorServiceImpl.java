package com.desafio.rebeldes.services.rebelde;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.desafio.rebeldes.NotFoundException;
import com.desafio.rebeldes.domain.models.RebeldeEntity;
import com.desafio.rebeldes.domain.models.RebeldeTraidor;
import com.desafio.rebeldes.domain.repositories.RebeldeTraidorRepository;

@Service
public class RebeldeTraidorServiceImpl implements RebeldeTraidorService {

	private final RebeldeTraidorRepository repository;

	
	public RebeldeTraidorServiceImpl(RebeldeTraidorRepository repository) {
		this.repository = repository;
	}


	@Override
	@Transactional
	public void marcarRebeldeTraidor(Integer idRebelde) {
		Optional<RebeldeTraidor> rebeldeTraidorResultado = repository.findByRebeldeId(idRebelde);
		if(!rebeldeTraidorResultado.isEmpty()) {
			throw new NotFoundException("Você já marcou rebelde como traidor!") ;
		}
		RebeldeEntity rebeldeEntity = new RebeldeEntity();
		rebeldeEntity.setId(idRebelde);
		RebeldeTraidor rebeldeTraidor = new RebeldeTraidor();
		rebeldeTraidor.setRebelde(rebeldeEntity);
	 repository.save(rebeldeTraidor);
		
	} 

}
