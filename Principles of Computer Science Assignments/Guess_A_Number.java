////////////////////////////////////////////////
//Solution to Programming Program 4 Homework 6//
//Name: Jackson Jones                         //
//Lab Time: Thursday 9:00AM-10:40AM           //
//Program Description: Sets a random number   //
//and takes user input, and then tells the    //
//user how close their guess was until they   //
//guess it correctly                          //
////////////////////////////////////////////////

import java.util.Scanner;

public class Guess_A_Number {
  public static void main(String[] args) {
    game();
  }
  public static void game() {
    int guess, max, secret, counter;
    boolean continue_game = true;
    boolean end_game = false;
    Scanner sc = new Scanner(System.in);
    
    while(continue_game) {
      System.out.println();
      System.out.print("Enter maximum value for the secret number: ");
      max = sc.nextInt();
      secret = (int)(Math.random() * max) + 1;
      System.out.println("A secret number has been chosen!\n");

      end_game = false;
      counter = 0;
      while (!end_game) {
        System.out.print("Enter your guess: ");
        guess = sc.nextInt();
        if (guess == secret) {
          counter++;
          System.out.println("You won in " + counter + " attempts!");
          end_game = true;
        } else if (guess > secret) {
          System.out.println("Too high! Try again.");
          counter++;
        } else {
          System.out.println("Too low! Try again.");
          counter++;
        }
      }

      System.out.println();
      System.out.println("Play again? (y/n): ");
      String res = sc.next();
      if (res.equalsIgnoreCase("y") == true) {
        continue_game = true;
      } else {
        continue_game = false;
        sc.close();
      }

    }
  }
}