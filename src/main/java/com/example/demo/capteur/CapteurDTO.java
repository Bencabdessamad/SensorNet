package com.example.demo.capteur;



public class CapteurDTO {
			
	
	private int capteurid;
    private String reference;
    private String type;
	private int valeur;
	public CapteurDTO(int capteurid, String reference, String type, int valeur) {
		this.capteurid = capteurid;
		this.reference = reference;
		this.type = type;
		this.valeur = valeur;
	}
	public CapteurDTO() {
	}
	public int getValeur() {
                return valeur;
        }
	public void setValeur(int valeur) {
                this.valeur = valeur;
        }

	public int getCapteurid() {
		return capteurid;
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
		return "CapteurDTO [capteurid=" + capteurid + ", reference=" + reference + ", type=" + type + ", valeur=" + valeur + "]";
	}
	
	
	
	
    
    
    
}
