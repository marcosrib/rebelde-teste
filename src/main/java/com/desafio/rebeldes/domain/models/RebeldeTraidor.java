package com.desafio.rebeldes.domain.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rebeldes_traidores")
public class RebeldeTraidor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "rebelde_id")
	private RebeldeEntity rebelde;
	
	@ManyToOne
	@JoinColumn(name = "rebelde_traidor_id")
	private RebeldeEntity rebeldeTraidor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RebeldeEntity getRebelde() {
		return rebelde;
	}

	public void setRebelde(RebeldeEntity rebelde) {
		this.rebelde = rebelde;
	}

	public RebeldeEntity getRebeldeTraidor() {
		return rebeldeTraidor;
	}

	public void setRebeldeTraidor(RebeldeEntity rebeldeTraidor) {
		this.rebeldeTraidor = rebeldeTraidor;
	}
	
	
	

}
