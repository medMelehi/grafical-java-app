package emsi;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.parsers.ParserConfigurationException;

import jdk.internal.access.JavaAWTFontAccess;

public class grafique extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	direction d1 = new direction();
	Container mainPanel;
	JPanel menu;
	JPanel body;
	CardLayout cardLayout;
	JPanel accueil;
	JPanel etudiant;
	JPanel administrateur;
	JPanel professeur;
	JButton B_accueil;
	JButton B_etudiant;
	JButton B_administrateur;
	JButton B_professeur;
	JButton ajouter;
	JTextField name;
	JTextField dE;
	JTextField cin;
	JTextField siege;
	JTextField salaire;
	JTextField role;
	JButton add ;
	JButton remove;
	JButton list;
	JPanel content;
	CardLayout C_cardLayout;
	JTextArea text;
	JScrollPane scroll;
	JTextField sup_cin;
	JButton retour;
	JButton ajouter2;
	JTextField name2;
	JTextField dE2;
	JTextField cin2;
	JTextField siege2;
	JTextField salaire2;
	JTextField matiere;
	JTextField laboratoire;
	JButton add2 ;
	JButton remove2;
	JButton list2;
	JPanel content2;
	CardLayout C_cardLayout2;
	JTextArea text2;
	JScrollPane scroll2;
	JTextField sup_cin2;
	JButton retour2;
	JButton ajouter3;
	JTextField name3;
	JTextField dE3;
	JTextField cin3;
	JTextField codeEmsi;
	JTextField cne;
	JTextField filiere;
	JTextField group;
	JTextField niveau;
	JButton add3 ;
	JButton remove3;
	JButton add4 ;
	JButton remove4;
	JButton c_etudiant;
	JButton c_etudiantRegulier;
	JButton c_etudiantEchange;
	JPanel content3;
	CardLayout C_cardLayout3;
	JTextArea text3;
	JTextArea text4;
	JTextArea text5;
	JScrollPane scroll5;
	JScrollPane scroll3;
	JScrollPane scroll4;
	JTextField sup_cin3;
	JTextField sup_cin4;
	JButton retour3;
	JButton retour4;
	JButton ajouter4;
	JTextField name4;
	JTextField dE4;
	JTextField cin4;
	JTextField etabOrigine;
	JTextField diplome;
	JTextField cne2;
	JTextField filiere2;
	JTextField group2;
	JTextField niveau2;
	Font titles = new Font("Optima",Font.BOLD ,20);
	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == B_accueil ) {
		cardLayout.first(body);
		}
	if (e.getSource() == B_administrateur ) {
		cardLayout.first(body);
		cardLayout.next(body);
		}
	if (e.getSource() == B_professeur) {
		cardLayout.first(body);
		cardLayout.next(body);
		cardLayout.next(body);
	   }
	if (e.getSource() == B_etudiant) {
		cardLayout.first(body);
		cardLayout.next(body);
		cardLayout.next(body);
		cardLayout.next(body);
		}
	if (e.getSource() == ajouter) {
		String nom = name.getText();
		String date = dE.getText();
		String CIN = cin.getText();
		String Siege = siege.getText();
		double Salaire = Double.parseDouble(salaire.getText());
		String Role = role.getText();
		administrateur a = new administrateur(nom, date, CIN, Siege, Salaire, Role);
		d1.ajouter(a);
		name.setText("");
		dE.setText("");
		cin.setText("");
		siege.setText("");
		salaire.setText("");
		role.setText("");
		}
	if (e.getSource() == list) {
		String t = d1.afficheAdministrateur();
		text = new JTextArea(t);
		scroll.getViewport().add(text);
		C_cardLayout.first(content);
		}
	if (e.getSource() == add) {
		C_cardLayout.first(content);
		C_cardLayout.next(content);
		}
	if (e.getSource() == remove) {
		d1.supprimerParCin(sup_cin.getText());
		String t = d1.afficheAdministrateur();
		text = new JTextArea(t);
		scroll.getViewport().add(text);
		sup_cin.setText("");
		}
	if (e.getSource() == retour) {
		String t = d1.afficheAdministrateur();
		text = new JTextArea(t);
		scroll.getViewport().add(text);
		C_cardLayout.first(content);
		}


	if (e.getSource() == ajouter2) {
		String nom = name2.getText();
		String date = dE2.getText();
		String CIN = cin2.getText();
		String Siege = siege2.getText(); 
		double Salaire = Double.parseDouble(salaire2.getText());
		String Matiere = matiere.getText();
		String Labo = laboratoire.getText();
		professeur p = new professeur(nom, date, CIN, Siege, Salaire, Matiere,Labo);
		d1.ajouter(p);
		System.out.println("p:"+d1.afficheProfesseur());
		name2.setText("");
		dE2.setText("");
		cin2.setText("");
		siege2.setText("");
		salaire2.setText("");
		matiere.setText("");
		laboratoire.setText("");
		}
	if (e.getSource() == list2) {
		String t = d1.afficheProfesseur();
		text2 = new JTextArea(t);
		scroll2.getViewport().add(text2);
		C_cardLayout2.first(content2);
		}
	if (e.getSource() == add2) {
		C_cardLayout2.first(content2);
		C_cardLayout2.next(content2);
		}
	if (e.getSource() == remove2) {
		d1.supprimerParCin(sup_cin2.getText());
		String t = d1.afficheProfesseur();
		text2 = new JTextArea(t);
		scroll2.getViewport().add(text2);
		sup_cin2.setText("");
		}
	if (e.getSource() == retour2) {
		String t = d1.afficheProfesseur();
		text2 = new JTextArea(t);
		scroll2.getViewport().add(text2);
		C_cardLayout2.first(content2);
		}
	if (e.getSource() == c_etudiant) {
		String t = d1.afficheEtudiants();
		text3 = new JTextArea(t);
		scroll3.getViewport().add(text3);
		C_cardLayout3.first(content3);
		
		}
	if (e.getSource() == c_etudiantRegulier) {
		String t = d1.afficheEtudiantsRegulier();
		text4 = new JTextArea(t);
		scroll4.getViewport().add(text4);
		C_cardLayout3.first(content3);
		C_cardLayout3.next(content3);
		}
	if (e.getSource() == add3) {

		C_cardLayout3.first(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
	
		}
	if (e.getSource() == retour3) {
		String t = d1.afficheEtudiantsRegulier();
		text4 = new JTextArea(t);
		scroll4.getViewport().add(text4);
		C_cardLayout3.first(content3);
		C_cardLayout3.next(content3);
	
		}
	if (e.getSource() == c_etudiantEchange) {
		String t = d1.afficheEtudiantsEchange();
		text5 = new JTextArea(t);
		scroll5.getViewport().add(text5);
		C_cardLayout3.first(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
		}
	if (e.getSource() == add4) {

		C_cardLayout3.first(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
		}
	if (e.getSource() == retour4) {
		String t = d1.afficheEtudiantsEchange();
		text5 = new JTextArea(t);
		scroll5.getViewport().add(text5);
		C_cardLayout3.first(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
		C_cardLayout3.next(content3);
		}
	if (e.getSource() == ajouter3) {
		String nom = name3.getText();
		String date = dE3.getText();
		String CIN = cin3.getText();
		String CNE = cne.getText(); 
		String Filiere = filiere.getText();
		int groupe = Integer.parseInt(group.getText());
		int Niveau = Integer.parseInt(niveau.getText());
		String CodeEmsi = codeEmsi.getText();
		etudiantRegulier ER = new etudiantRegulier(nom, date, CIN, CNE, Filiere, groupe, Niveau, CodeEmsi) ;
		d1.ajouter(ER);
		System.out.println("ER:"+d1.afficheEtudiantsRegulier());
		name3.setText("");
		dE3.setText("");
		cin3.setText("");
		cne.setText("");
		filiere.setText("");
		group.setText("");
		niveau.setText("");
		codeEmsi.setText("");
		}
	if (e.getSource() == ajouter4) {
		String nom = name4.getText();
		String date = dE4.getText();
		String CIN = cin4.getText();
		String CNE = cne2.getText(); 
		String Filiere = filiere2.getText();
		int groupe = Integer.parseInt(group2.getText());
		int Niveau = Integer.parseInt(niveau2.getText());
		String EtabOrigine = etabOrigine.getText();
		String Diplome = diplome.getText();
		etudiantEchange EE = new etudiantEchange(nom, date, CIN, CNE, Filiere, groupe, Niveau, EtabOrigine, Diplome) ;
		d1.ajouter(EE);
		System.out.println("EE:"+d1.afficheEtudiantsEchange());
		name4.setText("");
		dE4.setText("");
		cin4.setText("");
		cne2.setText("");
		filiere2.setText("");
		group2.setText("");
		niveau2.setText("");
		etabOrigine.setText("");
		diplome.setText("");
		}
	if (e.getSource() == remove3) {
		d1.supprimerParCin(sup_cin3.getText());
		String t = d1.afficheEtudiantsRegulier();
		text4 = new JTextArea(t);
		scroll4.getViewport().add(text4);
		sup_cin3.setText("");
		}
	if (e.getSource() == remove4) {
		d1.supprimerParCin(sup_cin4.getText());
		String t = d1.afficheEtudiantsEchange();
		text5 = new JTextArea(t);
		scroll5.getViewport().add(text5);
		sup_cin4.setText("");
		}
	

	}

void initComponent() {
	
	//panel principal
	mainPanel = getContentPane();
	mainPanel.setBackground(new Color(228, 245, 245));
	mainPanel.setLayout(new BorderLayout());
	//panel menu
	menu = new JPanel();
	menu.setBackground(new Color(180, 217, 217));
	menu.setLayout(new FlowLayout());
	//panel body
	body = new JPanel();
	body.setBackground(new Color(228, 245, 245));
	cardLayout = new CardLayout();
	body.setLayout(cardLayout);
	//panel accueil
	JLabel titre = new JLabel("Bienvenu dans notre application ");
	JLabel titre2 = new JLabel("Gestionnaire des Emsiens "); 
	titre.setBounds(210,30,500,40);
	titre.setFont(new Font("Optima",Font.BOLD ,30));
	titre2.setBounds(260,70,500,80);
	titre2.setFont(new Font("Optima",Font.BOLD ,30));
	JLabel image = new JLabel(new ImageIcon("src/emsi/index.png")); 
	image.setBounds(240,70,400,400);
	JLabel real = new JLabel("Realise par :   MELEHI Mohammad");
	JLabel real2 = new JLabel("			M'CHANNA Maroua "); 
	real.setBounds(600,450,300,20);
	real.setFont(new Font("Optima",Font.BOLD ,15));
	real2.setBounds(705,470,200,20);
	real2.setFont(new Font("Optima",Font.BOLD ,15));
	accueil = new JPanel();
	accueil.setBackground(new Color(228, 245, 245));
	accueil.setLayout(null);
	accueil.add(titre);
	accueil.add(titre2);
	accueil.add(real);
	accueil.add(real2);
	accueil.add(image);
	//panel de etudiant 
	etudiant = new JPanel();
	etudiant.setBackground(Color.red);
	etudiant.setLayout(new BorderLayout());
	InitEtudPanel();
	//panel de administrateur
	administrateur = new JPanel();
	administrateur.setBackground(Color.blue);
	administrateur.setLayout(new BorderLayout());
	InitAdminPanel();
	//panel du professeur
	professeur = new JPanel();
	professeur.setBackground(Color.yellow);
	professeur.setLayout(new BorderLayout());
	InitProfPanel();
	//initialisation des boutons avec le listener
	B_accueil= new JButton("Accueil");
	B_accueil.addActionListener(this);
	B_accueil.setOpaque(true);
	B_etudiant = new JButton("Etudiant ");
	B_etudiant.addActionListener(this);
	B_administrateur= new JButton("Administrateur");
	B_administrateur.addActionListener(this);
	B_professeur= new JButton("Professeur");
	B_professeur.addActionListener(this);
	
	//container
	mainPanel.add(menu,BorderLayout.NORTH);
	mainPanel.add(body,BorderLayout.CENTER);
	//ajouter les boutons au menu
	menu.add(B_accueil);
	menu.add(B_administrateur);
	menu.add(B_professeur);
	menu.add(B_etudiant);
	
	//ajouter les sous-panel au panel principal
	body.add(accueil);
	body.add(administrateur);
	body.add(professeur);
	body.add(etudiant);
	

}
public void InitProfPanel() {
	//inialiser c_list
	JLabel title = new JLabel("Liste des Professeur");
	title.setFont(titles);
	title.setBounds(150,20,200,30);
	title.setForeground(Color.black);
	
	add2 = new JButton(new ImageIcon("src/emsi/add2.png"));
	add2.setBounds(540,15,35,35);
	add2.addActionListener(this);
	
	scroll2 = new JScrollPane();
	scroll2.setBounds(20,60,600,200);
	String t = d1.afficheProfesseur();
	text2 = new JTextArea(t);
	text2.setBackground(Color.white);
	text2.setLineWrap(true);
	scroll2.setBorder(null);
	scroll2.getViewport().add(text2);
	
	
	//supprimer Professeur
	JLabel suppression = new JLabel("supprimer Professeur");
	suppression.setBounds(25,290,200,30);
	suppression.setForeground(Color.black);
	
	JLabel sup = new JLabel("Entrez le CIN :");
	sup.setBounds(25,330,100,30);
	sup.setForeground(Color.black);
	JScrollPane sup_scroll = new JScrollPane();
	sup_scroll.setBounds(130,330,300,30);
	sup_cin2 = new JTextField(""); 
	sup_scroll.getViewport().add(sup_cin2);
	
	remove2 = new JButton("SUPPRIMER");
	remove2.setBounds(180,370,130,25);
	remove2.addActionListener(this);
	
	JPanel c_list = new JPanel();
	c_list.setBounds(120,30,700,400);
	c_list.setBackground(new Color(228, 245, 245));
	c_list.setLayout(null);
	c_list.add(title);
	c_list.add(add2);
	c_list.add(scroll2);
	c_list.add(suppression);
	c_list.add(sup);
	c_list.add(sup_scroll);
	c_list.add(remove2);
	
	
	//inialiser ajouter administrateur
	//le titre 
	JLabel title2 = new JLabel("Ajouter Professeur");
	title2.setFont(titles);
	title2.setBounds(150,20,200,30);
	title2.setForeground(Color.black);
	//retour a la list
	retour2 = new JButton(new ImageIcon("src/emsi/prev.png"));
	retour2.setBounds(500,20,35,35);
	retour2.addActionListener(this);
	
	//le premiere input name 
	JLabel nom = new JLabel("nom :");
	nom.setBounds(25,60,100,30);
	nom.setForeground(Color.black);
	JScrollPane name_scroll = new JScrollPane();
	name_scroll.setBounds(130,60,300,30);
	name2 = new JTextField(""); 
	name_scroll.getViewport().add(name2);
	
	//la deuxieme input date d'entree
	JLabel de = new JLabel("Date d'Entree :");
	de.setBounds(25,100,100,30);
	de.setForeground(Color.black);
	JScrollPane dE_scroll = new JScrollPane();
	dE_scroll.setBounds(130,100,300,30);
	dE2 = new JTextField(""); 
	dE_scroll.getViewport().add(dE2);
	
	//la 3 eme input CIN 
	JLabel CIN = new JLabel("CIN :");
	CIN.setBounds(25,140,100,30);
	CIN.setForeground(Color.black);
	JScrollPane cin_scroll = new JScrollPane();
	cin_scroll.setBounds(130,140,300,30);
	cin2 = new JTextField(""); 
	cin_scroll.getViewport().add(cin2);
	
	//la 4 eme input siege 
	JLabel Siege = new JLabel("Siege :");
	Siege.setBounds(25,180,100,30);
	Siege.setForeground(Color.black);
	JScrollPane siege_scroll = new JScrollPane();
	siege_scroll.setBounds(130,180,300,30);
	siege2 = new JTextField(""); 
	siege_scroll.getViewport().add(siege2);
	
	//la 5 eme input salaire 
	JLabel Salaire = new JLabel("Salaire :");
	Salaire.setBounds(25,220,100,30);
	Salaire.setForeground(Color.black);
	JScrollPane salaire_scroll = new JScrollPane();
	salaire_scroll.setBounds(130,220,300,30);
	salaire2 = new JTextField(""); 
	salaire_scroll.getViewport().add(salaire2);
	
	//la 6 eme input matiere
	JLabel Matiere = new JLabel("Matiere :");
	Matiere.setBounds(25,260,100,30);
	Matiere.setForeground(Color.black);
	JScrollPane matiere_scroll = new JScrollPane();
	matiere_scroll.setBounds(130,260,300,30);
	matiere = new JTextField(""); 
	matiere_scroll.getViewport().add(matiere);
	
	//la 7 eme input laboratoire
	JLabel laboratoir = new JLabel("Laboratoire :");
	laboratoir.setBounds(25,300,100,30);
	laboratoir.setForeground(Color.black);
	JScrollPane laboratoir_scroll = new JScrollPane();
	laboratoir_scroll.setBounds(130,300,300,30);
	laboratoire = new JTextField(""); 
	laboratoir_scroll.getViewport().add(laboratoire);
	
	//
	ajouter2 = new JButton("AJOUTER") ;
	ajouter2.setBounds(190,350,100,25);
	ajouter2.addActionListener(this);
	
	JPanel c_add = new JPanel();
	c_add.setBounds(160,30,700,400);
	c_add.setBackground(new Color(228, 245, 245));
	c_add.setLayout(null);
	c_add.add(title2);
	c_add.add(retour2);
	c_add.add(nom);
	c_add.add(name_scroll);
	c_add.add(de);
	c_add.add(dE_scroll);
	c_add.add(CIN);
	c_add.add(cin_scroll);
	c_add.add(Siege);
	c_add.add(siege_scroll);
	c_add.add(Salaire);
	c_add.add(salaire_scroll);
	c_add.add(Matiere);
	c_add.add(matiere_scroll);
	c_add.add(laboratoir);
	c_add.add(laboratoir_scroll);
	c_add.add(ajouter2);
	
	JPanel a = new JPanel();
	a.setBackground(new Color(228, 245, 245));
	a.setLayout(null);
	a.add(c_list);
	JPanel b = new JPanel();
	b.setBackground(new Color(228, 245, 245));
	b.setLayout(null);
	b.add(c_add);
	
	content2 = new JPanel();
    C_cardLayout2 = new CardLayout();
	content2.setLayout(C_cardLayout2);
	content2.setBackground(new Color(228, 245, 245));
	content2.add(a);
	content2.add(b);
	
	
	professeur.add(content2,BorderLayout.CENTER);
	
}
public void InitAdminPanel() {
	//inialiser c_list
	JLabel title = new JLabel("Liste des administrateurs");
	title.setFont(titles);
	title.setBounds(150,20,300,30);
	title.setForeground(Color.black);
	
	add = new JButton(new ImageIcon("src/emsi/add2.png"));
	add.setBounds(540,15,35,35);
	add.addActionListener(this);
	
	scroll = new JScrollPane();
	scroll.setBounds(20,60,550,200);
	scroll.setBorder(null);
	String t = d1.afficheAdministrateur();
	text = new JTextArea(t); 
	text.setLineWrap(true);
	scroll.getViewport().add(text);
	
	
	//supprimer administrateur
	JLabel suppression = new JLabel("supprimer administrateur");
	suppression.setBounds(25,290,200,30);
	suppression.setForeground(Color.black);
	
	JLabel sup = new JLabel("Entrez le CIN :");
	sup.setBounds(25,330,100,30);
	sup.setForeground(Color.black);
	JScrollPane sup_scroll = new JScrollPane();
	sup_scroll.setBounds(130,330,300,30);
	sup_cin = new JTextField(""); 
	sup_scroll.getViewport().add(sup_cin);
	
	remove = new JButton("SUPPRIMER");
	remove.setBounds(180,370,130,25);
	remove.addActionListener(this);
	
	JPanel c_list = new JPanel();
	c_list.setBounds(120,30,700,400);
	c_list.setBackground(new Color(228, 245, 245));
	c_list.setLayout(null);
	c_list.add(title);
	c_list.add(add);
	c_list.add(scroll);
	c_list.add(suppression);
	c_list.add(sup);
	c_list.add(sup_scroll);
	c_list.add(remove);
	
	
	//inialiser ajouter administrateur
	//le titre 
	JLabel title2 = new JLabel("Ajouter Administrateur");
	title2.setFont(titles);
	title2.setBounds(150,20,300,30);
	title2.setForeground(Color.black);
	//retour a la list
	retour = new JButton(new ImageIcon("src/emsi/prev.png"));
	retour.setBounds(500,20,35,35);
	retour.addActionListener(this);
	//le premiere input name 
	JLabel nom = new JLabel("nom :");
	nom.setBounds(25,60,100,30);
	nom.setForeground(Color.black);
	JScrollPane name_scroll = new JScrollPane();
	name_scroll.setBounds(130,60,300,30);
	name = new JTextField(""); 
	name_scroll.getViewport().add(name);
	
	//la deuxieme input date d'entree
	JLabel de = new JLabel("Date d'Entree :");
	de.setBounds(25,100,100,30);
	de.setForeground(Color.black);
	JScrollPane dE_scroll = new JScrollPane();
	dE_scroll.setBounds(130,100,300,30);
	dE = new JTextField(""); 
	dE_scroll.getViewport().add(dE);
	
	//la 3 eme input CIN 
	JLabel CIN = new JLabel("CIN :");
	CIN.setBounds(25,140,100,30);
	CIN.setForeground(Color.black);
	JScrollPane cin_scroll = new JScrollPane();
	cin_scroll.setBounds(130,140,300,30);
	cin = new JTextField(""); 
	cin_scroll.getViewport().add(cin);
	
	//la 4 eme input siege 
	JLabel Siege = new JLabel("Siege :");
	Siege.setBounds(25,180,100,30);
	Siege.setForeground(Color.black);
	JScrollPane siege_scroll = new JScrollPane();
	siege_scroll.setBounds(130,180,300,30);
	siege = new JTextField(""); 
	siege_scroll.getViewport().add(siege);
	
	//la 5 eme input salaire 
	JLabel Salaire = new JLabel("Salaire :");
	Salaire.setBounds(25,220,100,30);
	Salaire.setForeground(Color.black);
	JScrollPane salaire_scroll = new JScrollPane();
	salaire_scroll.setBounds(130,220,300,30);
	salaire = new JTextField(""); 
	salaire_scroll.getViewport().add(salaire);
	
	//la 6 eme input role
	JLabel ROLE = new JLabel("Role :");
	ROLE.setBounds(25,260,100,30);
	ROLE.setForeground(Color.black);
	JScrollPane role_scroll = new JScrollPane();
	role_scroll.setBounds(130,260,300,30);
	role = new JTextField(""); 
	role_scroll.getViewport().add(role);
	
	//
	ajouter = new JButton("AJOUTER") ;
	ajouter.setBounds(190,310,100,25);
	ajouter.addActionListener(this);
	
	JPanel c_add = new JPanel();
	c_add.setBackground(new Color(228, 245, 245));
	c_add.setBounds(160,30,700,400);
	c_add.setLayout(null);
	c_add.add(title2);
	c_add.add(retour);
	c_add.add(nom);
	c_add.add(name_scroll);
	c_add.add(de);
	c_add.add(dE_scroll);
	c_add.add(CIN);
	c_add.add(cin_scroll);
	c_add.add(Siege);
	c_add.add(siege_scroll);
	c_add.add(Salaire);
	c_add.add(salaire_scroll);
	c_add.add(ROLE);
	c_add.add(role_scroll);
	c_add.add(ajouter);
	
	
	JPanel a = new JPanel();
	a.setLayout(null);
	a.setBackground(new Color(228, 245, 245));
	a.add(c_list);
	JPanel b = new JPanel();
	b.setBackground(new Color(228, 245, 245));
	b.setLayout(null);
	b.add(c_add);
	content = new JPanel();
    C_cardLayout = new CardLayout();
	content.setLayout(C_cardLayout);
	content.setBackground(new Color(228, 245, 245));
	content.add(a);
	content.add(b);
	
	
	administrateur.add(content,BorderLayout.CENTER);
	
}
public void InitEtudPanel() {

	//inialiser c_etudiant
	JLabel title = new JLabel("Liste des étudiants");
	title.setFont(titles);
	title.setBounds(150,20,200,30);
	title.setForeground(Color.black);
	
	scroll3 = new JScrollPane();
	scroll3.setBounds(20,60,600,300);
	scroll3.setBorder(null);
	String t = d1.afficheEtudiants();
	text3 = new JTextArea(t); 
	text3.setLineWrap(true);
	scroll3.getViewport().add(text3);
	
	//initialiser etudiant regulier
	JLabel title2 = new JLabel("Liste des étudiants régulier ");
	title2.setFont(titles);
	title2.setBounds(150,20,300,30);
	title2.setForeground(Color.black);
	
	scroll4 = new JScrollPane();
	scroll4.setBounds(20,60,700,200);
	scroll4.setBorder(null);
	String t2 = d1.afficheEtudiantsRegulier();
	text4 = new JTextArea(t2); 
	text4.setLineWrap(true);
	scroll4.getViewport().add(text4);
	
	add3 = new JButton(new ImageIcon("src/emsi/add2.png"));
	add3.setBounds(540,15,35,35);
	add3.addActionListener(this);
	
	//supprimer ETUDIANT REGULIER
	JLabel suppression = new JLabel("supprimer etudiant regulier ");
	suppression.setBounds(25,290,200,30);
	suppression.setForeground(Color.black);
	
	JLabel sup = new JLabel("Entrez le CIN :");
	sup.setBounds(25,330,100,30);
	sup.setForeground(Color.black);
	JScrollPane sup_scroll = new JScrollPane();
	sup_scroll.setBounds(130,330,300,30);
	sup_cin3 = new JTextField(""); 
	sup_scroll.getViewport().add(sup_cin3);
	
	remove3 = new JButton("SUPPRIMER");
	remove3.setBounds(180,370,130,25);
	remove3.addActionListener(this);
	
	//ajouter etudiant regulier
	
		//le titre 
		JLabel title4 = new JLabel("Ajouter Etudiant Regulier");
		title4.setFont(titles);
		title4.setBounds(150,20,300,30);
		title4.setForeground(Color.black);
		
		//retour a la list
		retour3 = new JButton(new ImageIcon("src/emsi/prev.png"));
		retour3.setBounds(500,20,35,35);
		retour3.addActionListener(this);
		//le premiere input name 
		JLabel nom = new JLabel("nom :");
		nom.setBounds(25,60,100,30);
		nom.setForeground(Color.black);
		JScrollPane name_scroll = new JScrollPane();
		name_scroll.setBounds(130,60,300,30);
		name3 = new JTextField(""); 
		name_scroll.getViewport().add(name3);
		
		//la deuxieme input date d'entree
		JLabel de = new JLabel("Date d'Entree :");
		de.setBounds(25,100,100,30);
		de.setForeground(Color.black);
		JScrollPane dE_scroll = new JScrollPane();
		dE_scroll.setBounds(130,100,300,30);
		dE3 = new JTextField(""); 
		dE_scroll.getViewport().add(dE3);
		
		//la 3 eme input CIN 
		JLabel CIN = new JLabel("CIN :");
		CIN.setBounds(25,140,100,30);
		CIN.setForeground(Color.black);
		JScrollPane cin_scroll = new JScrollPane();
		cin_scroll.setBounds(130,140,300,30);
		cin3 = new JTextField(""); 
		cin_scroll.getViewport().add(cin3);
		
		
		
		//la 4 eme input cne 
		JLabel CNE = new JLabel("CNE :");
		CNE.setBounds(25,180,100,30);
		CNE.setForeground(Color.black);
		JScrollPane cne_scroll = new JScrollPane();
		cne_scroll.setBounds(130,180,300,30);
		cne = new JTextField(""); 
		cne_scroll.getViewport().add(cne);
		
		//la 5 eme input filiere 
		JLabel FILIERE = new JLabel("Filiere :");
		FILIERE.setBounds(25,220,100,30);
		FILIERE.setForeground(Color.black);
		JScrollPane filiere_scroll = new JScrollPane();
		filiere_scroll.setBounds(130,220,300,30);
		filiere = new JTextField(""); 
		filiere_scroll.getViewport().add(filiere);
		
		//la 6 eme input group
		JLabel GROUP = new JLabel("Group :");
		GROUP.setBounds(25,260,100,30);
		GROUP.setForeground(Color.black);
		JScrollPane group_scroll = new JScrollPane();
		group_scroll.setBounds(130,260,300,30);
		group = new JTextField(""); 
		group_scroll.getViewport().add(group);
		//la 7 eme input niveau
		JLabel NIVEAU = new JLabel("Niveau :");
		NIVEAU.setBounds(25,300,100,30);
		NIVEAU.setForeground(Color.black);
		JScrollPane niveau_scroll = new JScrollPane();
		niveau_scroll.setBounds(130,300,300,30);
		niveau = new JTextField(""); 
		niveau_scroll.getViewport().add(niveau);
		
		//la 8 eme input Code Emsi
		JLabel CODEEMSI = new JLabel("Code Emsi :");
		CODEEMSI.setBounds(25,340,100,30);
		CODEEMSI.setForeground(Color.black);
		JScrollPane codeEmsi_scroll = new JScrollPane();
		codeEmsi_scroll.setBounds(130,340,300,30);
		codeEmsi = new JTextField(""); 
		codeEmsi_scroll.getViewport().add(codeEmsi);
		
		//
		ajouter3 = new JButton("AJOUTER") ;
		ajouter3.setBounds(190,380,100,25);
		ajouter3.addActionListener(this);
		
		JPanel c_add = new JPanel();
		c_add.setBackground(new Color(228, 245, 245));
		c_add.setLayout(null);
		c_add.add(title4);
		c_add.add(retour3);
		c_add.add(nom);
		c_add.add(name_scroll);
		c_add.add(de);
		c_add.add(dE_scroll);
		c_add.add(CIN);
		c_add.add(cin_scroll);
		c_add.add(CNE);
		c_add.add(cne_scroll);
		c_add.add(FILIERE);
		c_add.add(filiere_scroll);
		c_add.add(GROUP);
		c_add.add(group_scroll);
		c_add.add(NIVEAU);
		c_add.add(niveau_scroll);
		c_add.add(CODEEMSI);
		c_add.add(codeEmsi_scroll);
		c_add.add(ajouter3);
	
	//initialiser etudiant echange
	JLabel title3 = new JLabel("Liste des étudiants d'Echange ");
	title3.setFont(titles);
	title3.setBounds(150,20,300,30);
	title3.setForeground(Color.black);
	
	scroll5 = new JScrollPane();
	scroll5.setBounds(20,60,700,200);
	scroll5.setBorder(null);
	String t3 = d1.afficheEtudiantsEchange();
	text5 = new JTextArea(t3); 
	text5.setLineWrap(true);
	scroll5.getViewport().add(text5);
	
	add4 = new JButton(new ImageIcon("src/emsi/add2.png"));
	add4.setBounds(540,15,35,35);
	add4.addActionListener(this);
	
	//supprimer ETUDIANT echange 
	JLabel suppression2 = new JLabel("supprimer etudiant d'échange ");
	suppression2.setBounds(25,290,200,30);
	suppression2.setForeground(Color.black);
	
	JLabel sup2 = new JLabel("Entrez le CIN :");
	sup2.setBounds(25,330,100,30);
	sup2.setForeground(Color.black);
	JScrollPane sup_scroll2 = new JScrollPane();
	sup_scroll2.setBounds(130,330,300,30);
	sup_cin4 = new JTextField(""); 
	sup_scroll2.getViewport().add(sup_cin4);
	
	remove4 = new JButton("SUPPRIMER");
	remove4.setBounds(180,370,130,25);
	remove4.addActionListener(this);
	//ajouter etudiant ECHANGE
	
			//le titre 
			JLabel title5 = new JLabel("Ajouter Etudiant d'Echange");
			title5.setFont(titles);
			title5.setBounds(150,20,300,30);
			title5.setForeground(Color.black);
			
			//retour a la list
			retour4 = new JButton(new ImageIcon("src/emsi/prev.png"));
			retour4.setBounds(510,20,35,35);
			retour4.addActionListener(this);
			//le premiere input name 
			JLabel nom2 = new JLabel("nom :");
			nom2.setBounds(25,60,100,30);
			nom2.setForeground(Color.black);
			JScrollPane name_scroll2 = new JScrollPane();
			name_scroll2.setBounds(200,60,300,30);
			name4 = new JTextField(""); 
			name_scroll2.getViewport().add(name4);
			
			//la deuxieme input date d'entree
			JLabel de2 = new JLabel("Date d'Entree :");
			de2.setBounds(25,100,100,30);
			de2.setForeground(Color.black);
			JScrollPane dE_scroll2 = new JScrollPane();
			dE_scroll2.setBounds(200,100,300,30);
			dE4 = new JTextField(""); 
			dE_scroll2.getViewport().add(dE4);
			
			//la 3 eme input CIN 
			JLabel CIN2 = new JLabel("CIN :");
			CIN2.setBounds(25,140,100,30);
			CIN2.setForeground(Color.black);
			JScrollPane cin_scroll2 = new JScrollPane();
			cin_scroll2.setBounds(200,140,300,30);
			cin4 = new JTextField(""); 
			cin_scroll2.getViewport().add(cin4);
			
			
			
			//la 4 eme input cne 
			JLabel CNE2 = new JLabel("CNE :");
			CNE2.setBounds(25,180,100,30);
			CNE2.setForeground(Color.black);
			JScrollPane cne_scroll2 = new JScrollPane();
			cne_scroll2.setBounds(200,180,300,30);
			cne2 = new JTextField(""); 
			cne_scroll2.getViewport().add(cne2);
			//la 5 eme input filiere 
			JLabel FILIERE2 = new JLabel("Filiere :");
			FILIERE2.setBounds(25,220,100,30);
			FILIERE2.setForeground(Color.black);
			JScrollPane filiere_scroll2 = new JScrollPane();
			filiere_scroll2.setBounds(200,220,300,30);
			filiere2 = new JTextField(""); 
			filiere_scroll2.getViewport().add(filiere2);
			
			//la 6 eme input group
			JLabel GROUP2 = new JLabel("Group :");
			GROUP2.setBounds(25,260,100,30);
			GROUP2.setForeground(Color.black);
			JScrollPane group_scroll2 = new JScrollPane();
			group_scroll2.setBounds(200,260,300,30);
			group2 = new JTextField(""); 
			group_scroll2.getViewport().add(group2);
			//la 7 eme input niveau
			JLabel NIVEAU2 = new JLabel("Niveau :");
			NIVEAU2.setBounds(25,300,100,30);
			NIVEAU2.setForeground(Color.black);
			JScrollPane niveau_scroll2 = new JScrollPane();
			niveau_scroll2.setBounds(200,300,300,30);
			niveau2 = new JTextField(""); 
			niveau_scroll2.getViewport().add(niveau2);
			
			//la 8 eme input Etablissement d'origine
			JLabel ETABORIGINE = new JLabel("Etablissement d'Origine:");
			ETABORIGINE.setBounds(25,340,170,30);
			ETABORIGINE.setForeground(Color.black);
			JScrollPane etabOrigine_scroll = new JScrollPane();
			etabOrigine_scroll.setBounds(200,340,300,30);
			etabOrigine = new JTextField(""); 
			etabOrigine_scroll.getViewport().add(etabOrigine);
			//la 9 eme input de diplome d'acces
			JLabel DIPLOME = new JLabel("Diplome d'Acces :");
			DIPLOME.setBounds(25,380,170,30);
			DIPLOME.setForeground(Color.black);
			JScrollPane diplome_scroll = new JScrollPane();
			diplome_scroll.setBounds(200,380,300,30);
			diplome = new JTextField(""); 
			diplome_scroll.getViewport().add(diplome);
			
			//
			ajouter4 = new JButton("AJOUTER") ;
			ajouter4.setBounds(190,420,100,25);
			ajouter4.addActionListener(this);
			
			JPanel c_add2 = new JPanel();
			c_add2.setBackground(new Color(228, 245, 245));
			c_add2.setLayout(null);
			c_add2.add(title5);
			c_add2.add(retour4);
			c_add2.add(nom2);
			c_add2.add(name_scroll2);
			c_add2.add(de2);
			c_add2.add(dE_scroll2);
			c_add2.add(CIN2);
			c_add2.add(cin_scroll2);
			c_add2.add(CNE2);
			c_add2.add(cne_scroll2);
			c_add2.add(FILIERE2);
			c_add2.add(filiere_scroll2);
			c_add2.add(GROUP2);
			c_add2.add(group_scroll2);
			c_add2.add(NIVEAU2);
			c_add2.add(niveau_scroll2);
			c_add2.add(ETABORIGINE);
			c_add2.add(etabOrigine_scroll);
			c_add2.add(DIPLOME);
			c_add2.add(diplome_scroll);
			c_add2.add(ajouter4);
		
	
	
	
	JPanel C_etudiant = new JPanel();
	C_etudiant.setBackground(new Color(228, 245, 245));
	C_etudiant.setLayout(null);
	C_etudiant.add(title);
	C_etudiant.add(scroll3);
	
	JPanel C_etudiantRegulier= new JPanel();
	C_etudiantRegulier.setBackground(new Color(228, 245, 245));
	C_etudiantRegulier.setLayout(null);
	C_etudiantRegulier.add(title2);
	C_etudiantRegulier.add(scroll4);
	C_etudiantRegulier.add(add3);
	C_etudiantRegulier.add(suppression);
	C_etudiantRegulier.add(sup);
	C_etudiantRegulier.add(sup_scroll);
	C_etudiantRegulier.add(remove3);

	JPanel C_etudiantEchange = new JPanel();
	C_etudiantEchange.setBackground(new Color(228, 245, 245));
	C_etudiantEchange.setLayout(null);	
	C_etudiantEchange.add(title3);
	C_etudiantEchange.add(scroll5);
	C_etudiantEchange.add(add4);
	C_etudiantEchange.add(suppression2);
	C_etudiantEchange.add(sup2);
	C_etudiantEchange.add(sup_scroll2);
	C_etudiantEchange.add(remove4);

	
	c_etudiant = new JButton("        Etudiant        ");
	c_etudiant.addActionListener(this);
	c_etudiantRegulier = new JButton("Etudiant Régulier");
	c_etudiantRegulier.addActionListener(this);
	c_etudiantEchange = new JButton("Etudiant Échange");
	c_etudiantEchange.addActionListener(this);
	
	JPanel option = new JPanel();
	option.setBackground(new Color(180, 217, 217));
	option.setLayout(new BoxLayout(option,BoxLayout.PAGE_AXIS));
	option.add(c_etudiant);
	option.add(c_etudiantRegulier);
	option.add(c_etudiantEchange);
	
	
	content3 = new JPanel();
    C_cardLayout3 = new CardLayout();
	content3.setLayout(C_cardLayout3);
	content3.setBackground(new Color(228, 245, 245));
	content3.add(C_etudiant);
	content3.add(C_etudiantRegulier);
	content3.add(c_add);
	content3.add(C_etudiantEchange);
	content3.add(c_add2);
	
	
	etudiant.add(option,BorderLayout.WEST);
	etudiant.add(content3,BorderLayout.CENTER);
	
}



public grafique(String title) {
	etudiantEchange eE1 = new etudiantEchange("ahmad","2016-10-10","KA60907","E111","informatique",3,2,"FST","licence info");
	etudiantRegulier eR1 = new etudiantRegulier("simo","2017-10-10","H25389","E331","informatique",3,2,"EMSI111");
	administrateur a1 = new administrateur("Mounia","2009-09-18","MK7975","Emsi1",7000.0,"secretaire");
	professeur p1 = new professeur("Omar","2015-09-18","KI7975","Emsi3",19000.0,"java","CC6");
	etudiantEchange eE2 = new etudiantEchange("karim","2016-10-10","KA60907","E001","informatique",3,2,"FST","licence info");
	etudiantRegulier eR2 = new etudiantRegulier("akram","2019-10-10","H25389","E221","informatique",5,4,"EM0911");
	administrateur a2 = new administrateur("Maroua","2018-09-18","PK7975","Emsi3",12000.0,"surveillant");
	professeur p2 = new professeur("ElHadri","2002-09-18","LI7975","Emsi3",19000.0,"reseau","CC5");
	
	d1.ajouter(eE1);
	d1.ajouter(eR1);
	d1.ajouter(a1);
	d1.ajouter(p1);
	d1.ajouter(eE2);
	d1.ajouter(eR2);
	d1.ajouter(a2);
	d1.ajouter(p2);
	initComponent();
	setTitle(title);
	setSize(600,300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setBounds(190,50,900,600);
}
public static void main(String[] args) {
  direction d = new direction();
  new grafique("gestionnaire d'Emsien");
  
}
}

