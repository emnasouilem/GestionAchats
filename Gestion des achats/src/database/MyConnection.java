package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import metier.Livre;
import metier.LignePanier;
import metier.Utilisateur;

 

public class MyConnection {
    public static Connection c =null;    
    static Statement stmt =null ;
    public MyConnection() throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC";
        c = DriverManager.getConnection(url,"root","root");
       
    }
    
   
   

	
		
}
