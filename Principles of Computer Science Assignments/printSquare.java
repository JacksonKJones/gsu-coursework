import java.util.Scanner;

class printSquare {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.println("Please type a number:");
        final int number = input.nextInt();

        System.out.println("The square of that number is: " + (number * number));
    }
}