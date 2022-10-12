package chapter03;

import java.util.Scanner;

public class E3_28 {
	
	public static void main(String[] args) {
		
		double h1, w1, x1, y1, h2, w2, x2, y2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		w1 = input.nextDouble();
		h1 = input.nextDouble();
		 
		System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		w2 = input.nextDouble();
		h2 = input.nextDouble();
		
		if ((Math.sqrt(Math.pow(y2 - y1, 2)) + h2 / 2 <= h1 / 2) && 
		    (Math.sqrt(Math.pow(x2 - x1, 2)) + w2 / 2 <= w1 / 2) &&
		    (h1 / 2 + h2 / 2 <= h1) && (w1 / 2 + w2 / 2 <= w1)) {
			
			System.out.println("r2 is inside r1");
			
		} else if ((y1 + h1 / 2 > y2 - h2) || (x1 + w1 / 2 > x2 - w2)) {
			
			System.out.println("r2 overlaps r1");
			
		} else {
			
			System.out.println("r2 does not overlap r1");
			
		}
		
		input.close();
		
	}
}