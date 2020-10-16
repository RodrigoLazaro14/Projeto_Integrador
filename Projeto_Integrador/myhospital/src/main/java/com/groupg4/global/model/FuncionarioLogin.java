package com.groupg4.global.model;

public class FuncionarioLogin {

	private String nome;

	private String emailFuncionario;

	private String senha;
	
	private String codigoHospital;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return emailFuncionario;
	}

	public void setUsuario(String usuario) {
		this.emailFuncionario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCodigoHospital() {
		return codigoHospital;
	}

	public void setCodigoHospital(String codigoHospital) {
		this.codigoHospital = codigoHospital;
	}
}