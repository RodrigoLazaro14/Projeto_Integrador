package com.groupg4.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "tb_hospital")
public class HospitalModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long idHospital;
	@Column
	private String nomeHospital;
	@Column
	private String enderecoHospital;
	@Column
	private String codigoHospital;
	
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
	
}
