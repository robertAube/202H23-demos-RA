package cours02_MonException;

public class TestException {
    public TestException() {
        provoquerException();

        try {
            provoquerExceptionAvecThrows();
        } catch (MonException e) {
            System.out.println("problème réglé dans le contructeur!");
        }
    }

    private void provoquerException() {
        try {
            throw new MonException("Problème!!!");
        } catch (MonException e) {
            System.out.println("Problème réglé");
        }
    }


    private void provoquerExceptionAvecThrows() throws MonException {
        throw new MonException("Problème!!!");
    }


    public static void main(String[] args) {
        new TestException();
    }
}
