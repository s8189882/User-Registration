package regex.user.registration.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestUserEntries {

	@Test
	public void testWhenFirstName_isProper_returnTrue() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateName.validate("Priya");
		assertEquals(true, result);
	}
	
	@Test
	public void testWhenFirstName_isNotProper_returnFalse() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateName.validate("123Priya");
		assertEquals(false, result);
	}
	
	@Test
	public void testWhenFirstName_isNull_throwException() {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateName.validate(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenFirstName_isEmpty_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateName.validate("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenLastName_isProper_returnTrue() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateName.validate("Kulkarni");
		assertTrue(result);
	}
	
	@Test
	public void testWhenLastName_isNotProper_returnFalses() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateName.validate("Pi321");
		assertFalse(result);
	}
	
	@Test
	public void testWhenLastName_isNull_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateName.validate(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenLastName_isEmpty_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateName.validate("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenEmail_isProper_returnTrue() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmail.validate("priya.pp314@gmail.com");
		assertTrue(result);
	}
	
	@Test
	public void testWhenEmail_isNotProper_returnTrue() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateEmail.validate("_priyaprakash@google.co.aus");
		assertFalse(result);
	}
	
	@Test
	public void testWhenEmail_isNull_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateEmail.validate(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenEmail_isEmpty_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateEmail.validate("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenMobileNumber_isProper_returnTrue() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateMobileNumber.validate("91 9177882347");
		assertTrue(result);
	}
	
	@Test
	public void testWhenMobileNumber_isNotProper_returnFalses() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validateMobileNumber.validate("7263849386");
		assertFalse(result);
	}
	
	@Test
	public void testWhenMobileNumber_isNull_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateMobileNumber.validate(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenMobileNumber_isEmpty_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validateMobileNumber.validate("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenPassword_isProper_returnTrue() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword.validate("Password1323$pkkakmd");
		assertTrue(result);
	}
	
	@Test
	public void testWhenPassword_isNotProper_returnFalses() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = userValidation.validatePassword.validate("passwordjsnfksjf");
		assertFalse(result);
	}
	
	@Test
	public void testWhenPassword_isNull_throwException() {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validatePassword.validate(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenPassword_isEmpty_throwException() throws UserValidationException {
		UserValidation userValidation = new UserValidation();
		boolean result = false;
		try {
			result = userValidation.validatePassword.validate("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}