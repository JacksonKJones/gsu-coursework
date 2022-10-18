package chapter05;

import java.util.Scanner;

public class E5_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		int months = years * 12;
		
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		System.out.println();
		
		for (double i = 5.000; i <= 8; i += 0.125) {
			
			System.out.printf("%5.3f", i);
			System.out.print("%           ");
			double mir = i / 1200;
			double mp = loan * mir / (1 - 1 / Math.pow(1 + mir, months));
			System.out.printf("%-19.2f", mp);
			System.out.printf("%-8.2f\n", mp * 12 * years);
			
		}
		
		
		input.close();
		
	}
	
}
