package com.desafio.rebeldes.api.dtos;

import java.util.List;

import com.desafio.rebeldes.domain.enuns.GeneroEnum;

public class RebeldeDTO {
	private String nome;
	private Integer idade;
	private GeneroEnum genero;
	private String longitude;
	private String latitude;
	private String galaxia;

	private List<RebeldeItemDTO> Itens;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getGalaxia() {
		return galaxia;
	}

	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}

	public List<RebeldeItemDTO> getItens() {
		return Itens;
	}

	public void setItens(List<RebeldeItemDTO> itens) {
		Itens = itens;
	}



}
