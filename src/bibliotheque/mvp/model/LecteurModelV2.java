package bibliotheque.mvp.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Lecteur;

import java.util.ArrayList;
import java.util.List;

public class LecteurModelV2 implements DAO<Lecteur>, SpecialLecteur {
    private int numcli = 0;
    private List<Lecteur> ldatas = new ArrayList<>();
    private int numLecteur = 0;

    @Override
    public Lecteur add(Lecteur nl) {
        if(ldatas.contains(nl)) return null;
        ldatas.add(nl);
        nl.setNumlecteur(++numLecteur);
        return nl;

    }

    @Override
    public boolean remove(Lecteur elt) {
        return ldatas.remove(elt);
    }

    @Override
    public Lecteur update(Lecteur elt) {
        int p = ldatas.indexOf(elt);
        if (p < 0) return null;
        ldatas.set(p, elt);
        return elt;
    }

    @Override
    public Lecteur read(Lecteur rech) {
        int p = ldatas.indexOf(rech);
        if(p<0) return null;
        return ldatas.get(p);
    }

    @Override
    public List<Lecteur> getAll() {
        return ldatas;
    }

    @Override
    public List<Exemplaire> exemplairesEnLocation(Lecteur l) {
        return l.listerExemplairesEnLocation();
    }

    @Override
    public List<Exemplaire> exemplairesLoues(Lecteur l) {
        return new ArrayList<>(l.listerExemplairesLoues());
    }
}
