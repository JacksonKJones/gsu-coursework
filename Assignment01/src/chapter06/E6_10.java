package chapter06;

public class E6_10 {

	public static void main(String[] args) {
		
		int numPrimes = 0;
		
		for (int i = 0; i < 10000; i++) {
			if (isPrime(i))
				numPrimes++;
		}
		
		System.out.println("The number of prime numnbers less than 10000 is " + numPrimes);
		
	}
	
	public static boolean isPrime(int number) {
		
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	
}
