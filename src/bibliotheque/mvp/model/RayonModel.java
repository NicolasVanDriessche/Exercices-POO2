package bibliotheque.mvp.model;

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
}
