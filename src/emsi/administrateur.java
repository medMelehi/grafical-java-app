package emsi;

public class administrateur extends employe {
	private String role;
	
	public administrateur(String n,String d,String c, String s,double sa,String r) {
		super(n,d,c,s,sa);
		this.setRole(r);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		String resultat = super.toString();
		
		return resultat+"\t"+this.role+"\n";
	}

}
