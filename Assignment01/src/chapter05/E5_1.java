package chapter05;

import java.util.Scanner;

public class E5_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num = input.nextInt();
		
		int pos = 0, neg = 0; 
		double sum = 0, count = 0;
		
		while (num != 0) {
			if (num < 0)
				neg++;
			else if (num > 0)
				pos++;
			
			sum += num;
			count++;
			
			num = input.nextInt();
		}
		
		if (count == 0)
			System.out.println("No numbers are entered except 0");
		else {
			System.out.println("The number of positives is " + pos);
			System.out.println("The number of negatives is " + neg);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + sum/count);
		}
			
		
		input.close();
	}
	
}
