package cours02_ClasseException;

public class MonException extends RuntimeException {
    public MonException() {
        super(); //appel du contructeur de RuntimeException
    }

    public  MonException(String message) {
        super(message);
    }
}
