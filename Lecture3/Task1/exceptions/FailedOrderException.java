package exceptions;

public class FailedOrderException extends Exception {
	public FailedOrderException(String message) {
		super(message);
	}
}
