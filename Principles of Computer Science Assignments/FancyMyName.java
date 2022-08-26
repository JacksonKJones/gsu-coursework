import java.util.Scanner;

public class FancyMyName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = in.nextLine().trim();
        
        String firstName = (name.substring(0, name.indexOf(" "))); 

        String lastName = (name.substring((name.lastIndexOf(" ") + 1), name.length()).trim()); 
        
        System.out.println("Entered name: " + firstName + " " + lastName);
        System.out.println("Your first name is " + firstName + ": has " + firstName.length() + " characters.");
        System.out.println("Your last name is " + lastName + ": has " + lastName.length() + " characters.");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0) + ".");

        in.close();
    }
}