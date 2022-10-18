package chapter05;

import java.util.Scanner;

public class E5_51 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		int count = 0;
		String pre = "";
		
		while (s1.charAt(count) == s2.charAt(count)) {
			
			pre += s1.charAt(count);
			count++;
			
		}
		
		if (pre.length() > 0)
			System.out.println("The common prefix is " + pre);
		else
			System.out.println(s1 + " and " + s2 + " have no common prefix");
		
		input.close();
		
	}
	
}
