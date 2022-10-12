package chapter04;

import java.util.Scanner;

public class E4_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();
		
		if (ssn.length() != 11) 
			
			System.out.println(ssn + " is an invalid social security number");
		
		else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-')
		
			System.out.println(ssn + " is an invalid social security number");
		
		else {
			
			for (int i = 0; i < ssn.length(); i++) {
				
				if (i == 3 || i == 6)
					continue;
				boolean num = Character.isDigit(ssn.charAt(i));
				if (num == false) {
					System.out.println(ssn + " is an invalid social security number");
					break;
				}else if (num && i == ssn.length() - 1)
					System.out.println(ssn + " is a valid social security number");
			
			}
		}
			
		input.close();
	}
	
}
