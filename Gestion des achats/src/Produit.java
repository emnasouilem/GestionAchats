
public class Produit {
	private int ref,qte,prix ;
	private String description , nom;
	public Produit() {
		this.ref=12;
		this.qte=11;
		this.nom="Prod1";
		this.description="dimension 15cm";
		this.prix=15;
	}
	public Produit(int ref, int qte, int prix, String description, String nom) {
		this.ref = ref;
		this.qte = qte;
		this.prix = prix;
		this.description = description;
		this.nom = nom;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return "Le produit  de referance :" + ref + " nom :"+nom+" qantite:" + qte + ", prix unitaire:" + prix + ", description:" + description;
	}
	

}
