import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = console.next();
		
		String namePattern = "[A-Z][a-z]{3,}";
		System.out.println("Your name is: " +(name.matches(namePattern)?"Valid":"Invalid"));
		
		System.out.println("Enter Mobile Number: ");
		String mobile = console.next();
		
		String mobilePattern = "[7-9][0-9]{9}";
		System.out.println("Your Mobile number is: "+(mobile.matches(mobilePattern)?"Valid":"Invalid"));
		
		System.out.println("Enter your age: ");
		String age = console.next();
		
		String agePattern = "[0-9]{2}";
		System.out.println("Your age is: "+(age.matches(agePattern)?"Valid":"Invalid"));
		
		console.close();
	}

}
