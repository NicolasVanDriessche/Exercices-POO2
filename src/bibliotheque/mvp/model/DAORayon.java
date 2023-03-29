package bibliotheque.mvp.model;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Rayon;

import java.util.List;

public interface DAORayon {
    Rayon addRayon(Rayon ra);

    boolean removeRayon(Rayon ra);

    List<Rayon> getRayons();

    Rayon updateRayon(Rayon rayon);
}
