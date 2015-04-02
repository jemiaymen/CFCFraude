package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the consomation database table.
 * 
 */
@Entity
@NamedQuery(name="Consomation.findAll", query="SELECT c FROM Consomation c")
public class Consomation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int caindex;

	private int clocatcptr;

	private int cnindex;

	private BigDecimal coef;

	private int conso;

	private int cprimefix;

	private String creleve;

	private BigDecimal mconso;

	private int nbrmoi;

	//bi-directional many-to-one association to Compteur
	@ManyToOne
	@JoinColumn(name="cid")
	private Compteur compteur;

	public Consomation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCaindex() {
		return this.caindex;
	}

	public void setCaindex(int caindex) {
		this.caindex = caindex;
	}

	public int getClocatcptr() {
		return this.clocatcptr;
	}

	public void setClocatcptr(int clocatcptr) {
		this.clocatcptr = clocatcptr;
	}

	public int getCnindex() {
		return this.cnindex;
	}

	public void setCnindex(int cnindex) {
		this.cnindex = cnindex;
	}

	public BigDecimal getCoef() {
		return this.coef;
	}

	public void setCoef(BigDecimal coef) {
		this.coef = coef;
	}

	public int getConso() {
		return this.conso;
	}

	public void setConso(int conso) {
		this.conso = conso;
	}

	public int getCprimefix() {
		return this.cprimefix;
	}

	public void setCprimefix(int cprimefix) {
		this.cprimefix = cprimefix;
	}

	public String getCreleve() {
		return this.creleve;
	}

	public void setCreleve(String creleve) {
		this.creleve = creleve;
	}

	public BigDecimal getMconso() {
		return this.mconso;
	}

	public void setMconso(BigDecimal mconso) {
		this.mconso = mconso;
	}

	public int getNbrmoi() {
		return this.nbrmoi;
	}

	public void setNbrmoi(int nbrmoi) {
		this.nbrmoi = nbrmoi;
	}

	public Compteur getCompteur() {
		return this.compteur;
	}

	public void setCompteur(Compteur compteur) {
		this.compteur = compteur;
	}

}