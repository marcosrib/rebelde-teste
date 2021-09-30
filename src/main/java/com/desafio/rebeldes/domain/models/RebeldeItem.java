package com.desafio.rebeldes.domain.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rebelde_itens")
public class RebeldeItem  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8601335771190778898L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantidade;

	@JoinColumn(name = "rebelde_id", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY)
	private RebeldeEntity rebeldes;
	@JoinColumn(name = "itens_id", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Item itens;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public RebeldeEntity getRebeldes() {
		return rebeldes;
	}

	public void setRebeldes(RebeldeEntity rebeldes) {
		this.rebeldes = rebeldes;
	}

	public Item getItens() {
		return itens;
	}

	public void setItens(Item itens) {
		this.itens = itens;
	}

}
