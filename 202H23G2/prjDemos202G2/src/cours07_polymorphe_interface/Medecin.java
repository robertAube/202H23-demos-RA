package cours07_polymorphe_interface;

public class Medecin extends Personnage {
    public Medecin(String nom, int ptsVie) {
        super(nom, ptsVie);
    }

    @Override
    public void saluer() {
        System.out.println("Bonjour monsieur");
    }

    @Override
    public void rencontrer(Personnage p) {
        saluer();
        soigner(p);
    }

    private void soigner(Personnage p) {
        System.out.println("Je te soigne " + p.getNom());
        p.addPtsVie(5);
    }
}
