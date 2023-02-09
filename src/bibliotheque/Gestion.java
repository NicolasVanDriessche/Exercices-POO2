package bibliotheque;

import java.util.List;

public class Gestion {
    public static void main(String[] args){
        Auteur a1 = new Auteur("Céline", "Louis-Ferdinand", "français");
        Livre l1 = new Livre("Voyage au bout de la nuit", 16, "15 octobre 1932", 1, "Français", "Littérature", "9782070360284", 505, TypeLivre.ROMAN, "Lorsque Ferdinand Bardamu s’engage dans l’armée, il côtoie la Grande Guerre et ses horreurs. Il y perd ses illusions, en même temps que son innocence et son héroïsme.\n" +
                "En Afrique, où le colonialisme lui montre une autre forme d’atrocité, Bardamu s’insurge de cette exploitation de l’homme par l’homme, plus terrible encore que la guerre.\n" +
                "En Amérique, où le capitalisme conduit à la misère des moins chanceux, Bardamu refuse toute morale et survit comme il peut, entre son travail à la chaîne et son amour pour Molly, généreuse prostituée.\n" +
                "En France, où il exerce comme médecin de banlieue, Bardamu tente d’apaiser les malheurs humains. Au fil de son voyage, étape par étape, il côtoie sans cesse la misère humaine et s’indigne, cynique et sombre comme la nuit.");

        a1.getLouvrage().add(l1);
        l1.getLauteurs().add(a1);
        Rayon r1 = new Rayon("r11", "Littérature");
        Exemplaire e1 = new Exemplaire("98732","Bon état", l1);
        e1.setRayon(r1);
        r1.getLex().add(e1);




    }
}
