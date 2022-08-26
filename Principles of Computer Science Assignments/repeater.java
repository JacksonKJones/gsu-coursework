import java.util.Scanner;

public class repeater {
    
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What would you like repeated?");
        String s = in.nextLine();
        System.out.println("How many times do you want it to be repeated?");
        int x = in.nextInt();
        printString(s, x);
    }
    public static void printString(String s, int x) {
        for(var i = 0; i <= x; i++) {
            System.out.println(s);
        }
    }
    }