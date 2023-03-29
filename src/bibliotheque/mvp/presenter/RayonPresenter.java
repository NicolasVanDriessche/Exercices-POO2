package bibliotheque.mvp.presenter;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Rayon;
import bibliotheque.mvp.model.DAORayon;
import bibliotheque.mvp.view.RayonViewInterface;

import java.util.List;

public class RayonPresenter {
    private DAORayon model;
    private RayonViewInterface view;

    public RayonPresenter(DAORayon model, RayonViewInterface view){
        this.model=model;
        this.view=view;
        this.view.setPresenter(this);

    }

    public void start(){
        List<Rayon> rayons = model.getRayons();
        view.setListDatas(rayons);
    }

    public void addRayon(Rayon rayon){
        Rayon ray = model.addRayon(rayon);
        if(ray!=null) view.affMsg("création de :"+ray);
        else view.affMsg("erreur de création");
        List<Rayon> rayons = model.getRayons();
        view.setListDatas(rayons);
    }

    public void removeRayon(Rayon rayon){
        boolean ok = model.removeRayon(rayon);
        if(ok) view.affMsg("rayon effacé");
        else view.affMsg("rayon non effacé");
        List<Rayon> rayons = model.getRayons();
        view.setListDatas(rayons);
    }

    public void update(Rayon rayon) {
        Rayon r  =model.updateRayon(rayon);
        if(r==null) view.affMsg("mise à jour infrucueuse");
        else view.affMsg("mise à jour effectuée : "+r);
        //view.setListDatas(model.getClients());//désactivé pour éviter appels imbriqués
    }

    public List<Rayon> getAll(){
        return model.getRayons();
    }
}
