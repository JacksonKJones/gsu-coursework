import java.util.Scanner;

class CalculateI_Know {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 Numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        input.close();

        calcLargestSum(num1, num2, num3);
        System.out.println("");
        calcMiddleNumber(num1, num2, num3);
    }
    public static void calcLargestSum(int num1, int num2, int num3) {
        int num12 = (num1 + num2);
        int num13 = (num1 + num3);
        int num23 = (num2 + num3);
        
        System.out.print("The largest sum of two numbers is: ");

        if((num12 > num13) && (num12 > num23)) {
            System.out.print(num12);
        }
        else if((num13 > num12) && (num13 > num23)) {
            System.out.print(num13);
        }
        else {
            System.out.print(num23);
        }
    }
    public static void calcMiddleNumber(int num1, int num2, int num3) {
        System.out.print("The middle number is: ");

        if((num1 > num2) && (num1 < num3)) {
            System.out.print(num1);
        }
        else if((num2 > num1) && (num2 < num3)) {
            System.out.print(num2);
        }
        else {
            System.out.print(num3);
        }        
    }
}