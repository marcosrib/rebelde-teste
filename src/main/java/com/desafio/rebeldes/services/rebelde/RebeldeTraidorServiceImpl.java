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
	public void marcarRebeldeTraidor(Integer idRebelde, Integer idRebeldeTraidor) {
		Optional<RebeldeTraidor> rebeldeTraidorResultado = repository.findByRebeldeIdAndRebeldeTraidorId(idRebelde, idRebeldeTraidor);
		if( !rebeldeTraidorResultado.isEmpty() &&
				idRebeldeTraidor.equals(rebeldeTraidorResultado.get().getRebeldeTraidor().getId())) {
			throw new NotFoundException("Você já marcou rebelde como traidor!") ;
		}
		RebeldeEntity rebeldeEntity = new RebeldeEntity();
		rebeldeEntity.setId(idRebelde);
		
		RebeldeEntity rebeldeEntityTraidor = new RebeldeEntity();
		rebeldeEntityTraidor.setId(idRebeldeTraidor);
		
		RebeldeTraidor rebeldeTraidor = new RebeldeTraidor();
		rebeldeTraidor.setRebelde(rebeldeEntity);
		rebeldeTraidor.setRebeldeTraidor(rebeldeEntityTraidor);
	 repository.save(rebeldeTraidor);
		
	} 

}
