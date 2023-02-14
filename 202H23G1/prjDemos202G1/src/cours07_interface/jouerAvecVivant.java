package cours07_interface;

public class jouerAvecVivant {
    public static void faireManger(Vivant vivant, int nbFois) {
        for (int i = 0; i < nbFois; i++) {
            vivant.manger();
        }
    }
}
