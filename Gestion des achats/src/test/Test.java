package test;
import java.util.Scanner;

import metier.Administrateur;
import metier.Livre;
import metier.Panier;
import metier.LignePanier;
import metier.Utilisateur;

import java.sql.SQLException;
import java.util.Random;
public class Test {
	static void addNewUser() throws ClassNotFoundException, SQLException
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Donner Nom :");
		String nom = S.toString();
		System.out.println("Donner Prenom :");
		String prenom = S.toString();
		System.out.println("Donner adress :");
		String adress = S.toString();
		System.out.println("Donner login :");
		String login = S.toString();
		System.out.println("Donner password :");
		String password = S.toString();
		Utilisateur u = null;
		int i= u.NumUser();
		i++;
		u = new Utilisateur(i,login,password,nom,prenom,adress);
		u.ajouterUser();
	}
		
	static void addNewBook() throws ClassNotFoundException, SQLException {
		Scanner S = new Scanner(System.in);
		System.out.println("Donner identifiant de livre :");
		String id = S.toString();
		System.out.println("Donner le titre :");
		String titre = S.toString();
		System.out.println("Donner auteur :");
		String auteur = S.toString();
		System.out.println("Donner date :");
		String date = S.toString();
		System.out.println("Donner prix unitaire :");
		float prix = S.nextFloat();
		Livre livre = new Livre(id,titre,auteur,date,prix);
		livre.ajouterLivre();
	}
	
	static void addNewOrder(Panier pan) throws ClassNotFoundException, SQLException {
		Livre livre = null ;
		livre.afficherLivres();
		Scanner S = new Scanner(System.in);
		System.out.println("Donner identifiant de livre choisi :");
		String id = S.toString();
		System.out.println("Donner la quantité :");
		int qte = S.nextInt();
		LignePanier lp= new LignePanier(id);
		addNewBook();
		lp.ajoutLivre(livre, qte);
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Utilisateur user = null ;
		Panier pan=null;
		Livre livre = null;
		// on se comporte comme etant un administrateur:
		System.out.print("*** Menu Administrateur ***");
		System.out.print("1. Create User");
		System.out.print("2. Display Users");
		System.out.print("3. Create Book");
		System.out.print("4. Display Book");
		System.out.print("5. Create Order"); 
		System.out.print("6. Dispaly Orders");
		Scanner S = new Scanner(System.in);
		System.out.print("Taper votre choix:");
		int choix = S.nextInt();
		switch(choix)
		{
		case 1: addNewUser();
		case 2: user.afficherUser();
		case 3: addNewBook();
		case 4: livre.afficherLivres();
		case 5: addNewOrder(pan);
		default :System.out.print("choix invalid");
		}
	}
		
	

}
