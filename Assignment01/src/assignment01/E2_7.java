package assignment01;

import java.util.Scanner;

public class E2_7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes:");
		int minutes = input.nextInt();
		int days = minutes / 60 / 24 % 365;
		int years = minutes / 60 / 24 / 365;
		System.out.println(minutes + " is approximately " + years + " years and " + days + " days");
		
		input.close();

	}
}
