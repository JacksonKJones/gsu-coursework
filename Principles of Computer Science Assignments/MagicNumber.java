////////////////////////////////////////////////
//Solution to Programming Project 3 Homework 5//
//Name: Jackson Jones                         //
//Lab Time: Thursday 9:00AM-10:40AM           //
//Program Description: Sets a random number   //
//and takes user input, and then tells the    //
//user how accurate their guess was.          //
////////////////////////////////////////////////

import java.util.Scanner;

class MagicNumber {
    public static void main(String[] args) {
        int magicnumber = 1 + (int)(Math.random() * ((100-1) + 1));
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number between 1 and 100: ");
        int number = input.nextInt();

        input.close();

        if(number > magicnumber && number <= 100) {
            System.out.println("The secret number is " + magicnumber + ". You guessed " + number + ". Your guess is greater than the magic number.");
        }
        else if(number > 100) {
            System.out.println("The secret number is " + magicnumber + ". You guessed " + number + ". Your guess is greater than the magic number and outside the number range.");
        }
        else if(number < magicnumber && number >= 1) {
            System.out.println("The secret number is " + magicnumber + ". You guessed " + number + ". Your guess is less than the magic number.");
        }
        else if(number < 1) {
            System.out.println("The secret number is " + magicnumber + ". You guessed " + number + ". Your guess is less than the magic number and outside the number range.");
        }
        else {
            System.out.println("The secret number is " + magicnumber + ". Your guess is correct. Congratulations!");
        }
    }
}