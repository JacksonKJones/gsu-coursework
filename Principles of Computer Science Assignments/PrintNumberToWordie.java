////////////////////////////////////////////////
//Solution to Programming Project 3 Homework 5//
//Name: Jackson Jones                         //
//Lab Time: Thursday 9:00AM-10:40AM           //
//Program Description: Prints the number      //
//input by the user in word form and tells if //
//the number is divisible by 2                //
////////////////////////////////////////////////

import java.util.Scanner;

class printNumberToWordie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number between 1 and 10: ");
        int number = input.nextInt();

        input.close();

        if(number == 1) {
            System.out.println("One");
        }
        else if(number == 2) {
            System.out.println("Two");
        }
        else if(number == 3) {
            System.out.println("Three");
        }
        else if(number == 4) {
            System.out.println("Four");
        }
        else if(number == 5) {
            System.out.println("Five");
        }
        else if(number == 6) {
            System.out.println("Six");
        }
        else if(number == 7) {
            System.out.println("Seven");
        }
        else if(number == 8) {
            System.out.println("Eight");
        }
        else if(number == 9) {
            System.out.println("Nine");
        }
        else if(number == 10) {
            System.out.println("10");
        }
        else {
            System.out.println("Your number is outside the range");
        }
        if(number % 2 == 1) {
            System.out.println("Your number is not divisible by 2");
        }
        else {
            System.out.println("Your number is divisible by 2");
        }
    }
}