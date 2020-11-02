
public class Panier  extends Produit{
	private Produit prod[];
	private int qte=0;
	private String code ;
	public Panier() {
		super();
		this.code="XXX";
		this.qte=11;
	}
	public Panier(int qte, String code) {
		super();
		this.qte = qte;
		this.code = code;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String toString() {
		return "Panier contient le produit :"+super.toString()+" avec la quantité du commande:" + qte + "et le code du panier:" + code ;
	}
	
	

}
