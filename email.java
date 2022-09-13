
import java.util.Scanner;
import java.util.regex.Pattern;

public class email {
	Scanner s = new Scanner(System.in);

	/*
	 * public void firstName() { System.out.println("Enter FirstName:"); String
	 * FirstName = s.next(); Boolean result = Pattern.matches("[A-Z][a-z]{3,}",
	 * FirstName); if (result) { System.out.println("FirstName valid: "); } else {
	 * System.out.println("Please Enter FirstName properly: "); } } public void
	 * lastName() { System.out.println("Enter LastName:"); String LastName =
	 * s.next(); Boolean result = Pattern.matches("[A-Z][a-z]{3,}", LastName);
	 * if(result) { System.out.println("LastName valid: "); }else {
	 * System.out.println("Please enter lastname prpperly: "); }
	 */
	public void emailCheck() {
		System.out.println("Enter email: ");
		String Email = s.next();
		boolean result = Pattern.matches("[A-Za-z0-9+_.-]+@(.+)$", Email);
		if (result) {
			System.out.println("valid");
		} else {
			System.out.println("Please enter email correctly");
		}
	}

	public static void main(String[] args) {
		email email = new email();
		email.emailCheck();
	}
}
