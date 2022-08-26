/////////////////////////////////////////////////
//Solution to Programming Program 02 Homework 7//
//Name: Jackson Jones                          //
//Lab Time: Thursday 9:00AM-10:40AM            //
//Program Description: This Program tells the  //
//users a variety of information about thier   //
//names.                                       //
/////////////////////////////////////////////////

import java.util.*;

public class NameDescriptor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean end = true;
        while(end) {
            System.out.println("Enter your full name, first and last, seperated by a space.");
            String name = in.nextLine().trim();

            String firstName = (name.substring(0, name.indexOf(" ")));

            String lastName = (name.substring((name.lastIndexOf(" ") + 1), name.length()).trim());

            if(firstName.length() >= 6) {
                System.out.println(firstName + "! Your first name is " + firstName + ", right? Did you know that your first name has " + firstName.length() + " characters? That's above the average number for English!");
            }
            else if(firstName.length() <= 4) {
                System.out.println(firstName + "! Your first name is " + firstName + ", right? Did you know that your first name has " + firstName.length() + " characters? That's below the average number for English");
            }
            else {
                System.out.println(firstName + "! Your first name is " + firstName + ", right? Did you know that your first name has " + firstName.length() + " characters?");
            }
            
            System.out.println(lastName + "! Is your last name, " + lastName + ", a job your ancestors had? (Y)Yes or (N)No .");
            String job = in.nextLine().trim();
            if(job.equalsIgnoreCase("n") == true) {
                System.out.println("My bad! Well, did you know that your last name has " + lastName.length() + " characters?");
            }
            else {
                System.out.println("I wonder if you want to be a " + lastName.toLowerCase() + " as well? Anyways, did you know that your last name has " + lastName.length() + " characters?");
            }
            
            if(firstName.charAt(0) == lastName.charAt(0)) {
                System.out.println("By the way, your initials are " + firstName.charAt(0) + lastName.charAt(0) + ". Doubles!");
            }
            else {
                System.out.println("By the way, your initials are " + firstName.charAt(0) + lastName.charAt(0));
            }

            System.out.println("Would you like to do this again? (Y)Yes or (N)No .");
            String answer = in.nextLine().trim();

            if(answer.equalsIgnoreCase("n") == true) {
                end = false;
                System.out.println("Alrighty! Good Bye!");
            }
            else {
                System.out.println("Alrighty! Let's do it again!");
                System.out.println("");
            }
        }
        in.close();
    }
}