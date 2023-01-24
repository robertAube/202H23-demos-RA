package cours01_exceptions;

public class LesExceptions {
    public LesExceptions() {
    }

    private void lancerUneException()  {
        throw new ArithmeticException("Test exception");
    }


    public static void main(String[] args) {
        new LesExceptions();
    }
}
