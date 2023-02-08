package cours06_enumEnrichi;

public enum JourSemaine {
    LUNDI("Lundi", "Travaillé"), MARDI ("Mardi", "Travaillé"), MERCREDI ("Mercredi", "Travaillé"), JEUDI ("Jeudi", "Travaillé"), VENDREDI("Vendredi", "Travaillé"), SAMEDI("Samedi", "cong0é"), DIMANCHE("Dimanche", "congé");

    private String nom;
    private String description;

    private JourSemaine(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getLeNom() {
        return nom;
    }
    public String getAbreviaiton() {
        return name().toLowerCase().substring(0,3);
    }
    public String getNom() {
        return name().toLowerCase();
    }
    public int getNo() {
        return ordinal() + 1;
    }
}
