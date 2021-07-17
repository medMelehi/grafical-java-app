package emsi;

import java.util.Vector;

public class direction {
	Vector<emsien> liste = new Vector<emsien>(); 
	
	public void ajouter(emsien e) {
		this.liste.add(e);
	}
	
	@SuppressWarnings("unused")
	private emsien find(String cin) {
		for (int i = 0; i < liste.size(); i++) {
		if(this.liste.elementAt(i).getCin().equals(cin) )
			return this.liste.elementAt(i);
		}
		
		System.out.println("ce emsien n'existe pas");
		return null;
	}
	
	public void supprimerParCin(String cin) {
		this.liste.remove(this.find(cin));	
	}
	
	public void afficheEmsiens() {
		for (int i = 0; i < liste.size(); i++) {
		System.out.println(this.liste.elementAt(i).toString());
		}
	}
	
	public String afficheEtudiants() {
		String resultat = "nom	date d'entree	 CIN	CNE	 Filiere  	Group	Niveau\n";
		String sep = "-----------------------------------------------------------------------------------------------------------------------------\n";
		resultat += sep;
		for (int i = 0; i < liste.size(); i++) {
			if(this.liste.elementAt(i) instanceof etudiant) {
				etudiant t = (etudiant)this.liste.elementAt(i); 
				resultat += t.AffEtu();
				resultat += sep;
		}
		}
		return resultat;
	}
	public String afficheEtudiantsRegulier() {
		String resultat = "nom	 date d'entree	 CIN	CNE	 Filiere	Group	Niveau	CodeEmsi\n";
		String sep = "-------------------------------------------------------------------------------------------------------------------------------------------------\n";
		resultat += sep;
		for (int i = 0; i < liste.size(); i++) {
			if(this.liste.elementAt(i) instanceof etudiantRegulier) {
				etudiant t = (etudiant)this.liste.elementAt(i); 
				resultat += t.toString();
				resultat += sep;
		}
		}
		return resultat;
	}
	public String afficheEtudiantsEchange() {
		String resultat = "nom	 date d'entree	 CIN	 CNE	 Filiere	Group	Niveau	 EtabOrigine	   DiplomeAcces\n";
		String sep = "---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
		resultat += sep;
		for (int i = 0; i < liste.size(); i++) {
			if(this.liste.elementAt(i) instanceof etudiantEchange) {
				etudiant t = (etudiant)this.liste.elementAt(i); 
				resultat += t.toString();
				resultat += sep;
		}
		}
		return resultat;
	}
	public String afficheAdministrateur() {
		String resultat = "nom	date d'entree	CIN	Siege	Salaire	Role\n";
		String sep = "---------------------------------------------------------------------------------------------------------------------------------------\n";
		resultat += sep; 
		for (int i = 0; i < liste.size(); i++) {
			if(this.liste.elementAt(i) instanceof administrateur) {
				resultat += this.liste.elementAt(i).toString();
				resultat += sep;
			}
		}
		return resultat;
	}
	public String afficheProfesseur() {
		String resultat = "nom	date d'entree	CIN	Siege	Salaire	Matiere	Laboratoire\n";
		String sep = "--------------------------------------------------------------------------------------------------------------------------------------------------\n";
		resultat += sep; 
		for (int i = 0; i < liste.size(); i++) {
			if(this.liste.elementAt(i) instanceof professeur) {
				resultat += this.liste.elementAt(i).toString();
				resultat += sep;
			}
		}
		return resultat;
	}
	public static void main(String[] args) {
		etudiantEchange eE1 = new etudiantEchange("ahmad","2016-10-10","KA60907","E111","informatique",3,2,"FST","licence info");
		etudiantRegulier eR1 = new etudiantRegulier("simo","2017-10-10","H25389","E111","informatique",3,2,"EMSI111");
		administrateur a1 = new administrateur("Mounia","2009-09-18","MK7975","Emsi1",7000.0,"secretaire");
		professeur p1 = new professeur("elhadri","2002-09-18","LI7975","Emsi3",19000.0,"reseau","CC5");
		direction d1 = new direction();
		d1.ajouter(eE1);
		d1.ajouter(eR1);
		d1.ajouter(a1);
		d1.ajouter(p1);
		//d1.supprimerParCin("KA60907");
		System.out.println(d1.afficheEtudiantsEchange());
		
		
	}
}
