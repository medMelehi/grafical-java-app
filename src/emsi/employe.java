package emsi;

public class employe extends emsien {
	private String siege;
	private double salaire;
	
	public employe(String n,String d,String c, String s,double sa) {
		super(n,d,c);
		this.setSiege(s);
		this.setSalaire(sa);
	}

	public String getSiege() {
		return siege;
	}

	public void setSiege(String siege) {
		this.siege = siege;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String toString() {
		String resultat = super.toString();
		
		return resultat+"\t"+this.siege+"\t"+this.salaire;
	}
}
