package com.groupg4.global.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Faz com que o ID seja auto increment, e também já indica que
														// é uma chave primaria (PRIMARY KEY).
	private Long idCategoria;

	@NotNull
	private String nomeCategoria;

	@NotNull
	private String descricaoCategoria;

	@NotNull
	private double precoCategoria;

	@ManyToMany(mappedBy = "categorias", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<HospitalModel> hospitais;

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable( name = "categoria", joinColumns = @JoinColumn(name =
	 * "idHospital"), inverseJoinColumns = @JoinColumn(name = "idCategoria"))
	 * private List<HospitalModel> hospital;
	 * 
	 * @ManyToMany
	 * 
	 * @JsonIgnoreProperties("categoria") private List<HospitalModel> hospital;
	 */

	// Getters and Setters

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

	public List<HospitalModel> getHospitais() {
		return hospitais;
	}

	public void setHospitais(List<HospitalModel> hospitais) {
		this.hospitais = hospitais;
	}

}
