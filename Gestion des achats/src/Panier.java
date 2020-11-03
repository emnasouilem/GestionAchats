
public class Panier extends Produit{
	private int qte=0 ,i=0;
	private double total=0;
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
	public double getTotal() {
		return this.total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String toString() {
		return "Panier contient le produit :"+super.toString()+" avec la quantité du commande:" + qte + "et le code du panier:" + code ;
	}
	
	
	
	public double calculPrice(int qte,String nom,int i) {
		Produit[] p= new Produit[1];
		double result=0;
		if (p[i].recherch(nom)) result= p[i].getPrix()*qte;
		return result;
	}
	
	 public double calculTotalPrice(int qte, double prix) {
		 double totalprice=0;
		return 	totalprice= qte*prix;
		
	 }
	

}
