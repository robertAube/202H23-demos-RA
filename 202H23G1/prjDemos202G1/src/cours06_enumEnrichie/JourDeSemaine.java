package cours06_enumEnrichie;

public class JourDeSemaine {
    public JourDeSemaine() {
        //demoEnum();
        demoCours202();
    }

    private void demoCours202() {
        JourSemaine jourS;

        jourS = JourSemaine.MARDI;

        System.out.println(jourS.name());
        System.out.println(jourS.ordinal());
        System.out.println(jourS.getNom());
        System.out.println(jourS.getNo());
        System.out.println(jourS.getEnAnglais());
        System.out.println(jourS.getAbreviation());
        System.out.println(jourS.getEstTravaille());
    }

    private void demoEnum() {
        JourSemaine jourS;

        jourS = JourSemaine.LUNDI;

        System.out.println(quelJour(jourS));

        jourS = JourSemaine.DIMANCHE;

        System.out.println(quelJour(jourS));
    }

    private String quelJour(JourSemaine jourDeSemaine) {
        String strJourSem = "" ;
        switch (jourDeSemaine) {
            case LUNDI:
                strJourSem = "lundi";
                break;
            case MARDI:
                strJourSem = "mardi";
                break;
            case MERCREDI:
                strJourSem = "mercredi";
                break;
            case DIMANCHE:
                strJourSem = "dimanche";
                break;
        }
        return  strJourSem;
    }


    public static void main(String[] args) {
        new JourDeSemaine();
    }
}
