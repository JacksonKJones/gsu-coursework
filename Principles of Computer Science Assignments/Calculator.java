import java.io.InputStreamReader;
import java.io.BufferedReader ;
import java.io.IOException;

public class Calculator {
    public static void main (String[] args) {
   
    while(true) {
        System.out.println("Welcome to my calculator! \nType Add for addition.\nType Sub for subtraction.\nType Mul for multiplication.\nType Div for division.\nType Exit to exit.");
            String str = read();
         switch(str){
         case"Exit": 
            System.out.println("Goodbye!");
            System.exit(-1);
         break;
        case"Add":
            System.out.println("Result :" +add());
            break;
        case"Sub": 
            System.out.println("Result :" +sub());
            break;
        case"Mul":
            System.out.println("Result :" +mul());
            break;	
        case"Div":
        	System.out.println("Result :"); 
        	div();
        	break;
         }}
    }

   
    static String read() {   
        InputStreamReader reader = new InputStreamReader (System.in);
        BufferedReader myInput = new BufferedReader (reader);
        String str = new String();
        try {
            str = myInput.readLine(); } catch (IOException e) {
            System.out.println ("Error " + e);
            System.exit(-1);
        }
        return str;
    }
    static int add() {
        System.out.println ("You are adding numbers, please write one number and press Enter");
        int a = Integer.parseInt(read());
        System.out.println ("Type another number and press Enter");
        int b = Integer.parseInt(read());
        return a+b;
    }
    static int sub() {
        System.out.println ("You are subtracting numbers, please write one number and press Enter");
        int a = Integer.parseInt(read());
        System.out.println ("Type another number and press Enter");
        int b = Integer.parseInt(read());
        return a-b;
    }
    static int mul() {
        System.out.println ("You are mulitplying numbers, please write one number and press Enter");
        int a = Integer.parseInt(read());
        System.out.println ("Type another number and press Enter");
        int b = Integer.parseInt(read());
        return a*b;
    }
    static void div() {
        System.out.println ("You are multiplying numbers, please write one number and press Enter");
        int a = Integer.parseInt(read());
        System.out.println ("Type another number and press Enter");
        int b = Integer.parseInt(read());
        while (b==0) {
            System.out.println("Sorry, you can't divide by 0. Type another number and press enter!");
            b = Integer.parseInt(read());
        }
        System.out.println("Result :" +a/b);
    }
}