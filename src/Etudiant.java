import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean
public class Etudiant {
	private int cne;
	private String nom;
	private String prenom;
	private String ville;
	private Date DateN;
	private double bourse;
	public int getCne() {
		return cne;
	}
	public void setCne(int cne) {
		this.cne = cne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Date getDateN() {
		return DateN;
	}
	public void setDateN(Date dateN) {
		DateN = dateN;
	}
	public double getBourse() {
		return bourse;
	}
	public void setBourse(double bourse) {
		this.bourse = bourse;
	}
	public Etudiant(int cne, String nom, String prenom, String ville, Date dateN, double bourse) {
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		DateN = dateN;
		this.bourse = bourse;
	}
	public Etudiant() {
	}
	
	 
	
	
}
