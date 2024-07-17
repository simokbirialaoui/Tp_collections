package Exercice2.presentation;

import java.util.HashMap;
import java.util.Map;

public class GestionNotesEtudiants {

	public static void main(String[] args) {
		  Map<String, Double> notesEtudiants = new HashMap<>();
		  // QUESTION 1 Insérer des notes des étudiants.
		  notesEtudiants.put("JAD", 19.0);
		  notesEtudiants.put("HANANE", 19.5);
		  notesEtudiants.put("JANAT", 18.0);
		  
		  notesEtudiants.put("SARA", 17.0);
		  notesEtudiants.put("SOUJOUD", 16.5);
		  notesEtudiants.put("NOUR", 14.0);
		  //QUESTION 2 Augmenter la note d’un étudiant.
		  double noteActuelle = notesEtudiants.get("JAD");
          notesEtudiants.put("JAD", noteActuelle + 1);
		 //QUESTION 3 Supprimer la note d’un étudiant.
         notesEtudiants.remove("JANAT");
         //QUESTION 4  Afficher la taille du map.
        	    System.out.println("Taille du map : " + notesEtudiants.size());
        	    System.out.println(notesEtudiants);
         //QUESTION 5 Afficher la note moyenne, max et min.
        	    double sommeNotes = 0;
        	    double noteMin = Double.MAX_VALUE;
        	    double noteMax = Double.MIN_VALUE;
        	    for (double note : notesEtudiants.values()) {
        	        sommeNotes += note;
        	        noteMin = Math.min(noteMin, note);
        	        noteMax = Math.max(noteMax, note);
        	    }
        	    double moyenne = sommeNotes / notesEtudiants.size();
        	    System.out.println("Note moyenne est  : " + moyenne);
        	    System.out.println("Note minimale est : " + noteMin);
        	    System.out.println("Note maximale est : " + noteMax);
       // QUESTION 6 Vérifier s’il y a une note égale à 20.
        	    boolean noteEgale20 = false;
        	    for (double note : notesEtudiants.values()) {
        	        if (note == 20.0) {
        	            noteEgale20 = true;
        	            break;
        	        }
        	    }

        	    System.out.println("la Note 20 égale à 20 présente : " + noteEgale20);
       // QUESTION 7 
        	    System.out.println("Liste des notes sont : ");
        	    notesEtudiants.forEach((nom, note) -> System.out.println(nom + " : " + note));
        	    System.out.println();
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    
        	    

		  

	}

}
