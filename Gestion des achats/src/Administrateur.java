
public class Administrateur extends Personne {
	private String code,matricule;
	
	public Administrateur() {
		super();
		this.matricule="Mat007x";
		this.code="adminadmin";
	}

	public Administrateur(String code, String matricule) {
		super();
		this.code = code;
		this.matricule = matricule;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	
	public String toString() {
		return "code admin :" + code + ", matricule:" + matricule ;
	}

}
