////////////////////////////////////////////////
//Solution to Programming Program 4 Homework 6//
//Name: Jackson Jones                         //
//Lab Time: Thursday 9:00AM-10:40AM           //
//Program Description: Prints a reflective    //
//Xmas Tree                                   //
////////////////////////////////////////////////


public class Ascii_Tree {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
                for (int k = 0; k < (i); k++)
                    System.out.print("\\");
                    System.out.print("|");
                    for(int m = 0; m <= (i-1); m++)
                        System.out.print("/");
                        System.out.println();
        }
    }
}