package cours01_exceptions;

import java.io.IOException;

public class LesExceptions {
    public LesExceptions() {
        try {
            lancerUneException();
        } catch (IOException e) {
            System.out.println("Erreur de fichier");
            ;
        }
        System.out.println("test!!!!");
    }

    private void lancerUneExceptionV1() {
        try {
            throw new RuntimeException("Test exception");
        } catch (RuntimeException exception) {
            System.out.println("Exception \n" + exception.getMessage());
            System.out.println(exception.toString());
        }
        System.out.println("suite");
    }

    private void lancerUneException() throws IOException {
        throw new IOException("Test exception");
    }


    public static void main(String[] args) {
        new LesExceptions();
    }
}
