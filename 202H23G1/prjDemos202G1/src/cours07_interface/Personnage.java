package cours07_interface;

public abstract class Personnage implements Comparable<Personnage> {
    protected String nom; //protected = accesseur qui donne accès aux classes qui en héritent (pas la meilleure chose à faire on devrait
    private int ptsDeVie;

    public Personnage(String nom, int ptsDeVie) {
        this.nom = nom;
        this.ptsDeVie = ptsDeVie;
    }

    public void saluer(Personnage p) {
        System.out.println("Bonjour " + p.nom);
    }
    public void ajouterPtsVie(int nbPts) {
        ptsDeVie += nbPts;
    }

    public abstract void rencontrer (Personnage personnage);


    public void recontrer (int nbFois, Personnage p) {
        for (int i = 0; i < nbFois; i++) {
            rencontrer(p);
        }
    }

    public int compareTo(Personnage personnage) {
        return this.nom.compareTo(personnage.nom);
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "nom='" + nom + '\'' +
                ", ptsDeVie=" + ptsDeVie +
                '}';
    }
}
