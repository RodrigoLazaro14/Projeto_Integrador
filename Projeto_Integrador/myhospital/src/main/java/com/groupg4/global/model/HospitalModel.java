package com.groupg4.global.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_hospital")
public class HospitalModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long idHospital;
	@Column
	private String nomeHospital;
	@Column
	private String enderecoHospital;
	@Column
	private String codigoHospital;
	
	@OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("hospital")
	private List<CategoriaModel> categoria;
	
	//Getters and Setters
	
	public Long getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(Long idHospital) {
		this.idHospital = idHospital;
	}
	public String getNomeHospital() {
		return nomeHospital;
	}
	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	public String getEnderecoHospital() {
		return enderecoHospital;
	}
	public void setEnderecoHospital(String enderecoHospital) {
		this.enderecoHospital = enderecoHospital;
	}
	public String getCodigoHospital() {
		return codigoHospital;
	}
	public void setCodigoHospital(String codigoHospital) {
		this.codigoHospital = codigoHospital;
	}
	public List<CategoriaModel> getCategoria() {
		return categoria;
	}
	public void setCategoria(List<CategoriaModel> categoria) {
		this.categoria = categoria;
	}
	
}
