package com.groupg4.global.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_usuario")
public class UsuarioModel {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Auto increment e PRIMARY KEY.
	private Long idUsuarioModel;
		
	@NotNull
	private String nomeUsuarioModel;
	
	@NotNull
	private String loginUsuarioModel;
	
	@NotNull
	private String senhaUsuarioModel;
	
//	private boolean tipoUsuario;

//	private enum tipoUsuario {paciente, funcionario}

/*	
	@ManyToOne
	@JsonIgnoreProperties("funcionario")
	private HospitalModel hospital;	
*/	
	//Getters and Setters
	
	public Long getIdUsuarioModel() {
		return idUsuarioModel;
	}

	public void setIdUsuarioModel(Long idUsuarioModel) {
		this.idUsuarioModel = idUsuarioModel;
	}

	public String getNomeUsuarioModel() {
		return nomeUsuarioModel;
	}

	public void setNomeUsuarioModel(String nomeUsuarioModel) {
		this.nomeUsuarioModel = nomeUsuarioModel;
	}

	public String getLoginUsuarioModel() {
		return loginUsuarioModel;
	}

	public void setLoginUsuarioModel(String loginUsuarioModel) {
		this.loginUsuarioModel = loginUsuarioModel;
	}

	public String getSenhaUsuarioModel() {
		return senhaUsuarioModel;
	}

	public void setSenhaUsuarioModel(String senhaUsuarioModel) {
		this.senhaUsuarioModel = senhaUsuarioModel;
	}

}