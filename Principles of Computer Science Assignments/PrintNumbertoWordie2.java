////////////////////////////////////////////////
//Solution to Programming Project 3 Homework 5//
//Name: Jackson Jones                         //
//Lab Time: Thursday 9:00AM-10:40AM           //
//Program Description: Prints the number      //
//input by the user in word form and tells if //
//the number is divisible by 2                //
////////////////////////////////////////////////

import java.util.Scanner;

class printNumberToWordie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number between 1 and 10: ");
        int number = input.nextInt();

        input.close();

        switch(number) {
            case 1:
                System.out.println("One");
            break;
            case 2:
                System.out.println("Two");
            break;
            case 3:
                System.out.println("Three");
            break;
            case 4:
                System.out.println("Four");
            break;
            case 5:
                System.out.println("Five");
            break;
            case 6:
                System.out.println("Six");
            break;
            case 7:
                System.out.println("Seven");
            break;
            case 8:
                System.out.println("Eight");
            break;
            case 9:
                System.out.println("Nine");
            break;
            case 10:
                System.out.println("Ten");
            break;
            default:
                System.out.println("Your number is outside the range");
        }
        switch(number % 2) {
            case 1:
                System.out.println("Your number is not divisible by 2");
            break;
            case 0:
                System.out.println("Your number is divisible by 2");
            break;            
        }
    }
}