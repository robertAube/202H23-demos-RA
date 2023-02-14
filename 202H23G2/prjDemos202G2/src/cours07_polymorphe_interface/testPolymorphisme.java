package cours07_polymorphe_interface;
import java.util.ArrayList;

import _utilitaire.*;

public class testPolymorphisme {
    private static final String[] tabNom = {"Cronos", "Eurydice", "Calliope", "Méduse", "Eurybatos", "Briarée", "Agamemnon", "Eurysthée", "Brontès", "Perséphone", "Déjanire"};
    private ArrayList<Personnage> listePersonnage = null;

    public testPolymorphisme() {
        typeDePersononnageDansToString();

        jouerAvecUneListeDePersonnage();
    }


    private void typeDePersononnageDansToString() {
        //todo
//        tabPersonnage[0] = new Paysan("Jean Paysan", 100);
//        tabPersonnage[1] = new Guerrier("Hercule", 200);
//        tabPersonnage[2] = new Medecin("Victor", 40);
//
//        for (Personnage p : tabPersonnage) {
//            System.out.println(p);
//        }
    }


    private void jouerAvecUneListeDePersonnage() {

        initListePersonnage(10);
        System.out.println(listePersonnage);
        rencontrer();
        System.out.println(listePersonnage);
    }

    private void initListePersonnage(int nbPersonnage) {
//todo
    }


    private void rencontrer() {
//todo
    }
    private Personnage getRandomPersonnage(int noNom) {
        Personnage p;
        int no = Utilitaire.getRandomInRange(0, 2);
        int nbPtsVie = Utilitaire.getRandomInRange(10, 100);
        switch (no) {
            case 0:
                p = new Guerrier(tabNom[noNom], nbPtsVie);
                break;
            case 1:
                p = new Paysan(tabNom[noNom], nbPtsVie);
                break;
            case 2:
                p = new Medecin(tabNom[noNom], nbPtsVie);
                break;
            default:
                throw new RuntimeException("Numéro de personnage hors limite");
        }
        return p;
    }

    public static void main(String[] args) {
        new testPolymorphisme();
    }
}
