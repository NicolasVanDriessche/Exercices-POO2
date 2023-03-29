package bibliotheque.mvp.model;

import bibliotheque.metier.Auteur;
import bibliotheque.metier.Lecteur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AuteurModel implements DAOAuteur {
    private List<Auteur> auteurs = new ArrayList<>();

    @Override
    public Auteur addAuteur(Auteur au){
        boolean present= auteurs.contains(au);
        if(!present){
            auteurs.add(au);
            return au;
        }
        else return null;
    }

    @Override
    public boolean removeAuteur(Auteur au) {
        return auteurs.remove(au);
    }

    @Override
    public List<Auteur> getAuteurs() {
        return new ArrayList<>(auteurs);
    }

    @Override
    public Auteur updateAuteur(Auteur auteur) {
        //int idLecteur = lecteur.getNumlecteur();
        int p = auteurs.indexOf(auteur);
        if (p < 0) return null;
        auteurs.set(p, auteur);//remplacement du lecteur à la même position
        return auteur;
    }


}
