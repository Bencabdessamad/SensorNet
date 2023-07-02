package com.example.demo.donnees;

import java.sql.Timestamp;



public class DonneesDTO {
		
	private int id;
	private String reference;
	private int valeur;
	private Timestamp  date;
	private String type;
	public DonneesDTO(int id, String reference, int valeur, Timestamp date, String type) {
		
		this.id = id;
		this.reference = reference;
		this.valeur = valeur;
		this.date = date;
		this.type = type;
	}
	public DonneesDTO() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "DonneesDTO [id=" + id + ", reference=" + reference + ", valeur=" + valeur + ", date=" + date + ", type=" + type + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	

}
