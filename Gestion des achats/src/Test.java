import java.util.Scanner;
import java.util.Random;
public class Test {

	public static void main(String[] args) {
		Administrateur admin = new Administrateur();
		Utilisateur u= new Utilisateur();
		Scanner sc = new Scanner(System.in);
		Panier pan= new Panier();
		Produit[] p= new Produit[3];
		String user="";
		do {
		System.out.println(" donner la mot cle"); 
		 user=sc.nextLine();
		
		switch (user)
		{ case "Mat007x"://matricule d'admin deja saisie class administrateur
			
			System.out.println("1-Ajouter un produit | 2-afficher les produits  ");
			int choix=sc.nextInt();
			switch(choix) {
			case 1:
	   for(int i=0; i<2;i++) {
				System.out.println("Nom");
				String nom =sc.nextLine();
				System.out.println("Description");
				String desc =sc.nextLine();
				System.out.println("quantite");
				int qt =sc.nextInt();
				System.out.println("ref");
				int ref =sc.nextInt();
				System.out.println("prix unitaire");
				int prix = sc.nextInt();
				p[i]= new Produit(ref,qt,prix,desc,nom);
				
			}break;
			case 2 :System.out.println("les produits disponibles");
			for (int i=0;i<p.length;i++) {
				if(p[i]!=null)
				System.out.println(p[i].toString());
			}; 
			}break;
		case "user": // utilisateur peut consulter les produits disponible avant de passer sa commande
			System.out.println("les produits disponibles");
			for (int i=0;i<p.length;i++) {
				if(p[i]!=null)
				System.out.println(p[i].toString());
			}
			System.out.println("pour passer une commande");
		pan.setCode( "pan001");// set d'un code panier par default
		u.setCodep(pan.getCode()); // affecter la code panier au attribut code panier du l'utilisateur 
		System.out.println("quantite de produit que vous allez acheter");
		int qte= sc.nextInt();
		System.out.println("prix");
		double px =sc.nextDouble();
		pan.calculTotalPrice(qte,px);
		System.out.print(pan.calculTotalPrice(qte, px)); break;
		
			};
		}
		while( user != "exit");
		
		
	}
	

}
