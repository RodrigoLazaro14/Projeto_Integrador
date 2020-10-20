package com.groupg4.global.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_usuario")
public class UsuarioModel {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Auto increment ePRIMARY KEY.
	private Long idUsuarioModel;
		
	@NotNull
	private String nomeUsuarioModel;
	
	@NotNull
	private String loginUsuarioModel;
	
	@NotNull
	private String senhaUsuarioModel;

//---------------------TALVEZ SEJAM RETIRADOS----------------------------------------
	
	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataNascimentoUsuarioModel;
	
	@NotNull
	private String enderecoUsuarioModel;
	
	private String telefoneUsuarioModel;
	
	@NotNull
	private String celularUsuarioModel;
	
	@NotNull
	private String rgUsuarioModel;
	
	@NotNull
	private String cpfUsuarioModel;
	
	@NotNull
	private String sexoUsuarioModel;

//-----------------------------------------------------------------------------------
	
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

//---------------------TALVEZ SEJAM RETIRADOS----------------------------------------
		
	
	public Date getDataNascimentoUsuarioModel() {
		return dataNascimentoUsuarioModel;
	}

	public void setDataNascimentoUsuarioModel(Date dataNascimentoUsuarioModel) {
		this.dataNascimentoUsuarioModel = dataNascimentoUsuarioModel;
	}

	public String getEnderecoUsuarioModel() {
		return enderecoUsuarioModel;
	}

	public void setEnderecoUsuarioModel(String enderecoUsuarioModel) {
		this.enderecoUsuarioModel = enderecoUsuarioModel;
	}

	public String getTelefoneUsuarioModel() {
		return telefoneUsuarioModel;
	}

	public void setTelefoneUsuarioModel(String telefoneUsuarioModel) {
		this.telefoneUsuarioModel = telefoneUsuarioModel;
	}

	public String getCelularUsuarioModel() {
		return celularUsuarioModel;
	}

	public void setCelularUsuarioModel(String celularUsuarioModel) {
		this.celularUsuarioModel = celularUsuarioModel;
	}

	public String getRgUsuarioModel() {
		return rgUsuarioModel;
	}

	public void setRgUsuarioModel(String rgUsuarioModel) {
		this.rgUsuarioModel = rgUsuarioModel;
	}

	public String getCpfUsuarioModel() {
		return cpfUsuarioModel;
	}

	public void setCpfUsuarioModel(String cpfUsuarioModel) {
		this.cpfUsuarioModel = cpfUsuarioModel;
	}

	public String getSexoUsuarioModel() {
		return sexoUsuarioModel;
	}

	public void setSexoUsuarioModel(String sexoUsuarioModel) {
		this.sexoUsuarioModel = sexoUsuarioModel;
	}

//-----------------------------------------------------------------------------------

}