package cours05_heritage;

public class  Paysan extends Personnage {

    public Paysan(String nom, int ptsDeVie) {
        super(nom, ptsDeVie);
    }

    @Override
    public void saluer(Personnage p) {
        super.saluer(p);
        System.out.println("Je suis un paysan");
    }

    @Override
    public void rencontrer(Personnage personnage) {
        saluer(personnage);
    }

}
