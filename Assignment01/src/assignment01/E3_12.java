package assignment01;

import java.util.Scanner;

public class E3_12 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int palin = input.nextInt();
		
		int p1 = palin / 100;
		int p3 = palin % 10;
		
		System.out.print(palin);
		
		if (p1 == p3) {
			System.out.print(" is a palindrome");
		} else {
			System.out.print(" is not a palindrome");
		}

		input.close();
		
	}
}