package com.groupg4.global.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UsuarioModel {
	
	@Entity
	@Table(name="tb_usuario")
	public class ServicoModel 
	{
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
		private Long id_usuario;
		@Column
		private String nome_completo;
		@Column
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date data_nascimento;
		@Column
		private String endereco_usuario;
		@Column
		private String telefone_usuario;
		@Column
		private String celular_usuario;
		@Column
		private String rg_usuario;
		@Column
		private String cpf_usuario;
		@Column
		private String sexo_usuario;
		@Column
		private String email_usuario;
		@Column
		private String senha_usuario;
		
		//Getters and Setters
		
		public Long getId_usuario() {
			return id_usuario;
		}
		public void setId_usuario(Long id_usuario) {
			this.id_usuario = id_usuario;
		}
		public String getNome_completo() {
			return nome_completo;
		}
		public void setNome_completo(String nome_completo) {
			this.nome_completo = nome_completo;
		}
		public Date getData_nascimento() {
			return data_nascimento;
		}
		public void setData_nascimento(Date data_nascimento) {
			this.data_nascimento = data_nascimento;
		}
		public String getEndereco_usuario() {
			return endereco_usuario;
		}
		public void setEndereco_usuario(String endereco_usuario) {
			this.endereco_usuario = endereco_usuario;
		}
		public String getTelefone_usuario() {
			return telefone_usuario;
		}
		public void setTelefone_usuario(String telefone_usuario) {
			this.telefone_usuario = telefone_usuario;
		}
		public String getCelular_usuario() {
			return celular_usuario;
		}
		public void setCelular_usuario(String celular_usuario) {
			this.celular_usuario = celular_usuario;
		}
		public String getRg_usuario() {
			return rg_usuario;
		}
		public void setRg_usuario(String rg_usuario) {
			this.rg_usuario = rg_usuario;
		}
		public String getCpf_usuario() {
			return cpf_usuario;
		}
		public void setCpf_usuario(String cpf_usuario) {
			this.cpf_usuario = cpf_usuario;
		}
		public String getSexo_usuario() {
			return sexo_usuario;
		}
		public void setSexo_usuario(String sexo_usuario) {
			this.sexo_usuario = sexo_usuario;
		}
		public String getEmail_usuario() {
			return email_usuario;
		}
		public void setEmail_usuario(String email_usuario) {
			this.email_usuario = email_usuario;
		}
		public String getSenha_usuario() {
			return senha_usuario;
		}
		public void setSenha_usuario(String senha_usuario) {
			this.senha_usuario = senha_usuario;
		}

	}

}
