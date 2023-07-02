package com.example.demo.donnees;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="donnees")
public class Donnees {
			
				@Id
			    	@Column(name="id", length = 20)
			    	@GeneratedValue(strategy = GenerationType.IDENTITY)
				private int id;
				@Column(name="reference_capteur", length = 255)
				private String reference;
				@Column(name="valeur", length = 255)
				private int valeur;
				@Column(name="date", length = 255)
				private Timestamp  date;
				@Column(name="type", length = 255)
				private String type;
				public Donnees(int id, String reference, int valeur, Timestamp date, String type) {
					
					this.id = id;
					this.reference = reference;
					this.valeur = valeur;
					this.date = date;
					this.type = type;
				}
				public Donnees() {
					
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
				public String getType() {
					return type;
				}
				public void setType(String type) {
					this.type = type;
				}
				@Override
				public String toString() {
					return "Donnees [id=" + id + ", reference=" + reference + ", valeur=" + valeur + ", date=" + date
							+ ", type=" + type + "]";
				}
				
				
				
				
				
				
				
				
				
}
