package chapter05;

public class E5_7 {

	public static void main(String[] args) {
		
		double tuition = 10000;
		
		for (double i = 0; i < 10; i++) {
			tuition += tuition * 0.05;
		}
			tuition = (double)((int)(tuition * 100))/100;
					
					
		for (double i = 0; i < 5; i++) {
			System.out.println("Tuition is $" + tuition + " in year " + (i + 10));
			tuition += tuition * 0.05;
			tuition = (double)((int)(tuition * 100))/100;
			
		}
	}
	
}
