package cours05_HeritagePesonnage;

public class Paysan extends Personnage {
    public Paysan(String nom, int ptsVie) {
        super(nom, ptsVie);
    }

    @Override
    public void rencontrer(Personnage p) {
        saluer();
        System.out.println("Je suis content de te voir " + p.getNom());
    }
}
