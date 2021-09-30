package com.desafio.rebeldes.services.rebelde;

import com.desafio.rebeldes.api.dtos.RebeldeDTO;
import com.desafio.rebeldes.api.response.Response;
import com.desafio.rebeldes.domain.models.RebeldeEntity;

public interface RebeldeService {
	Response<RebeldeEntity> criar(RebeldeDTO dto);
}
