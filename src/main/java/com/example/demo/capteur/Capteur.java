package com.example.demo.capteur;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="capteurs")

public class Capteur {
		
	@Id
    @Column(name="id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int capteurid;
    @Column(name="reference", length = 255)
    private String reference;
    @Column(name="type", length = 255)
    private String type;
    @Column(name="valeur", length = 255)
    private int valeur;
	public Capteur(int capteurid, String reference, String type, int valeur) {
		this.capteurid = capteurid;
		this.reference = reference;
		this.type = type;
		this.valeur = valeur;
	}
	public Capteur() {
	}
	public int getCapteurid() {
		return capteurid;
	}
	 public int getValeur() {
                return valeur;
        }
	public void setValeur(int valeur) {
                this.valeur = valeur;
        }

	public void setCapteurid(int capteurid) {
		this.capteurid = capteurid;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Capteur [capteurid=" + capteurid + ", reference=" + reference + ", type=" + type + ", valeur=" + valeur + "]";
	}
	
    
    

}
