package bibliotheque.mvp.model;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Rayon;

import java.util.ArrayList;
import java.util.List;

public class RayonModel implements DAORayon {
    private List<Rayon> rayons = new ArrayList<>();

    @Override
    public Rayon addRayon(Rayon ra){
        boolean present= rayons.contains(ra);
        if(!present){
            rayons.add(ra);
            return ra;
        }
        else return null;
    }

    @Override
    public boolean removeRayon(Rayon ra) {
        return rayons.remove(ra);
    }

    @Override
    public List<Rayon> getRayons() {
        return new ArrayList<>(rayons);
    }

    @Override
    public Rayon updateRayon(Rayon rayon) {
        //int idLecteur = lecteur.getNumlecteur();
        int p = rayons.indexOf(rayon);
        if (p < 0) return null;
        rayons.set(p, rayon);//remplacement du lecteur à la même position
        return rayon;
    }
}
