package cours07_polymorphe_interface;

public class JouerAvecVivant {
    public static void faireManger(Vivant vivant, int nbFois) {
        for (int i = 0; i < nbFois; i++) {
            vivant.manger();
        }
    }
}
