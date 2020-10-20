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
	private Long idFuncionarioModel;
	@Column
	private String nomeFuncionarioModel;
	@Column
	private String senhaFuncionarioModel;
	@Column
	private String loginFuncionarioModel;
	@Column
	private String codigoHospitalFuncionarioModel;
	
	@ManyToOne
	@JsonIgnoreProperties("funcionario")
	private HospitalModel hospital;
	
	//Getters and Setters

	public Long getIdFuncionarioModel() {
		return idFuncionarioModel;
	}

	public void setIdFuncionarioModel(Long idFuncionarioModel) {
		this.idFuncionarioModel = idFuncionarioModel;
	}

	public String getNomeFuncionarioModel() {
		return nomeFuncionarioModel;
	}

	public void setNomeFuncionarioModel(String nomeFuncionarioModel) {
		this.nomeFuncionarioModel = nomeFuncionarioModel;
	}

	public String getSenhaFuncionarioModel() {
		return senhaFuncionarioModel;
	}

	public void setSenhaFuncionarioModel(String senhaFuncionarioModel) {
		this.senhaFuncionarioModel = senhaFuncionarioModel;
	}

	public String getLoginFuncionarioModel() {
		return loginFuncionarioModel;
	}

	public void setLoginFuncionarioModel(String loginFuncionarioModel) {
		this.loginFuncionarioModel = loginFuncionarioModel;
	}

	public String getCodigoHospitalFuncionarioModel() {
		return codigoHospitalFuncionarioModel;
	}

	public void setCodigoHospitalFuncionarioModel(String codigoHospitalFuncionarioModel) {
		this.codigoHospitalFuncionarioModel = codigoHospitalFuncionarioModel;
	}

	public HospitalModel getHospital() {
		return hospital;
	}

	public void setHospital(HospitalModel hospital) {
		this.hospital = hospital;
	}
			
}
