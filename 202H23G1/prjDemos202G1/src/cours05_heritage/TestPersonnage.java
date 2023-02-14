package cours05_heritage;

import java.util.ArrayList;

import static _utilitaire.Utilitaire.getRandomInRange;

public class TestPersonnage {
    private static final String[] tabNom = {"Cronos", "Eurydice", "Calliope", "Méduse", "Eurybatos", "Briarée", "Agamemnon", "Eurysthée", "Brontès", "Perséphone", "Déjanire"};
    private ArrayList<Personnage> listePersonnage;

    public TestPersonnage() {
        initListePersonnage(8);
        //test1();
        test2();
    }

    private void rencontrer() {
        for (int i = 0; i < listePersonnage.size() - 1; i++) {
            //Quelle méthode rencontrer() sera exécutée? Ce sera définit à l'exécution avec le type de l'instance: polymorphisme
            listePersonnage.get(i).rencontrer(listePersonnage.get(i + 1));
       }
    }

    private void test2() {
        System.out.println(listePersonnage);
        rencontrer();
        System.out.println(listePersonnage);
    }

    private void test1() {
        Paysan p1 = new Paysan("Jean", 10);
        Guerrier p2 = new Guerrier("Hercule", 100);

        System.out.println(p1);
        p1.rencontrer(p2);

        System.out.println(p2);
        p2.rencontrer(p1);

        System.out.println(p1);

    }

    private void initListePersonnage(int nbPersonnage) {
        listePersonnage = new ArrayList<>();
        for (int i = 0; i < nbPersonnage; i++) {
            listePersonnage.add(getRandomPersonnage(i));
        }
    }

    private Personnage getRandomPersonnage(int noNom) {
        Personnage p;
        int no = getRandomInRange(0, 2);
        int nbPtsVie = getRandomInRange(10, 100);
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
        new TestPersonnage();
    }
}
