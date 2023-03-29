package bibliotheque.mvp.view;


import bibliotheque.metier.Rayon;
import bibliotheque.mvp.presenter.RayonPresenter;
import bibliotheque.utilitaires.Utilitaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RayonViewConsole implements RayonViewInterface{

    private RayonPresenter presenter;
    private List<Rayon> lray;
    private Scanner sc = new Scanner(System.in);

    public RayonViewConsole(){

    }

    @Override
    public void setPresenter(RayonPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Rayon> rayons) {
        this.lray = rayons;
        Utilitaire.affListe(lray);
        menu();
    }

    @Override
    public void affMsg(String msg) {
        System.out.println("information:" + msg);
    }

    public void menu() {
        List options = new ArrayList<>(Arrays.asList("ajouter", "retirer", "modifier", "fin"));
        do {
            int ch = Utilitaire.choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    modifier();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }

    public void ajouter(){
        System.out.println("coderayon ");
        String coderayon = sc.nextLine();
        System.out.println("genre ");
        String genre = sc.nextLine();
        Rayon ray = new Rayon(coderayon, genre);
        presenter.addRayon(ray);
    }

    public void retirer(){
        int choix = Utilitaire.choixElt(lray);
        Rayon rayon = lray.get(choix-1);
        presenter.removeRayon(rayon);
    }

    public void modifier(){
        System.out.println("coderayon ");
        String coderayon = sc.nextLine();
        System.out.println("genre ");
        String genre = sc.nextLine();
        Rayon ray = new Rayon(coderayon, genre);
        presenter.update(ray);
        lray=presenter.getAll();//rafraichissement
        Utilitaire.affListe(lray);
    }
}
