
public class Personne {
	String nom,prenom , adress ;

	public Personne() {
		this.nom="Emna";
		this.prenom="Souilem";
				this.adress="Sousse";
	}
	public Personne(String nom, String prenom, String adress) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String toString() {
		return " nom:" + nom + ", prenom:" + prenom + ", adress:" + adress ;
	}

}
