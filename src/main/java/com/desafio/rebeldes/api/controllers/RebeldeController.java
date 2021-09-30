package com.desafio.rebeldes.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.rebeldes.api.dtos.RebeldeDTO;
import com.desafio.rebeldes.domain.models.RebeldeEntity;
import com.desafio.rebeldes.services.rebelde.RebeldeService;

@RestController
@RequestMapping("/api/")
public class RebeldeController {
	
	private final RebeldeService rebeldeService;
	

	public RebeldeController(RebeldeService rebeldeService) {
		this.rebeldeService = rebeldeService;
	}



	@PostMapping("v1/rebelde")
	@ResponseStatus(code = HttpStatus.CREATED)
	public RebeldeEntity cadastrar(@RequestBody RebeldeDTO dto) {
		
		RebeldeEntity rebelde = new RebeldeEntity();
		rebelde.setNome(dto.getNome());
		rebelde.setGalaxia(dto.getGalaxia());
		rebelde.setGenero(dto.getGenero());
		rebelde.setIdade(dto.getIdade());
		rebelde.setLatitude(dto.getLatitude());
		rebelde.setLongitude(dto.getLongitude());
		
		
		return rebeldeService.criar(rebelde);
		
	}
}