package emsi;

public class etudiant extends emsien{
	private String cne;
	private String filiere;
	private int groupe;
	private int niveau;
	
	public etudiant(String n,String d,String c,String cn,String f,int g,int nv) {
		super(n,d,c);
		this.setCne(cn);
		this.setFiliere(f);
		this.setGroupe(g);
		this.setNiveau(nv);
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public int getGroupe() {
		return groupe;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public String AffEtu() {
		
		return super.toString()+"\t"+this.cne+"\t"+this.filiere+"\t"+this.groupe+"\t"+this.niveau+"\n";
	}
	
	public String toString() {
		return super.toString()+"\t"+this.cne+"\t"+this.filiere+"\t"+this.groupe+"\t"+this.niveau;
	}
	
}
