package cours07_polymorphe_interface;

public class Guerrier extends Personnage {
    public Guerrier(String nom, int ptsVie) {
        super(nom, ptsVie);
    }

    @Override
    public void saluer() {
        System.out.println("Je ne t'aime pas...");
    }

    @Override
    public void rencontrer(Personnage p) {
        saluer();
        p.addPtsVie(-10);
    }
}
