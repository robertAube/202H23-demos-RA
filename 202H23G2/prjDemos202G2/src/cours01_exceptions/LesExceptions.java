package cours01_exceptions;

import java.io.IOException;

public class LesExceptions {
    public LesExceptions() {
        LaArithmeticException();
    }
    public void LaArithmeticException() {
        try {
            lancerUneException();
        } catch (ArithmeticException exception) {
        }

        System.out.println("Fin LaArithmeticException!");
    }

    public void LaIOException() {
        try {
            lancerUneIOExceptionV2();
        } catch (IOException e) {
            System.out.println("Erreur!");
        }

        System.out.println("Fin LaIOException!");
    }

    private void lancerUneExceptionV1() {
        try {
            throw new ArithmeticException("Test exception");
        } catch (ArithmeticException exception) {
            System.out.println("Exception traité");
        }
    }

    private void lancerUneException() {
        throw new ArithmeticException("Test exception");
    }
    private void lancerUneIOException() {
        try {
            throw new IOException("Test IOException");
        } catch (IOException e) {
            System.out.println("IOException est déclenché");
        }
    }

    private void lancerUneIOExceptionV2() throws IOException { //IOException est propagé
            throw new IOException("Test IOException");
    }


    public static void main(String[] args) {
        new LesExceptions();
    }
}
