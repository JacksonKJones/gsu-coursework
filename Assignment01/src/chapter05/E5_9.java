package chapter05;

import java.util.Scanner;

public class E5_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students ");
		int students = input.nextInt();
		
		int first = 0;
		String student1 = "";
		int second = 0;
		String student2 = "";
		
		for (int i = 1; i <= students; i++) {
			System.out.print("Enter the score of student " + i + " ");
			int score = input.nextInt();
			
			if (score > first) {
				
				student2 = student1;
				second = first;
				student1 = "Student " + i;
				first = score;
				
			} else if (score > second) {
				
				student2 = "Student " + i;
				second = score;
				
			}
		}
		
		System.out.println("The highest score is " + first + " by " + student1);
		System.out.println("The second-highest score is " + second + " by " + student2);
		
		input.close();
		
	}
	
}
