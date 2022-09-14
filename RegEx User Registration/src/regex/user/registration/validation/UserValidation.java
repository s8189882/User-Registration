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
	}
	
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public void validateEmail(String input) {
		
		String email = "^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$";
		
		System.out.println("\nValidating Email...");
		match(email, input);
	}
	
	public void match(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		
		printResult(match.matches(), input);
	}
	
	public void validateName(String input) {
		
		String name = "^[A-Z][a-zA-Z]{2,}$";
		
		System.out.println("\nValidating Name...");
		match(name, input);
	}
	
	public void printResult(boolean isOkay, String input) {
		if (isOkay)
			System.out.println("'" + input + "'\tVALID");
		else
			System.out.println("'" + input + "'\tINVALID");
	}
}