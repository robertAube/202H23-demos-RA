package cours06_enumEnrichi;

public class JourDeSemaine {
    public JourDeSemaine() {
//        demoSwitch();
        demoEnum();
    }

    private void demoEnum() {
        JourSemaine jourS;

        jourS = JourSemaine.LUNDI;

        System.out.println(quelJour(jourS));

        System.out.println(jourS.getNom() + ", " + jourS.getNo());

        jourS = JourSemaine.DIMANCHE;

        System.out.println(quelJour(jourS));

        System.out.println(jourS.getNom() + ", " + jourS.getNo());
    }

    public void demoSwitch() {
        for (int noJour = 1; noJour <= 7; noJour++) {
            System.out.println("Jour " + noJour + " -> " + quelJour(noJour));
        }
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


    private String quelJour(int noJour) {
        String strJourSem = "d";

        switch (noJour) {
            case 1:
                strJourSem = "dimanche";
                break; //sort du switch (ne pas mettre ailleurs que dans des switch();
            case 2:
                strJourSem = "lundi";
                break;
            case 3:
                strJourSem = "mardi";
                break;
            case 4:
            case 5:
                System.out.println(noJour);
            case 6:
                strJourSem = "mardi";
                break;
            default:
                throw new IllegalArgumentException("noJour invalide : " + noJour);
        }
        return strJourSem;
    }

    public static void main(String[] args) {
        new JourDeSemaine();
    }
}
