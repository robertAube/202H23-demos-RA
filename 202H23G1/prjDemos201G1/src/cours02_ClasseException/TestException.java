package cours02_ClasseException;

public class TestException {
    public TestException() {
        lancerMonException();
    }

    private void lancerMonException() {
        throw new MonException("Avec mon message");
    }

    public static void main(String[] args) {
        new TestException();
    }
}
