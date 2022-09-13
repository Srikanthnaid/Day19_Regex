import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	public void nameCheck() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter FirstName: ");
		String FirstName = s.next();
		
		//check if the given name is starting with Cap or not.
		boolean result = Pattern.matches("[A-Z][a-z]{3,}", FirstName);
		if(result) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		s.close();
	}
	public static void main(String[] args) {
		FirstName obj = new FirstName();
		obj.nameCheck();
	}
}
