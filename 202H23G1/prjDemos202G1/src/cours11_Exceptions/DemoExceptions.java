package cours11_Exceptions;

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
        //testerLancerUneException();
        //demoExceptionPlusieursCatchs();
        //demoClauseFinally();
        demoClauseFinallySansCatch();
        System.out.println("Fin du constructeur DemoExceptions()");
    }

    private void demoClauseFinallySansCatch()  {
        try {
            throw new RuntimeException("Je suis une RuntimeException");
        }
        finally {
            System.out.println("Ce code est toujours exécuté!!!");
        }

    }

    private void demoClauseFinally() {
        try {
            lancerUneException(new NumberFormatException("Je suis une NumberFormatException"));
            lancerUneException(new RuntimeException("Je suis une RuntimeException"));
        }
        catch (NumberFormatException e) {
            System.out.println("1 - " + e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        catch (RuntimeException e) {
            System.out.println("2 - " + e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        catch (Exception e) {
            System.out.println("3 - " + e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        finally {
            System.out.println("Ce code est toujours exécuté!!!");
        }

        System.out.println("Fin demoExceptionPlusieursCatchs()");
        System.out.println("Fin demoClauseFinally()");
    }

    private void demoExceptionPlusieursCatchs() {
        try {
            lancerUneException(new NumberFormatException("Je suis une NumberFormatException"));
            lancerUneException(new RuntimeException("Je suis une RuntimeException"));
        }
        catch (NumberFormatException e) {
            System.out.println("1 - " + e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        catch (RuntimeException e) {
            System.out.println("2 - " + e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        catch (Exception e) {
            System.out.println("3 - " + e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }

        System.out.println("Fin demoExceptionPlusieursCatchs()");
    }

    private void testerLancerUneException() {
        try {
            lancerUneException(new RuntimeException("RuntimeException"));
            System.out.println("Après appel lancerUneException()");
        }
        catch (Exception e ) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
        System.out.println("Fin testerLancerUneException()");
    }

    private void lancerUneException(Exception exception)  throws Exception {
      //  throw exception;
      //  System.out.println("Fin lancerUneException()"); //impossible de s'y rendre
    }

    public static void main(String[] args) {
        new DemoExceptions();
        System.out.println("Fin main()");
    }
}
