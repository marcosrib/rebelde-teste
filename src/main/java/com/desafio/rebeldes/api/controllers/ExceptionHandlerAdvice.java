package com.desafio.rebeldes.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.desafio.rebeldes.NotFoundException;
import com.desafio.rebeldes.api.response.Response;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Response notFoundEcxeption(NotFoundException ex) {
		List<String> responseMenssagem = new ArrayList<>();
		responseMenssagem.add(ex.getMessage());
		return new Response(responseMenssagem);
	}
}
