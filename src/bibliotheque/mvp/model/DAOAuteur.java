package bibliotheque.mvp.model;

import bibliotheque.metier.Auteur;


import java.util.List;

public interface DAOAuteur {
    Auteur addAuteur(Auteur au);

    boolean removeAuteur(Auteur au);

    List<Auteur> getAuteurs();

    Auteur updateAuteur(Auteur auteur);
}
