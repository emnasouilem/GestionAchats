package metier;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;

import database.MyConnection;
import database.MyConnection;

public class Livre  {

private String title ,id, author, releaseDate;
private float price;


public Livre(String id ,String title, String author, String releaseDate, float price ) {
	this.id=id;
	this.title = title;
	this.author = author;
	this.releaseDate = releaseDate;
	this.price = price;
}

public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}

public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public String getReleaseDate() {
	return releaseDate;
}


public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}


public float getPrice() {
	return price;
}


public void setPrice(float price) {
	this.price = price;
}


@Override
public String toString() {
	return "Livre [title=" + title + ", author=" + author + ", releaseDate=" + releaseDate + ", price=" + price + "]";
}

public double recuperePrix(String nom) throws SQLException {
	MyConnection maC = null;
	try {
		maC = new MyConnection();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Statement stmt=null;
	stmt = maC.c.createStatement();
	String req="select * from book  where title_book= '"+ nom +"'";
	 ResultSet rs = stmt.executeQuery(req);
	 if(rs.next()) {
		 return rs.getDouble("price_book");
	 }
	 else return -1; 
	  
	
}
public String recupereLivre(String nom) throws SQLException {
	MyConnection maC = null;
	try {
		maC = new MyConnection();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Statement stmt=null;
	stmt = maC.c.createStatement();
	String req="select * from book  where title_book= '"+ nom +"'";
	 ResultSet rs = stmt.executeQuery(req);
	 if(rs.next()) {
		 
		 return rs.getString("id_book");
	 }
	 else return null; 
	  
	
}

public int ajouterLivre() throws ClassNotFoundException, SQLException
{
    Statement stmt =null;
    String req = "insert into  book values('" + this.id+ "','"+
    this.title + "', '"+ this.author + "',"+this.price+",'"+this.releaseDate+"')";
    
   
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

public void afficherLivres() throws ClassNotFoundException, SQLException {
	MyConnection maC = new MyConnection();
	Statement stmt=null;
	stmt = maC.c.createStatement();
	 ResultSet rs = stmt.executeQuery("select * from book b ");
       while(rs.next())
       {	
    	  
           System.out.println("Id Book : "+ rs.getString("id_book"));
           System.out.println("Titre : "+ rs.getString(2));
           System.out.println("Auteur : "+ rs.getString(3));
           System.out.println("Prix : "+ rs.getDouble(4));
           System.out.println("Date creation : "+ rs.getDate(5));
          
       }
}

}
