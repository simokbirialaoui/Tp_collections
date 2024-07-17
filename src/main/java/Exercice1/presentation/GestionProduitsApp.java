package Exercice1.presentation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exercice1.metier.Produit;


public class GestionProduitsApp {

	public static void main(String[] args) {
		   List<Produit> produits = new ArrayList<>();
		   //QUESTION 1 Ajouter des produits.
		   produits.add(new Produit(1,"test",12000));
		   produits.add(new Produit(2,"produit02",13000));
		   produits.add(new Produit(3,"produit03",14000));
		   //QUESTION 2 Supprimer un produit par indice.
		   produits.remove(1);
		   //QUESTION 3 Afficher la liste des produits.
		   for(Produit p: produits) {
			   System.out.println(p);
		   }
		   //QUESTION 4 Modifier un produit par indice.
		   Produit produitAModifier = produits.get(0);
           produitAModifier.setNom("test");
           produitAModifier.setPrix(12005);
           //QUESTION 5 Rechercher un produit dont le nom est tapé par l’utilisateur.
           System.out.print("Entrez le nom du produit à rechercher : ");
           Scanner scanner = new Scanner(System.in);
           String nomRecherche = scanner.next();
           boolean produitTrouve = false;
           for (Produit produit : produits) {
               if (produit.getNom().equalsIgnoreCase(nomRecherche)) {
                   System.out.println("Produit trouvé : " + produit);
                   produitTrouve = true;
                   break;
               }
           }
           if (!produitTrouve) {
               System.out.println("Aucun produit trouvé avec le nom : " + nomRecherche);
           }

           scanner.close();
	}

}
