package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the compteur database table.
 * 
 */
@Entity
@NamedQuery(name="Compteur.findAll", query="SELECT c FROM Compteur c")
public class Compteur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int code;

	@Temporal(TemporalType.DATE)
	private Date dtactivation;

	private String marque;

	private int num;

	//bi-directional many-to-one association to Consomation
	@OneToMany(mappedBy="compteur")
	private List<Consomation> consomations;

	public Compteur() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getDtactivation() {
		return this.dtactivation;
	}

	public void setDtactivation(Date dtactivation) {
		this.dtactivation = dtactivation;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public List<Consomation> getConsomations() {
		return this.consomations;
	}

	public void setConsomations(List<Consomation> consomations) {
		this.consomations = consomations;
	}

	public Consomation addConsomation(Consomation consomation) {
		getConsomations().add(consomation);
		consomation.setCompteur(this);

		return consomation;
	}

	public Consomation removeConsomation(Consomation consomation) {
		getConsomations().remove(consomation);
		consomation.setCompteur(null);

		return consomation;
	}

}