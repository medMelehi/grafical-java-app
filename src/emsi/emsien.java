package emsi;

import java.time.LocalDate;




public class emsien {
	private String nom;
	private LocalDate dateEntrer;
	private String cin;
	
	public emsien(String n,String d,String c) {
		this.nom = n;
		this.dateEntrer = LocalDate.parse(d);
		this.cin = c;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDateEntrer() {
		return dateEntrer;
	}
	public void setDateEntrer(LocalDate dateEntrer) {
		this.dateEntrer = dateEntrer;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	

	public String toString() {
		return this.nom+"\t"+this.dateEntrer+"\t"+this.cin;
	}

}
