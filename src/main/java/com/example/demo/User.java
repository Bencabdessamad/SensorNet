package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utilisateurs")
public class User {
                 @Id
                 @Column(name="id", length = 20)
                 @GeneratedValue(strategy = GenerationType.IDENTITY)
                 private int userid;
                 @Column(name="user_nom", length = 255)
                 private String nom;
                 @Column(name="user_prenom", length = 255)
                 private String prenom;
                 @Column(name="email", length = 255)
                 private String email;
                 @Column(name="password", length = 255)
                 private String password;
                 @Column(name="profil", length = 255)
                 private String profil;
                 @Column(name="inactive")
                 private String inactive ;
				public User(int userid, String nom, String prenom, String email, String password, String profil,
						String inactive) {
					
					this.userid = userid;
					this.nom = nom;
					this.prenom = prenom;
					this.email = email;
					this.password = password;
					this.profil = profil;
					this.inactive = inactive;
				}
				public User() {
					
				}
				public int getUserid() {
					return userid;
				}
				public void setUserid(int userid) {
					this.userid = userid;
				}
				public String getNom() {
					return nom;
				}
				public void setNom(String nom) {
					this.nom = nom;
				}
				public String getPrenom() {
					return prenom;
				}
				public void setPrenom(String prenom) {
					this.prenom = prenom;
				}
				public String getEmail() {
					return email;
				}
				public void setEmail(String email) {
					this.email = email;
				}
				public String getPassword() {
					return password;
				}
				public void setPassword(String password) {
					this.password = password;
				}
				public String getProfil() {
					return profil;
				}
				public void setProfil(String profil) {
					this.profil = profil;
				}
				public String getInactive() {
					return inactive;
				}
				public void setInactive(String inactive) {
					this.inactive = inactive;
				}
				@Override
				public String toString() {
					return "User [userid=" + userid + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
							+ ", password=" + password + ", profil=" + profil + ", inactive=" + inactive + "]";
				}
				
                          
}
