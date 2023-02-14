package cours07_polymorphe_interface;

public abstract class Personnage {
    private int ptsVie;
    private String nom;

    public Personnage(String nom, int ptsVie) {
        this.ptsVie = ptsVie;
        this.nom = nom;
    }

    protected String getNom() { //protected = accessible dans la classe et dans les sous classe
        return nom;
    }

    public void addPtsVie(int ptsVie) {
        this.ptsVie += ptsVie;
    }

    public void saluer() {
        System.out.println("Salut!");
        System.out.print("Je suis un " + this.getClass().getSimpleName()); //retourne le nom de l'instance
        System.out.println (" et je me nomme " + nom); //retourne le nom de l'instance
    }

    public abstract void rencontrer(Personnage p);
    @Override
    public String toString() {
        //todo on aimerait que ce soit vraiment le type de l'objet qui soit affiché
        return "Personnage{" +
                "ptsVie=" + ptsVie +
                ", Nom='" + nom + '\'' +
                '}';
    }
}
