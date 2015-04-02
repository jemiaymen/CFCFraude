package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the abonnee database table.
 * 
 */
@Entity
@NamedQuery(name="Abonnee.findAll", query="SELECT a FROM Abonnee a")
public class Abonnee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String adress;

	private String code;

	private String email;

	private String localite;

	private String nom;

	private String pays;

	private String poste;

	private String prenom;

	private String tel;

	private String ville;

	private String zip;

	public Abonnee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocalite() {
		return this.localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getPoste() {
		return this.poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}