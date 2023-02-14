package cours07_interface;

public class Guerrier extends Personnage {
    public Guerrier(String nom, int ptsDeVie) {
        super(nom, ptsDeVie);
    }

    @Override
    public void saluer(Personnage p) {
        System.out.println("Je ne t'aime pas " + p.nom);
    }

    @Override
    public void rencontrer(Personnage personnage) {
        saluer(personnage);
        personnage.ajouterPtsVie(-10);
    }
}
