package personalValidation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonalInfoValidation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
	
		String email = scnr.nextLine();
		System.out.println("You entered " + email);
		
		String userName = scnr.nextLine();
		System.out.println("You entered " + userName);
		
		String phoneNumber = scnr.nextLine();
		System.out.println("You entered " + phoneNumber);
		
		String validDate = scnr.nextLine();
		System.out.println("You entered " + validDate);
		
	}  private static String isValidName(Scanner scnr, String isValidName) {
		boolean isValid = false;
		String userName = scnr.nextLine();
		String regex = "^[A-Z][a-z]{0,29}";
		boolean answer = userName.matches("^[A-Z][a-z]{0,29}");
		System.out.println("Please enter a name.");
		if (userName.matches(regex)) {
			isValid = true;
			System.out.println("Name is valid");
		} else {
			System.out.println("Name is invalid");
			isValid = false;
		}
	return userName;

	} private static String isValidEmail(Scanner scnr, String isValidEmail) {
		boolean isValid = false;
		String email = scnr.nextLine();
		String regex ="\\w{5,10}@\\w{5,10}.";
		boolean answer2 = email.matches(regex);
		System.out.println("Please enter an email address!");
		if(email.matches("\\w{5,10}@\\w{5,10}.")) {
			isValid = true;
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is invaild!");
		}while (!isValid);
		return email;
	
	} public static String phoneNumber(Scanner scnr, String phoneNumber) {
		boolean isValid = false;
		String phoneNumber1 = 0;
		phoneNumber1 = scnr.nextInt();
		String regex = "\\d{3}-\\d{3}-\\d{4}";
		boolean answer3 = phoneNumber1.matches(regex);
		System.out.println("Please enter a phone number!");
		if(phoneNumber1.matches("\\d{3}-\\d{3}-\\d{4}")){
			isValid = true;
			System.out.println("Phone number is valid");
		}else {
			System.out.println("Phone number is invalid");
		}
		return phoneNumber1;
	}  public static String validDate(String validDate) { 
		boolean isValid = false;
		String regex = "\\d{2}/\\d{2}/\\d{4}";
		boolean answer4 = validDate.matches(regex);
		System.out.println("Please enter the a date1");
		if (validDate.matches(regex)) {
			isValid = true;
			System.out.println("Date is valid!");
		}else {
			System.out.println("Date was not incorrectly!");
		}
		return validDate;

	}
	}
		
		