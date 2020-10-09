package com.groupg4.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long idCategoria;
	
	@NotNull
	private String nomeCategoria;
	
	@NotNull
	private String descricaoCategoria;
	
	@NotNull
	private double precoCategoria;

	//Getters and Setters
	
	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public double getPrecoCategoria() {
		return precoCategoria;
	}

	public void setPrecoCategoria(double precoCategoria) {
		this.precoCategoria = precoCategoria;
	}
		

}
