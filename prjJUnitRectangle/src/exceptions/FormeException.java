package exceptions;

public class FormeException extends RuntimeException {

	public FormeException() {
		super("FormeException");
	}

	public FormeException(String message) {
		super(message);
	}
}
