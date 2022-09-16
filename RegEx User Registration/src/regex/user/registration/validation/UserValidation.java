package regex.user.registration.validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import regex.user.registration.validation.UserValidationException.ExceptionType;

public class UserValidation {

	public static void main(String[] args) throws UserValidationException {
		System.out.println("Welcome to Regular Expressions program to validate user entries in a User Registration System!\n");
		UserValidation userEntry = new UserValidation();
		
		userEntry.validateEntries();
	}
	
	public void validateEntries() throws UserValidationException {
		System.out.println("\nEnter First Name : ");
		validateName(getUserInput());
		
		System.out.println("\nEnter Last Name : ");
		validateName(getUserInput());
		
		System.out.println("\nEnter Email Id : ");
		validateEmail(getUserInput());
		
		System.out.println("\nEnter Mobile Number : ");
		validateMobileNumber(getUserInput());
		
		System.out.println("\nEnter Password : ");
		validatePassword(getUserInput());
	}
	

	public boolean validatePassword(String input) throws UserValidationException {	

		String password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";		
		
		try {
			if(input.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			System.out.println("\nValidating Password...");
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
		return match(password, input);
	}

	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public boolean validateMobileNumber(String input) throws UserValidationException {
		
		String mobile = "^[0-9]{2}\\s[0-9]{10}$";
		
		try {
			if(input.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			System.out.println("\nValidating Mobile Number...");
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
		return match(mobile, input);
	}
	
	public boolean validateEmail(String input) throws UserValidationException {
		
		String email = "^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";
		
		try {
			if(input.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			System.out.println("\nValidating Email...");
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
		return match(email, input);
	}
	
	public boolean match(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		
		boolean result = (match.matches());
		printResult(result, input);
		return result;
	}
	
	public boolean validateName(String input) throws UserValidationException {
		
		String name = "^[A-Z][a-zA-Z]{2,}$";
		boolean match;
		
		try {
			if(input.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "You have entered an empty string!\nPlease enter a valid input.");
			}
			System.out.println("\nValidating Name...");
		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "You have entered a NULL input!\nPlease enter a valid input.");
		}
		return match(name, input);
	}
	
	public void printResult(boolean isOkay, String input) {
		if (isOkay)
			System.out.println("'" + input + "'\tVALID");
		else
			System.out.println("'" + input + "'\tINVALID");
	}
}
