package bibliotheque.mvp.presenter;

import bibliotheque.metier.Auteur;
import bibliotheque.metier.Lecteur;
import bibliotheque.mvp.model.DAOAuteur;
import bibliotheque.mvp.view.AuteurViewInterface;

import java.util.List;

public class AuteurPresenter {

    private DAOAuteur model;

    private AuteurViewInterface view;

    public AuteurPresenter(DAOAuteur model, AuteurViewInterface view){
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start(){
        List<Auteur> auteurs = model.getAuteurs();
        view.setListDatas(auteurs);
    }

    public void addAuteur(Auteur auteur){
        Auteur aut = model.addAuteur(auteur);
        if(aut!=null) view.affMsg("création de :"+aut);
        else view.affMsg("erreur de création");
        List<Auteur> auteurs = model.getAuteurs();
        view.setListDatas(auteurs);
    }

    public void removeAuteur(Auteur auteur){
        boolean ok = model.removeAuteur(auteur);
        if(ok) view.affMsg("lecteur effacé");
        else view.affMsg("lecteur non effacé");
        List<Auteur> auteurs = model.getAuteurs();
        view.setListDatas(auteurs);
    }

    public void update(Auteur auteur) {
        Auteur a  =model.updateAuteur(auteur);
        if(a==null) view.affMsg("mise à jour infrucueuse");
        else view.affMsg("mise à jour effectuée : "+a);
        //view.setListDatas(model.getClients());//désactivé pour éviter appels imbriqués
    }
    public List<Auteur> getAll(){
        return model.getAuteurs();
    }

}
