package assignment01;

import java.util.Scanner;

public class E3_1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double r1 = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * (a * c))) / (2 * a));
		double r2 = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * (a * c))) / (2 * a));
		double d = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		
		
		
		System.out.print("The equation has ");
		if (d > 0) {
			System.out.print("two roots of " + r1 + " and " + r2);
		} else if (d == 0) {
				System.out.print("one root of " + r1);
		} else {
			System.out.print("no real roots");
		}
		
		input.close();
	}
}
