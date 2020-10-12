package com.groupg4.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_funcionario")
public class FuncionarioModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long idFuncionario;
	@Column
	private String nomeFuncionario;
	@Column
	private String senhaFuncionario;
	@Column
	private String emailFuncionario;
	@Column
	private String codigoHospitalFuncionario;
	
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
	public String getEmailFuncionario() {
		return emailFuncionario;
	}
	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}
	public String getCodigoHospitalFuncionario() {
		return codigoHospitalFuncionario;
	}
	public void setCodigoHospitalFuncionario(String codigoHospitalFuncionario) {
		this.codigoHospitalFuncionario = codigoHospitalFuncionario;
	}
	
}
