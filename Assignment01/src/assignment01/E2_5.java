package assignment01;

import java.util.Scanner;

public class E2_5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate:");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * gratuityRate * 0.01;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
		
		input.close();
	}
}

