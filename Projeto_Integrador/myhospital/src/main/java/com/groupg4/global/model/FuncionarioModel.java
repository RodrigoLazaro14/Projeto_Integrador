package com.groupg4.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="tb_funcionario")
public class FuncionarioModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long idFuncionario;
	@Column
	private String nomeFuncionario;
	@Column
	private String senhaFuncionario;
	@Column
	private String loginFuncionario;
	@Column
	private String codigoHospitalFuncionario;
	
	@ManyToOne
	@JsonIgnoreProperties("funcionario")
	private HospitalModel hospital;
	
	//Getters and Setters
	
	public Long getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getSenhaFuncionario() {
		return senhaFuncionario;
	}
	public void setSenhaFuncionario(String senhaFuncionario) {
		this.senhaFuncionario = senhaFuncionario;
	}
	public String getLoginFuncionario() {
		return loginFuncionario;
	}
	public void setLoginFuncionario(String loginFuncionario) {
		this.loginFuncionario = loginFuncionario;
	}
	public String getCodigoHospitalFuncionario() {
		return codigoHospitalFuncionario;
	}
	public void setCodigoHospitalFuncionario(String codigoHospitalFuncionario) {
		this.codigoHospitalFuncionario = codigoHospitalFuncionario;
	}
	public HospitalModel getHospital() {
		return hospital;
	}
	public void setHospital(HospitalModel hospital) {
		this.hospital = hospital;
	}
		
}
