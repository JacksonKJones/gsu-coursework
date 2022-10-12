package chapter04;

import java.util.Scanner;

public class E4_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Letter: ");
		char letter = input.next().charAt(0);
		
		System.out.print("The corresponding number is: ");
		
		if (letter == 'A' || letter == 'B' || letter == 'C')
		
			System.out.print("2");
		
		else if (letter == 'D' || letter == 'E' || letter == 'F')
			
			System.out.print("3");
		
		else if (letter == 'G' || letter == 'H' || letter == 'I')
			
			System.out.print("4");
		
		else if (letter == 'J' || letter == 'K' || letter == 'L')
			
			System.out.print("5");
		
		else if (letter == 'M' || letter == 'N' || letter == 'O')
			
			System.out.print("6");
		
		else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')
			
			System.out.print("7");
		
		else if (letter == 'T' || letter == 'U' || letter == 'V')
			
			System.out.print("8");
		
		else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
			
			System.out.print("9");
		
		else
			
			System.out.print("Invalid input");
			
		input.close();
		
	}
	
}
