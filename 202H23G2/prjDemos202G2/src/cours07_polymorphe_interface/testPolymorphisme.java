package cours07_polymorphe_interface;

import java.util.ArrayList;

import _utilitaire.*;

import static _utilitaire.Utilitaire.getRandomInRange;

public class testPolymorphisme {
    private static final String[] tabNom = {"Tom", "Jacob", "Bronto", "Méduse", "Doom", "Yvon", "Agamemnon", "Eurysthée", "Brontès", "Perséphone", "Déjanire"};
    private ArrayList<Personnage> listePersonnage = null;

    public testPolymorphisme() {
        //  typeDePersononnageDansToString();

        jouerAvecUneListeDePersonnage();

        faireMangerMesPersonnages();
    }

    private void faireMangerMesPersonnages() {
        for (Personnage p : listePersonnage) {
            if (!p.getClass().getSimpleName().equals("Medecin")) {
                JouerAvecVivant.faireManger((Vivant) p, 2);
            }
        }
    }


    private void typeDePersononnageDansToString() {
        Personnage tabPersonnage[] = new Personnage[3];
        tabPersonnage[0] = new Paysan("Jean Paysan", 100);
        tabPersonnage[1] = new Guerrier("Hercule", 200);
        tabPersonnage[2] = new Medecin("Victor", 40);

        for (Personnage p : tabPersonnage) {
            System.out.println(p.toString());
        }
    }


    private void jouerAvecUneListeDePersonnage() {

        initListePersonnage(10);
        System.out.println(listePersonnage);
        rencontrer();
        System.out.println(listePersonnage);
    }

    private void initListePersonnage(int nbPersonnage) {
        listePersonnage = new ArrayList<>();
        for (int i = 0; i < nbPersonnage; i++) {
            listePersonnage.add(getRandomPersonnage(i % tabNom.length));
        }
    }


    private void rencontrer() {
        for (int i = 0; i < listePersonnage.size() - 1; i++) {
            listePersonnage.get(i).rencontrer(listePersonnage.get(i + 1));
        }

    }

    private Personnage getRandomPersonnage(int noNomPersonnage) {
        Personnage p;
        int noTypePersonnage = getRandomInRange(0, 2);
        int nbPtsVie = getRandomInRange(10, 100);
        switch (noTypePersonnage) {
            case 0:
                p = new Guerrier(tabNom[noNomPersonnage], nbPtsVie);
                break;
            case 1:
                p = new Paysan(tabNom[noNomPersonnage], nbPtsVie);
                break;
            case 2:
                p = new Medecin(tabNom[noNomPersonnage], nbPtsVie);
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
