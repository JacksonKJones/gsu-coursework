package chapter02;

import java.util.Scanner;

public class E2_6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000:");
		int num = input.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= 3; i++) {
			sum += num % 10;
			num = num / 10;

		}
			
		System.out.println("The sum of the digits is " + sum);
		
		input.close();

	}
}
