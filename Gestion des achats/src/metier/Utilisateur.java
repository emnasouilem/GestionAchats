package metier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.MyConnection;

public class Utilisateur extends Personne {
	private int numU;
	private String pseudo , motpasse;
	private LignePanier lignePanier;
	
	public Utilisateur() {
		super();
		this.pseudo="pseudo user";
		this.motpasse = "mot de passe user";
	}

	public Utilisateur(int num,String pseudo, String motpasse , String nom,String prenom,String adr) {
		super(nom,prenom,adr);
		this.numU=num;
		this.pseudo = pseudo;
		this.motpasse = motpasse;
	}
	
	public int getNumU() {
		return this.numU;
	}
	public void setNumU(int n) {
		this.numU=n;
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

	
	public String toString() {
		return "pseudo utilisateur :" + pseudo + ", motpasse:" + motpasse ;
	}
	
	public void afficherUser() throws ClassNotFoundException, SQLException {
		MyConnection maC = new MyConnection();
		Statement stmt=null;
		stmt = maC.c.createStatement();
		 ResultSet rs = stmt.executeQuery("select * from user ");
	       while(rs.next())
	       {	
	    	  
	           System.out.println("pseudo : "+ rs.getString(1));
	           System.out.println("mot de passe : "+ rs.getString(2));
	          
	       }
	}
	
	public int ajouterUser() throws ClassNotFoundException, SQLException
	{
	    Statement stmt =null;
	    String req = "insert into  user values(" + this.pseudo+ ",'"+
	    this.motpasse + "', '"+ lignePanier.getCode()+ "')";
	    
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
	
	public int NumUser() throws ClassNotFoundException, SQLException {
		MyConnection maC = new MyConnection();
		Statement stmt=null;
		stmt = maC.c.createStatement();
		 ResultSet rs = stmt.executeQuery("select MAX(num_user) from user ");
	       while(rs.next())
	       {	
	    	  return rs.getInt("num_user");
	       }
	       return -1;
	}
		
	
	
}
