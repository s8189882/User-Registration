package regex.user.registration.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
class ParameterisedTest {
	public UserValidation check;
	public String email;
	public boolean result;

	public ParameterisedTest(String email, boolean result) {
		super();
		this.email = email;
		this.result = result;
	}

	@Before
	public void initialise() {
		check = new UserValidation();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true},
			{"abc", false}, {"abc@.com.my", false}, {"abc.100@yahoo.com", true},
			{"abc123@gmail.a", false}, {"abc111@abc.com", true}, {"abc123@.com", false},
			{"abc-100@abc.net", true}, {"abc123@.com.com", false},
			{"abc.100@abc.com.au", false}, {".abc@abc.com", false},
			{".abc@abc.com", false}, {"c", false}, {"abc()*@gmail.com", false},
			{"abc@gmail.com.com", false}, {"abc@%*.com", false},
			{"abc+100@gmail.com", true}, {"abc..2002@gmail.com", true},
			{"abc.@gmail.com", true}, {"abc@abc@gmail.com", false},
			{"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}
		});
	}
	
	@Test
	public void testWhenEmail_isEntered_returnAppropriateResult() throws UserValidationException {
		boolean match = check.validateEmail(this.email);
		assertEquals(this.result, match);
	}
}
