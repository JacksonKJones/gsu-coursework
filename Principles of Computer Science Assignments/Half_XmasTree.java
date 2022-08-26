////////////////////////////////////////////////
//Solution to Programming Program 4 Homework 6//
//Name: Jackson Jones                         //
//Lab Time: Thursday 9:00AM-10:40AM           //
//Program Description: Prints an Xmas Tree    //
//and the stump                               //
////////////////////////////////////////////////

import java.util.Scanner;

public class Half_XmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the desired number of rows: ");
        int rows = input.nextInt();
        input.close();

        for(int i = rows; i > 0; i--) {
            for(int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}