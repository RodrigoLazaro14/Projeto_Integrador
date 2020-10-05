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
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long id_funcionario;
	@Column
	private String nome_funcionario;
	@Column
	private String senha_funcionario;
	@Column
	private String email_funcionario;
	@Column
	private String codigo_hospital_funcionario;
	
	//Getters and Setters
	
	public Long getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getNome_funcionario() {
		return nome_funcionario;
	}
	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}
	public String getSenha_funcionario() {
		return senha_funcionario;
	}
	public void setSenha_funcionario(String senha_funcionario) {
		this.senha_funcionario = senha_funcionario;
	}
	public String getEmail_funcionario() {
		return email_funcionario;
	}
	public void setEmail_funcionario(String email_funcionario) {
		this.email_funcionario = email_funcionario;
	}
	public String getCodigo_hospital_funcionario() {
		return codigo_hospital_funcionario;
	}
	public void setCodigo_hospital_funcionario(String codigo_hospital_funcionario) {
		this.codigo_hospital_funcionario = codigo_hospital_funcionario;
	}

}
