package com.desafio.rebeldes.services.rebelde;

import java.util.List;

import com.desafio.rebeldes.domain.models.RebeldeItem;


public interface RebeldeItemServce {
	
	Iterable<RebeldeItem> criar(List<RebeldeItem> rebeldeItens);
   
}
