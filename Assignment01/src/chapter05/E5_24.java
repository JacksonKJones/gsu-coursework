package chapter05;

public class E5_24 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for (double i = 3; i <= 99; i += 2) {
			
			 double num = i - 2;
			 sum += num / i;
			
		}
		
		System.out.println("The sum of the series is " + sum);
	}
	
}
