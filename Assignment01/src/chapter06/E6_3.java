package chapter06;

import java.util.Scanner;

public class E6_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if (isPalindrome(num))
			System.out.println(num + " is a palindrome.");
		else
			System.out.println(num + " is not a palindrome.");
		
		input.close();
	}
	
	public static int reverse(int number) {
		
		String rev = "";
		String x = number + "";
		
		for (int i = x.length() - 1; i >= 0; i--)
			rev += x.charAt(i);
		
		return Integer.parseInt(rev);
	}
	
	public static boolean isPalindrome(int number) {
		
		if (number == reverse(number))
			return true;
		else
			return false;
	}
	
}
