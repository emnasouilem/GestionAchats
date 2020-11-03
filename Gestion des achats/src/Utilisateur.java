
public class Utilisateur extends Personne {
	private String pseudo , motpasse;
	private String codep ;
	
	public Utilisateur() {
		super();
		this.pseudo="pseudo user";
		this.motpasse = "mot de passe user";
	}

	public Utilisateur(String pseudo, String motpasse) {
		super();
		this.pseudo = pseudo;
		this.motpasse = motpasse;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotpasse() {
		return motpasse;
	}

	public void setMotpasse(String motpasse) {
		this.motpasse = motpasse;
	}
public void setCodep(String p) {
	this.codep= p;
}
public String getCodep() {
	 return this.codep;
}
	
	public String toString() {
		return "pseudo utilisateur :" + pseudo + ", motpasse:" + motpasse ;
	}

}
