package regex.user.registration.validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String[] args) {
		System.out.println("Welcome to Regular Expressions program to validate user entries in a User Registration System!\n");
		UserValidation userEntry = new UserValidation();
		
		System.out.println("\nEnter First Name : ");
		userEntry.validateFirstName(userEntry.getUserInput());
	}
	
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public void validateFirstName(String input) {
		
		String firstName = "^[A-Z][a-zA-Z]{2,}$";
		
		Pattern pattern = Pattern.compile(firstName);
		Matcher match = pattern.matcher(input);
		
		System.out.println("\nValidating First Name...");
		printResult(match.matches(), input);
	}
	
	public void printResult(boolean isOkay, String input) {
		if (isOkay)
			System.out.println("'" + input + "'\tVALID");
		else
			System.out.println("'" + input + "'\tINVALID");
	}
}
