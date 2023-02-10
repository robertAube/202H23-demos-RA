package cours06_enumEnrichie;

public enum JourSemaine {

    //LUNDI("Monday"), MARDI ("Tuesday"), MERCREDI ("Wednesday"), JEUDI ("Thursday"), VENDREDI("Friday"), SAMEDI("Saturday"), DIMANCHE("Sunday");
    LUNDI("Monday", true), MARDI ("Tuesday", true), MERCREDI ("Wednesday", true), JEUDI ("Thursday", true), VENDREDI("Friday", true), SAMEDI("Saturday", true), DIMANCHE("Sunday", false);

    private String enEnglais;
    private boolean estTravaille;

    private JourSemaine(String nom, boolean estTravaille) {
        this.enEnglais = nom;
        this.estTravaille = estTravaille;
    }

    public boolean getEstTravaille() {
        return estTravaille;
    }

    public String getEnAnglais() {
        return enEnglais;
    }
    public String getAbreviation() {
        return name().toLowerCase().substring(0,3);
    }
    public String getNom() {
        return name().toLowerCase();
    }
    public int getNo() {
        return ordinal() + 1;
    }
}
