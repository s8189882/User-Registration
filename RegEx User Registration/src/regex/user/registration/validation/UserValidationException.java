package regex.user.registration.validation;

public class UserValidationException extends Exception {
	ExceptionType type;
	
	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY
	}

	public UserValidationException() {

	}

	public UserValidationException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
