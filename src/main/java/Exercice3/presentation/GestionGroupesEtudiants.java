package Exercice3.presentation;
import java.util.HashSet;
import java.util.Set;

public class GestionGroupesEtudiants {
    public static void main(String[] args) {
        //QUESTION N° 1 Créer deux HashSet pour les groupes A et B
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // QUESTION N° 2Ajouter des noms d'étudiants à chaque HashSet
        groupeA.add("hanane");
        groupeA.add("rania");
        groupeA.add("ahmed");
        groupeA.add("hicham");

        groupeB.add("saad");
        groupeB.add("sara");
        groupeB.add("janat");
        groupeB.add("nour");

        // QUESTION N° 3 Afficher l'intersection des deux HashSets
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des groupes A et B : " + intersection);

        // QUESTION N° 4 Afficher l'union des deux HashSets
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des groupes A et B : " + union);
    }
}
