package chapter05;

import java.util.Scanner;

public class E5_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of lines: ");
		int p = input.nextInt();
		
		for (int i = 1; i <= p; i++) {
			
			for (int j = p - i; j >= 1; j--) {
				System.out.print("  ");
			}
			
			for (int k = i; k >= 2; k--) {
				System.out.print(k + " ");
			}

			for (int l = 1; l <= i; l++) {
				System.out.print(l + " ");
			}
			
			System.out.println();
		}
		
		
		
		input.close();
		
	}
	
}
