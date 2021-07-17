package emsi;

public class etudiantRegulier extends etudiant{
	private String codeEmsi;
	
	public etudiantRegulier(String n,String d,String c,String cn,String f,int g,int nv,String ce) {
		super(n,d,c,cn,f,g,nv);
		this.setCodeEmsi(ce);
	}

	public String getCodeEmsi() {
		return codeEmsi;
	}

	public void setCodeEmsi(String codeEmsi) {
		this.codeEmsi = codeEmsi;
	}
	
	public String toString() {
		
		return super.toString()+"\t"+this.codeEmsi+"\n";
	}

}
