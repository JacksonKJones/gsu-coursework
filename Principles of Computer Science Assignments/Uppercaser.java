import java.util.Scanner;

public class Uppercaser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String word = sc.next().toUpperCase();
        sc.close();
        System.out.println(word);

        int pals = 0;
        int pale = (word.length() - 1);
        boolean palindrome = true;

        while(pals < pale) {
            if(word.charAt(pals) != word.charAt(pale)) {
                palindrome = false;
            }
            else {
                palindrome = true;
            }
            pals++;
            pale--;
        }
        if(palindrome) {
            System.out.println("This word is a palindrome.");
        }
        else {
            System.out.println("This word is not a palindrome.");
        }
    }
}
