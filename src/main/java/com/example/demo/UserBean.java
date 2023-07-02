package com.example.demo;

public class UserBean {
		 
		 private int userid;
		 private String nom;
		 private String prenom;
		 private String email;
		 private String password;
		 private String profil;
		 private String inactive;
		 public UserBean(int userid, String nom, String prenom, String email, String password, String profil, String inactive) 
			{
			this.userid = userid;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.password = password;
			this.profil = profil;
			this.inactive = inactive;
		}
		public UserBean() {
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
			return "UserBean [userid=" + userid + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password="
					+ password + ", profil=" + profil + ", inactive=" + inactive + "]";
		}
		 
		 
		 

}
