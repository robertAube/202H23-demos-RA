package cours07_polymorphe_interface;

public class Guerrier extends Personnage implements Vivant {
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

    @Override
    public String toString() {
        String str = "Guerrier";
        str += super.toString();
        return str;
    }

    @Override
    public void manger() {
        System.out.println("Mange beaucoup et ce n'est pas propre");
    }
}
