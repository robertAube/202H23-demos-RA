package cours04_vaiablbleDeClasseStatic;

public class PizzaStaticTest {
    public PizzaStaticTest() {
        System.out.println(Pizza.getNbInstance());
        new Pizza(0,1,"jaune",16);
        System.out.println(Pizza.getNbInstance());
        new Pizza(0,1,"jaune",16);
        System.out.println(Pizza.getNbInstance());
        new Pizza(0,1,"jaune",16);
        System.out.println(Pizza.getNbInstance());
    }

    public static void main(String[] args) {
        new PizzaStaticTest();
    }
}
