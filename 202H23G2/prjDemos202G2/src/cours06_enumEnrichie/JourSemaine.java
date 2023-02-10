package cours06_enumEnrichie;

public enum JourSemaine {
    LUNDI("Monday", true), MARDI("Tuesday", true) , MERCREDI("Wedneday", true) , JEUDI("Thursday", true) , VENDREDI("Friday", true), SAMEDI("Saturday", false), DIMANCHE("Sunday", false);

    private String enEnglais;
    private boolean estTravaille;

    public boolean estTravaille() {
        return estTravaille;
    }

    private JourSemaine(String enEnglais, boolean estTravaille) {
        this.enEnglais = enEnglais;
        this.estTravaille = estTravaille;
    }

    public String getNom() {
        return name().toLowerCase();
    }
    public String getAbreviation() {
        return name().toLowerCase().substring(0,3);
    }
    public String getEnEnglais() {
        return enEnglais;
    }

    public void setEstTravaille(boolean estTravaille) {
        this.estTravaille = estTravaille;
    }
}
