package regex.user.registration.validation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TestUserEntries {

	@Test
	public void testWhenFirstName_isProper_returnTrue() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("Priya");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testWhenFirstName_isNotProper_returnFalse() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("123Priya");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testWhenLastName_isProper_returnTrue() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("Kulkarni");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenLastName_isNotProper_returnFalses() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateName("Pi321");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenEmail_isProper_returnTrue() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateEmail("priya.pp314@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenEmail_isNotProper_returnTrue() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateEmail("_priyaprakash@google.co.aus");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenMobileNumber_isProper_returnTrue() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateMobileNumber("91 9177882347");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenMobileNumber_isNotProper_returnFalses() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validateMobileNumber("7263849386");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenPassword_isProper_returnTrue() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validatePassword("Password1323$pkkakmd");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenPassword_isNotProper_returnFalses() {
		UserValidation validate = new UserValidation();
		boolean result = validate.validatePassword("passwordjsnfksjf");
		Assert.assertFalse(result);
	}
}