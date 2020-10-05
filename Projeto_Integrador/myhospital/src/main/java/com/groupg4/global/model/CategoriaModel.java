package com.groupg4.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE) //Faz com que o ID seja auto increment, e também já indica que é uma chave primaria (PRIMARY KEY).
	private Long id_categoria;
	@Column
	private boolean clinico_geral;
	@Column
	private double preco_clinico_geral;
	@Column
	private boolean cirugiao_geral;
	@Column
	private double preco_cirugiao_geral;
	@Column
	private boolean endocrinologia;
	@Column
	private double preco_endocrinologia;
	@Column
	private boolean ginecolociaObstetricia;
	@Column
	private double preco_ginecolociaObstetricia;
	@Column
	private boolean neurologia;
	@Column
	private double preco_neurologia;
	@Column
	private Long fk_id_hospital;
	
	//Getters and Setters
	
	public boolean isClinico_geral() {
		return clinico_geral;
	}
	public void setClinico_geral(boolean clinico_geral) {
		this.clinico_geral = clinico_geral;
	}
	public double getPreco_clinico_geral() {
		return preco_clinico_geral;
	}
	public void setPreco_clinico_geral(double preco_clinico_geral) {
		this.preco_clinico_geral = preco_clinico_geral;
	}
	public boolean isCirugiao_geral() {
		return cirugiao_geral;
	}
	public void setCirugiao_geral(boolean cirugiao_geral) {
		this.cirugiao_geral = cirugiao_geral;
	}
	public double getPreco_cirugiao_geral() {
		return preco_cirugiao_geral;
	}
	public void setPreco_cirugiao_geral(double preco_cirugiao_geral) {
		this.preco_cirugiao_geral = preco_cirugiao_geral;
	}
	public boolean isEndocrinologia() {
		return endocrinologia;
	}
	public void setEndocrinologia(boolean endocrinologia) {
		this.endocrinologia = endocrinologia;
	}
	public double getPreco_endocrinologia() {
		return preco_endocrinologia;
	}
	public void setPreco_endocrinologia(double preco_endocrinologia) {
		this.preco_endocrinologia = preco_endocrinologia;
	}
	public boolean isGinecolociaObstetricia() {
		return ginecolociaObstetricia;
	}
	public void setGinecolociaObstetricia(boolean ginecolociaObstetricia) {
		this.ginecolociaObstetricia = ginecolociaObstetricia;
	}
	public double getPreco_ginecolociaObstetricia() {
		return preco_ginecolociaObstetricia;
	}
	public void setPreco_ginecolociaObstetricia(double preco_ginecolociaObstetricia) {
		this.preco_ginecolociaObstetricia = preco_ginecolociaObstetricia;
	}
	public boolean isNeurologia() {
		return neurologia;
	}
	public void setNeurologia(boolean neurologia) {
		this.neurologia = neurologia;
	}
	public double getPreco_neurologia() {
		return preco_neurologia;
	}
	public void setPreco_neurologia(double preco_neurologia) {
		this.preco_neurologia = preco_neurologia;
	}
	public Long getFk_id_hospital() {
		return fk_id_hospital;
	}
	public void setFk_id_hospital(Long fk_id_hospital) {
		this.fk_id_hospital = fk_id_hospital;
	}
	public Long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}
		

}
