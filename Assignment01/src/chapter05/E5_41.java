package chapter05;

import java.util.Scanner;

public class E5_41 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		int max = input.nextInt();
		int count = 1;
		int number = 1;
		
		while (number > 0) {
			
			number = input.nextInt();
			
			if (number == max)
				count++;
			
			if (number > max) {
				
				max = number;
				count = 1;
			
			}
			
			
		}
		
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
		
		input.close();
		
	}
	
}
