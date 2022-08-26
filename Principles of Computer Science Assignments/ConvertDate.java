/////////////////////////////////////////////////
//Solution to Programming Program 01 Homework 7//
//Name: Jackson Jones                          //
//Lab Time: Thursday 9:00AM-10:40AM            //
//Program Description: Has the user input a    //
//date and then converts it to a specific      //
//format                                       //
/////////////////////////////////////////////////

import java.util.*;

public class ConvertDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a date: ");
        String date = in.nextLine().trim().toLowerCase();

        String month = ((date.toUpperCase().charAt(0)) + (date.substring(1, date.indexOf(" "))));

        String day = (date.substring(((month.length() + 1)), (date.lastIndexOf(","))).trim());

        String year = (date.substring(date.lastIndexOf(" "), date.length()).trim());

        System.out.println("Converted date: " + day + " " + month + " " + year);

        in.close();
    }
}