package cours07_polymorphe_interface;

public class JouerAvecVivant {
    public static void faireManger(Vivant vivant, int nbFois) {
        System.out.println("Je te fais manger " + nbFois + " " + vivant.getClass().getSimpleName() + " :");
        for (int i = 0; i < nbFois; i++) {
            vivant.manger();
        }
    }
}
