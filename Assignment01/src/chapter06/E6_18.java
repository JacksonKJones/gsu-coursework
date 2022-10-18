package chapter06;

import java.util.Scanner;

public class E6_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		String pass = input.next();
		
		if (pass.length() >= 8 && isOnlyLetAndDig(pass) && containsDigits(pass))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		
		
		input.close();
		
	}
	
	public static boolean isOnlyLetAndDig(String pass) {
		
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isLetterOrDigit(pass.charAt(i))) {
				return false;	
			}	
		}
		return true;
	}
	
	public static boolean containsDigits(String pass) {
		
		int numDig = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) 
				numDig++;
			if (numDig >= 2)
				return true;	
		}
		return false;
	}
}
