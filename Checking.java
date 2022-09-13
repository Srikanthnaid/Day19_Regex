package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Checking {
	Scanner s = new Scanner(System.in);

	public void firstName() {
		System.out.println("Enter FirstName:");
		String FirstName = s.next();
		Boolean result = Pattern.matches("[A-Z][a-z]{3,}", FirstName);
		if (result) {
			System.out.println("FirstName valid: ");
		} else {
			System.out.println("Please Enter FirstName properly: ");
		}
	}
	public void lastName() {
		System.out.println("Enter LastName:");
		String LastName = s.next();
		Boolean result = Pattern.matches("[A-Z][a-z]{3,}", LastName);
		if(result) {
			System.out.println("LastName valid: ");
		}else {
			System.out.println("Please enter lastname prpperly: ");
		}
	}
	public static void main(String[] args) {
		Checking name = new Checking();
		name.firstName();
		name.lastName();
	}
}
