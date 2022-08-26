import java.util.Scanner;

public class ICalledyou {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Starts Scanner

        System.out.print("Input First Number: ");
        int num1 = in.nextInt();
        //User Inputs First Number

        System.out.print("Input Second Number: ");
        int num2 = in.nextInt();
        //User Inputs Second Number

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
        //System Prints out equation of the two numbers with the product

        if(num1 > num2) {
            System.out.println("The Greater Number is: " + num1);
        }
        else if(num1 < num2) {
            System.out.println("The Greater Number is: " + num2);
        }
        else {
            System.out.println("There is no Greater Number. Both Numbers are Equal.");
        }
        //System Prints the Greater Number or that there is none
    }
}