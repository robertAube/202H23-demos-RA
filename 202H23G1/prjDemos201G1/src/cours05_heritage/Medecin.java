package cours05_heritage;

public class Medecin extends Personnage{
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
}
