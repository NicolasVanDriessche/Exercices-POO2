package bibliotheque;

import java.time.LocalDate;
import java.util.List;

public class Gestion {
    public static void main(String[] args){
        Auteur a1 = new Auteur("Céline", "Louis-Ferdinand", "français");
        Livre l1 = new Livre("Voyage au bout de la nuit", 16, "15 octobre 1932", 1, "Français", "Littérature", "9782070360284", 505, TypeLivre.ROMAN, "Lorsque Ferdinand Bardamu s’engage dans l’armée, il côtoie la Grande Guerre et ses horreurs. Il y perd ses illusions, en même temps que son innocence et son héroïsme...");
        a1.addLivre(a1, l1);
        //a1.getLouvrage().add(l1);
        //l1.getLauteurs().add(a1);
        Rayon r1 = new Rayon("r11", "Littérature");
        Exemplaire e1 = new Exemplaire("98732","Bon état", l1);
        e1.setRayon(r1);
        r1.getLex().add(e1);
        Lecteur le = new Lecteur(1, "Doe", "John", LocalDate.of(1999, 2, 24), "Boussu", "doe.john@gmail.com","0485127630");
        Location loc = new Location(LocalDate.of(2023, 2, 14), LocalDate.of(2023, 3, 26), le, e1);
        le.getLloc().add(loc);
        e1.getLloc().add(loc);
        System.out.println(a1);
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(e1);
        System.out.println(le);
        System.out.println(loc);



    }
}
