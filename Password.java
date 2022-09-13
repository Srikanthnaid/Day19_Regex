
import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
	Scanner s = new Scanner(System.in);

	public void passWord() {
		System.out.println("Enter password: ");
		String PassWord = s.next();
		Boolean result = Pattern.matches("[A-Za-z0-9`~!@#$%^&*()_|+\\-=?;:'\",.<>]{8}", PassWord);
		if (result) {
			System.out.println("valid");
		} else {
			System.out.println("please enter correctly");
		}
	}

	public static void main(String[] args) {
		Password password = new Password();
		password.passWord();
	}
}
