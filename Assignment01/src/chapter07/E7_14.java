package chapter07;

import java.util.Scanner;

public class E7_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[5];        

        System.out.print("Enter 10 numbers to get their gcd: ");
        for (int i = 0; i < numbers.length; i++)
        	numbers[i] = input.nextInt();

        System.out.println("The GCD is " + gcd(numbers));
        
        input.close();
		
	}
	
	public static int gcd(int... numbers) {
		
		int gcd = 1;
        int min = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
        	if (min > numbers[i])
        		min = numbers[i];
        }
        
        int length = numbers.length - 1;

        int count = 0;
        for (int i = 2; i <= min; i++) {

            for (int k = 0; k <= length; k++) {
                if (numbers[k] % i == 0) {
                    count++;
                    if (count == length) gcd = i;
                } else {
                    count = 0;
                }
            }
        }

        return gcd;
		
	}
	
}
