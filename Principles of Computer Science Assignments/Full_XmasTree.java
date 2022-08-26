////////////////////////////////////////////////
//Solution to Programming Program 4 Homework 6//
//Name: Jackson Jones                         //
//Lab Time: Thursday 9:00AM-10:40AM           //
//Program Description: Prints an Xmas Tree    //
//and the stump                               //
////////////////////////////////////////////////

import java.util.Scanner;

public class Full_XmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows high should the leaves be?: ");
        int input = scanner.nextInt();
        scanner.close();
        int a = input;
        for (int i = 0; input >= i; input--) {
            for (int j = 0; j < input; j++) {
                System.out.print(" ");
            }
            for (int k = a; k > input; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int z = (a/2 + a%2);
        for (int m = 0; m < 2; m++) {
            for (int o = 0; o < (z + (m * 4)); o++){
                System.out.print(" ");
            }
            for (int p = 0; p < z; p++) {
                System.out.print("* ");
            }
            System.out.println();
            z = (z-2);
        }
    }
}