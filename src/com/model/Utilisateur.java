package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String adress;

	@Temporal(TemporalType.DATE)
	private Date dtcreationmotdepass;

	@Temporal(TemporalType.DATE)
	private Date dtmodificationmotdepass;

	private String email;

	private String localite;

	private String login;

	private String matricule;

	private String motdepass;

	private String nom;

	private String pays;

	private String poste;

	private String prenom;

	private String statu;

	private String tel;

	private String ville;

	private String zip;

	public Utilisateur() {
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

	public Date getDtcreationmotdepass() {
		return this.dtcreationmotdepass;
	}

	public void setDtcreationmotdepass(Date dtcreationmotdepass) {
		this.dtcreationmotdepass = dtcreationmotdepass;
	}

	public Date getDtmodificationmotdepass() {
		return this.dtmodificationmotdepass;
	}

	public void setDtmodificationmotdepass(Date dtmodificationmotdepass) {
		this.dtmodificationmotdepass = dtmodificationmotdepass;
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

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMotdepass() {
		return this.motdepass;
	}

	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
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

	public String getStatu() {
		return this.statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
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