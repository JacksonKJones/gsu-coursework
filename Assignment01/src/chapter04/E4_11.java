package chapter04;

import java.util.Scanner;

public class E4_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();
		
		if (value >= 0 && value <= 9)
		
			System.out.print("The hex value is: " + value);
		
		else if (value >= 10 && value <= 15)
			
			System.out.print("The hex value is: " + (char)(value + 'A' - 10));
		
		else
			
			System.out.print("Invalid input");
			
		input.close();
		
	}
	
}
