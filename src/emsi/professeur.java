package emsi;

public class professeur extends employe {
	private String matiere;
	private String laboratoire;
	
	public professeur(String n,String d,String c, String s,double sa,String m,String l){
	super(n,d,c,s,sa);
	this.setMatiere(m);
	this.setLaboratoire(l);
		
	}

	public String getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(String laboratoire) {
		this.laboratoire = laboratoire;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	public String toString() {
		
		return super.toString()+"\t"+this.matiere+"\t"+this.laboratoire+"\n";
	}

}
