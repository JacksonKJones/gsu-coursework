package chapter04;

import java.util.Scanner;

public class E4_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Letter: ");
		char letter = input.next().charAt(0);
		
		if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
		
			System.out.print(letter + " is a vowel");
		
		else if (Character.isLetter(letter))
			
			System.out.print(letter + " is a consonant");
		
		else
			
			System.out.print("Invalid input");
			
		input.close();
		
	}
	
}
