
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailSamples {
	Scanner s = new Scanner(System.in);

	public void emailSample() {
		System.out.println("Enter Email: ");
		String PassWord = s.next();
		Boolean result = Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$\",email", PassWord);
		if (result) {
			System.out.println("valid");
		} else {
			System.out.println("please enter correctly");
		}
	}

	public static void main(String[] args) {
		EmailSamples email = new EmailSamples();
		email.emailSample();
	}
}
