package com.desafio.rebeldes.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.rebeldes.services.rebelde.RebeldeTraidorService;

@RestController
@RequestMapping("/api/")
public class RebeldeTraidorController {
	
	private final RebeldeTraidorService service;
	
	public RebeldeTraidorController(RebeldeTraidorService service) {
		this.service = service;
	}


	@PostMapping("v1/rebelde-traidor/{id-rebelde}/{id-rebelde-traidor}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void marcarRebeldeTraidor(@PathVariable("id-rebelde") Integer idRebelde,@PathVariable("id-rebelde-traidor") Integer idRebeldeTraidor) {
		service.marcarRebeldeTraidor(idRebelde, idRebeldeTraidor);
		
	}

}
