package com.stefanini.model;
// Generated 07/11/2016 12:04:55 by Hibernate Tools 4.3.1.Final

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Veiculos generated by hbm2java
 */
@Entity
@Table(name = "veiculos", catalog = "hackathon")
public class Veiculos implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "placa", unique = true, nullable = false, length = 7)
	private String placa;
	@ManyToOne
	private Proprietario proprietario;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idModelo")
	private Modelo idModelo;
	@Column(name = "uf", nullable = false, length = 2)
	private String uf;

	public Veiculos() {
	}

	public Veiculos(String placa, Proprietario cpfProprietario, Modelo idModelo, String uf) {
		this.placa = placa;
		this.proprietario = cpfProprietario;
		this.idModelo = idModelo;
		this.uf = uf;
	}

	
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public Proprietario getProprietario() {
		return this.proprietario;
	}

	public void setProprietario(Proprietario cpfProprietario) {
		this.proprietario = cpfProprietario;
	}

	//@Column(name = "idModelo", nullable = false)
	public Modelo getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(Modelo idModelo) {
		this.idModelo = idModelo;
	}

	
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
