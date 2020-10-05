package com.groupg4.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class HospitalModel {
	
	@Entity
	@Table(name="tb_hospital")
	public class ServicoModel 
	{
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
		private Long id_hospital;
		@Column
		private String nome_hospital;
		@Column
		private String endereco_hospital;
		@Column
		private String codigo_hospital;
		
		//Getters and Setters
		
		public Long getId_hospital() {
			return id_hospital;
		}
		public void setId_hospital(Long id_hospital) {
			this.id_hospital = id_hospital;
		}
		public String getNome_hospital() {
			return nome_hospital;
		}
		public void setNome_hospital(String nome_hospital) {
			this.nome_hospital = nome_hospital;
		}
		public String getEndereco_hospital() {
			return endereco_hospital;
		}
		public void setEndereco_hospital(String endereco_hospital) {
			this.endereco_hospital = endereco_hospital;
		}
		public String getCodigo_hospital() {
			return codigo_hospital;
		}
		public void setCodigo_hospital(String codigo_hospital) {
			this.codigo_hospital = codigo_hospital;
		}
				
	}

}
