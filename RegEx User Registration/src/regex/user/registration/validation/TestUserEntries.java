package regex.user.registration.validation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TestUserEntries {

	@Test
	public void testWhenFirstName_isProper_returnTrue() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("Priya");
		assertEquals(true, result);
	}
	
	@Test
	public void testWhenFirstName_isNotProper_returnFalse() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("123Priya");
		assertEquals(false, result);
	}
	
	@Test
	public void testWhenFirstName_isNull_throwException() {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateName(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenFirstName_isEmpty_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateName("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenLastName_isProper_returnTrue() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("Kulkarni");
		assertTrue(result);
	}
	
	@Test
	public void testWhenLastName_isNotProper_returnFalses() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("Pi321");
		assertFalse(result);
	}
	
	@Test
	public void testWhenLastName_isNull_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateName(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenLastName_isEmpty_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateName("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenEmail_isProper_returnTrue() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateEmail("priya.pp314@gmail.com");
		assertTrue(result);
	}
	
	@Test
	public void testWhenEmail_isNotProper_returnTrue() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateEmail("_priyaprakash@google.co.aus");
		assertFalse(result);
	}
	
	@Test
	public void testWhenEmail_isNull_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateEmail(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenEmail_isEmpty_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateEmail("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenMobileNumber_isProper_returnTrue() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateMobileNumber("91 9177882347");
		assertTrue(result);
	}
	
	@Test
	public void testWhenMobileNumber_isNotProper_returnFalses() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateMobileNumber("7263849386");
		assertFalse(result);
	}
	
	@Test
	public void testWhenMobileNumber_isNull_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateMobileNumber(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenMobileNumber_isEmpty_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validateMobileNumber("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void testWhenPassword_isProper_returnTrue() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validatePassword("Password1323$pkkakmd");
		assertTrue(result);
	}
	
	@Test
	public void testWhenPassword_isNotProper_returnFalses() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = validate.validatePassword("passwordjsnfksjf");
		assertFalse(result);
	}
	
	@Test
	public void testWhenPassword_isNull_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validatePassword(null);
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void testWhenPassword_isEmpty_throwException() throws UserValidationException {
		UserValidation validate = new UserValidation();
		boolean result = false;
		try {
			result = validate.validatePassword("");
		} catch (UserValidationException e) {
			assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}