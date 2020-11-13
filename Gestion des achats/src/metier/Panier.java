package metier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.MyConnection;

public class Panier {
private LignePanier ligne;
private Utilisateur  user;


public Panier(String code, String pseudo) {
	this.ligne.setCode(code); 
	this.user.setPseudo(pseudo);
}

public int ajoutpanier() throws ClassNotFoundException, SQLException {
	Statement stmt=null;
String req = "insert into  panier  values('" +this.user.getPseudo()+ "',"+this.ligne.getCode()+")" ;
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
public void ajouterLigne(LignePanier lp) {
	this.ligne= lp;
}


public int ajouterLP(LignePanier lp) throws ClassNotFoundException, SQLException {
	Statement stmt=null;
String req = "insert into  panier  values('" +lp.getCode()+ "',"+07+")" ;
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

public void listePanier() throws ClassNotFoundException, SQLException {
	MyConnection maC = new MyConnection();
	Statement stmt=null;
	stmt = maC.c.createStatement();
	 ResultSet rs = stmt.executeQuery("select * from panier p , ligne_panier l where p.id_ligne=l.id_ligne");
       while(rs.next())
       {	
    	  
           System.out.println("id de commande : "+ rs.getString("id_ligne"));
           System.out.println("le livre desiree: "+ rs.getInt("id_book"));
           System.out.println("la quantité: "+ rs.getInt("qte_ligne"));
           System.out.println("totale prix : "+ this.calcul(rs.getString("id_ligne")));
          
       }
}
 public double calcul(String id) throws SQLException, ClassNotFoundException {
	 MyConnection maC = new MyConnection();
		Statement stmt=null;
		stmt = maC.c.createStatement();	
		
	 ResultSet total= stmt.executeQuery("select SUM(total_ligne) as pxtotale from panier p , ligne_panier l where l.id_ligne='"+id+"'");
	 while(total.next()) {
	 return total.getDouble("pxtotale");}
	 return -1;
 }
}
