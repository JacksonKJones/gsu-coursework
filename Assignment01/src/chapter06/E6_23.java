package chapter06;

import java.util.Scanner;

public class E6_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String word = input.nextLine();
		System.out.print("Enter a Character: ");
		char letter = input.next().charAt(0);
		
		System.out.println("The character \"" + letter + "\" occurs " + count(word, letter)
							+ " times in \"" + word + "\"");
		
		input.close();
	}
	
	public static int count(String str, char a) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				count += 1;
				
		}
		
		return count;
		
	}
	
}
