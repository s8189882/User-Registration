package regex.user.registration.validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String[] args) {
		System.out.println("Welcome to Regular Expressions program to validate user entries in a User Registration System!\n");
		UserValidation userEntry = new UserValidation();
		
		userEntry.validateEntries();
	}
	
	public void validateEntries() {
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
	
	public boolean validatePassword(String input) {
  
		String password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";		
		
		System.out.println("\nValidating Password...");
		return match(password, input);
	}

	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public boolean validateMobileNumber(String input) {
		
		String mobile = "^[0-9]{2}\\s[0-9]{10}$";
		
		System.out.println("\nValidating Mobile Number...");
		return match(mobile, input);
	}
	
	public boolean validateEmail(String input) {
		
		String email = "^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";
		
		System.out.println("\nValidating Email...");
		return match(email, input);
	}
	
	public boolean match(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		
		boolean result = (match.matches());
		printResult(result, input);
		return result;
	}
	
	public boolean validateName(String input) {
		
		String name = "^[A-Z][a-zA-Z]{2,}$";
		
		System.out.println("\nValidating Name...");
		return match(name, input);
	}
	
	public void printResult(boolean isOkay, String input) {
		if (isOkay)
			System.out.println("'" + input + "'\tVALID");
		else
			System.out.println("'" + input + "'\tINVALID");
	}
}
