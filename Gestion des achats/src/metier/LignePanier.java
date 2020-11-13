package metier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.MyConnection;

public class LignePanier {
	private Livre livres[] ;
	private double total=0;
	private int i=0;
	private String code ;
	public LignePanier() {
		this.code="XXX";
	
	}
	public LignePanier(String code) {
		this.code = code;
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
		return "Panier contient le produit :"+super.toString()+" avec la quantité du commande:"  + "et le code du panier:" + code ;
	}
	
	
	
	
	public int ajoutLivre(Livre livre , int qte) throws SQLException, ClassNotFoundException {
		String id="";
		Statement stmt = null;
			this.total= qte*livre.getPrice() ;
			id = livre.getId();

		String req = "insert into  ligne_panier  values('" +"1"+ "',"+ qte
			     + ", "+ this.total + ",'" +
			    id+ "')";
		 MyConnection maC = new MyConnection();
		
		   
		    if(maC == null)
		        {
		            System.out.println("Problème de connexion à la source de données...");
		            return -1;
		        }
		        else
		        {
		           
		            stmt = maC.c.createStatement();
		            return  stmt.executeUpdate(req);
		        }
		    }
	
	
	public void afficherPanier() throws ClassNotFoundException, SQLException {
		MyConnection maC = new MyConnection();
		Statement stmt=null;
		stmt = maC.c.createStatement();
		 ResultSet rs = stmt.executeQuery("select * from ligne_panier");
	       while(rs.next())
	       {	
	    	  
	           System.out.println("code pan : "+ rs.getString(1));
	           System.out.println("quantite: "+ rs.getInt(2));
	           System.out.println("totale prix : "+ rs.getInt(3));
	           System.out.println("referance de produit "+ rs.getString(4));
	          
	       }
	}
	
	
	
	
	
	 public double calculTotalPrice(int qte, double prix) {
		 double totalprice=0;
		return 	totalprice= qte*prix;
		
	 }
	

}
