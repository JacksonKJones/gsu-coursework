package chapter06;

import java.util.Scanner;

public class E6_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to sum the digits of ");
		int sum = sumDigits(input.nextInt());
		System.out.println("The sum of the digits is " + sum);
		
		input.close();
		
	}
	
	public static int sumDigits(long n) {
		
		int sum = 0;
		
		while (n != 0) {
			
			sum += (n % 10);
			n /= 10;
			
		}
		
		return sum;
		
	}
	
}
