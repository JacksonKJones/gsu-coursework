package assignment01;

import java.util.Scanner;

public class E4_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code:" );
		int code = input.nextInt();
		
		System.out.println("The character for ASCII code " + code + " is " + (char)code);
		
		input.close();
		
	}
	
}
