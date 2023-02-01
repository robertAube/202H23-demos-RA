package cours04_attributStatic;

public class Demo {
    public Demo() {
        System.out.println(Pizza.getCPT());

        test();
        System.out.println(Pizza.getCPT());
    }

    private void test() {

        Pizza p1 = new Pizza(1,1,"bleu",2);

        System.out.println(Pizza.getCPT());    }


    public static void main(String[] args) {
        new Demo();
    }
}
