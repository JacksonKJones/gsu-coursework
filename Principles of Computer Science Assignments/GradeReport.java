import java.util.Scanner;

class GradeReport {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.println("Enter Grade:");
        final int grade = input.nextInt();
        
        if(0 <= grade && grade < 65) {
            System.out.println("You have an F...");
        }
        else if(65 <= grade && grade < 70) {
            System.out.println("You have an D. Not looking Good...");
        }
        else if(70 <= grade && grade < 80) {
            System.out.println("You have an C. Okay...");
        }
        else if(80 <= grade && grade < 90) {
            System.out.println("You have an B. Well Done!");
        }
        else if(90 <= grade && grade <= 100) {
            System.out.println("You have an A. Perfect!");
        }
        else {
            System.out.println("Please input a number between 0 and 100");
        }
        }
}