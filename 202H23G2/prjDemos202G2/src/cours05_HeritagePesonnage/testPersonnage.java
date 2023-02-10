package cours05_HeritagePesonnage;

public class testPersonnage {
    public testPersonnage() {
//        test1();
//        test2();
//        test3();
        test4();
    }

    private void test4() {
        Personnage p1 = new Paysan("Jean Paysan", 100);
        Personnage p2 = new Guerrier("Hercule", 200);
        Personnage p3 = new Medecin("Victor", 40);
        p1.rencontrer(p2);
        System.out.println(p1.toString());
        p2.rencontrer(p1);
        System.out.println(p1.toString());
        p3.rencontrer(p1);
        System.out.println(p1.toString());
    }

    private void test3() {
        Personnage p1 = new Paysan("Jean Paysan", 100);
        Personnage p2 = new Guerrier("Hercule", 200);
        p1.rencontrer(p2);
        System.out.println(p1.toString());
        p2.rencontrer(p1);
        System.out.println(p1.toString());
    }

    private void test2() {
        Personnage p1 = new Paysan("Jean Paysan", 100);
        Personnage p2 = new Guerrier("Hercule", 200);

        System.out.println(p1);
        System.out.println(p2);
        p1.saluer();
        p2.saluer();
    }

    private void test1() {
        Paysan p1 = new Paysan("Jean Paysan", 100);
        Guerrier p2 = new Guerrier("Hercule", 200);

        System.out.println(p1);
        System.out.println(p2);
        p1.saluer();
        p2.saluer();
    }

    public static void main(String[] args) {
        new testPersonnage();
    }
}
