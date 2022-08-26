import java.util.Scanner;

public class patternPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number to print pattern: ");
        int num = input.nextInt();
        input.close();

        System.out.println("Output: ");
        System.out.println("The pattern for " + num + " is: ");

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}