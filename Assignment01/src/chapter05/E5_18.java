package chapter05;

public class E5_18 {

	public static void main(String[] args) {
		
		System.out.println("Pattern A");
		
		int a = 1;
		int b = 6;
		
		for (int i = 1; i <= b; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			
			for (int k = b - i; k >= 1; k--) {
				System.out.print("  ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Pattern B");
		
		for (int i = 1; i <= 6; i++) {
			
			for (int k = a; k <= b; k++) {
				System.out.print(k + " ");
			}
			
			b -= 1;
			
			for (int j = i; j >= 1; j--) {
				System.out.print("  ");
			}
			
			System.out.println();
		}
		
		b = 6;
		
		System.out.println("Pattern C");
		
		for (int i = 1; i <= b; i++) {
			
			for (int j = b - i; j >= 1; j--) {
				System.out.print("  ");
			}
			
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Pattern D");
		
		for (int i = 1; i <= 6; i++) {
			
			for (int j = i; j >= 2; j--) {
				System.out.print("  ");
			}
			
			for (int k = a; k <= b; k++) {
				System.out.print(k + " ");
			}
			
			b -= 1;
			
			System.out.println();
		}
		
	}
	
}
