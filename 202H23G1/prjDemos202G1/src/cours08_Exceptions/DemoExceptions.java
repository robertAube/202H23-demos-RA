package cours08_Exceptions;

/*
 * La hiérarchie partielle des Exceptions en Java:
 * Object
 * └── Throwable
 *     ├── Exception
 *     │   ├── RuntimeException (N'ont pas besoin d'être dans des blocs try/catch)
 *     │   │   ├── ArithmeticException
 *     │   │   ├── IllegalArgumentException
 *     │   │   │   └── NumberFormatException
 *     │   │   ├── NullPointerException
 *     │   │   └── IndexOutOfBoundsException
 *     │   │       └── ArrayIndexOutOfBoundsException
 *     │   └── IOException
 *     │       └── FileNotFoundException
 *     └── Error
 *
 * Seuls les exceptions héritant de la classe RuntimeException n'ont pas besoin d'être détectées impérativement par des blocs try/catch.
 * Pour une liste complète des exceptions, faire une recherche avec Google de "java 17 api Throwable" et naviguer dans TREE puis All Packages.
 */
public class DemoExceptions {
    public DemoExceptions() {
        testerLancerUneException();
        System.out.println("Fin du constructeur DemoExceptions()");
    }

    private void demoClauseFinallySansCatch()  {
        System.out.println("Fin demoClauseFinallySansCatch()");
    }

    private void demoClauseFinally() {
        System.out.println("Fin demoClauseFinally()");
    }

    private void demoExceptionPlusieursCatchs() {
        System.out.println("Fin demoExceptionPlusieursCatchs()");
    }

    private void testerLancerUneException() {
        lancerUneException();
        System.out.println("Fin testerLancerUneException()");
    }

    private void lancerUneException()  {
        int a = 1/0;
        System.out.println("Fin lancerUneException()");
    }

    public static void main(String[] args) {
        new DemoExceptions();
        System.out.println("Fin main()");
    }
}
