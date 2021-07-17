package emsi;

public class etudiantEchange extends etudiant{
	private String etabOrigine;
	private String diplomeAcces;
	
	public etudiantEchange(String n,String d,String c,String cn,String f,int g,int nv,String et,String da) {
		super(n,d,c,cn,f,g,nv);
		this.setEtabOrigine(et);
		this.setDiplomeAcces(da);
	}

	public String getEtabOrigine() {
		return etabOrigine;
	}

	public void setEtabOrigine(String etabOrigine) {
		this.etabOrigine = etabOrigine;
	}

	public String getDiplomeAcces() {
		return diplomeAcces;
	}

	public void setDiplomeAcces(String diplomeAcces) {
		this.diplomeAcces = diplomeAcces;
	}
	
	public String toString() {
		return super.toString()+"\t"+this.etabOrigine+"\t"+this.diplomeAcces+"\n";
	}
}
