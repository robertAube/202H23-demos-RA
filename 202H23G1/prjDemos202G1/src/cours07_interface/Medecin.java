package cours07_interface;

public class Medecin extends Personnage implements Vivant {
    public Medecin(String nom, int ptsDeVie) {
        super(nom, ptsDeVie);
    }

    @Override
    public void saluer(Personnage p) {
        System.out.println("Bonjour " + p.nom);
    }

    @Override
    public void rencontrer(Personnage personnage) {
        saluer(personnage);
        personnage.ajouterPtsVie(+3);
    }

    @Override
    public void manger() {
        System.out.println("Je déguste!");
    }
}
