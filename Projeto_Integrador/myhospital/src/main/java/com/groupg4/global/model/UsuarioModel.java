package com.groupg4.global.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="tb_usuario")
public class UsuarioModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long idUsuario;
	@Column
	private String nomeCompleto;
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataNascimento;
	@Column
	private String enderecoUsuario;
	@Column
	private String telefoneUsuario;
	@Column
	private String celularUsuario;
	@Column
	private String rgUsuario;
	@Column
	private String cpfUsuario;
	@Column
	private String sexoUsuario;
	@Column
	private String emailUsuario;
	@Column
	private String senhaUsuario;
	
	//Getters and Setters
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEnderecoUsuario() {
		return enderecoUsuario;
	}
	public void setEnderecoUsuario(String enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}
	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}
	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}
	public String getCelularUsuario() {
		return celularUsuario;
	}
	public void setCelularUsuario(String celularUsuario) {
		this.celularUsuario = celularUsuario;
	}
	public String getRgUsuario() {
		return rgUsuario;
	}
	public void setRgUsuario(String rgUsuario) {
		this.rgUsuario = rgUsuario;
	}
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	public String getSexoUsuario() {
		return sexoUsuario;
	}
	public void setSexoUsuario(String sexoUsuario) {
		this.sexoUsuario = sexoUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
}
