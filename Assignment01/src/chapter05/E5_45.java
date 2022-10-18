package chapter05;

import java.util.Scanner;

public class E5_45 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		
		double numbers[] = new double[10];
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		double mean = 0;
		
		for (int i = 0; i < numbers.length; i++)
			mean += numbers[i];
		mean /= numbers.length;
		
		double dev = 0;
		
		for (int i = 0; i < numbers.length; i++)
			dev += (numbers[i] - mean) * (numbers[i] - mean);
		dev = Math.sqrt(dev / (numbers.length - 1));
		
		System.out.printf("The mean is %.2f\n", mean);
		System.out.printf("The standard deviation is %.5f", dev);
		
		
		input.close();
		
	}
	
}
