package com.desafio.rebeldes.domain.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.desafio.rebeldes.domain.enuns.GeneroEnum;

@Entity
@Table(name = "rebeldes")
public class RebeldeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer idade;
	@Enumerated(EnumType.STRING)
	private GeneroEnum genero;
	private String longitude;
	private String latitude;
	private String galaxia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "RebeldeEntity [id=" + id + "]";
	}

}
