package cours07_interface;

public class TestDesVivants {
    public TestDesVivants() {
        Medecin m1 = new Medecin("Joe", 100);

        jouerAvecVivant.faireManger(m1, 3);
    }

    public static void main(String[] args) {
        new TestDesVivants();
    }
}
