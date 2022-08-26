import java.util.Scanner;
public class Customizer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input String: ");
    String word = sc.nextLine();
    int stringlen = word.length();
    char firstChar = word.charAt(0);
    String upperConvert = word.toUpperCase();
    String lowerConvert = word.toLowerCase();
    String firstPart = null;

    System.out.println(word);
    System.out.println(stringlen);
    System.out.println(firstChar);
    System.out.println(upperConvert);
    System.out.println(lowerConvert);

    if(word.indexOf(" ") != -1) {
        firstPart = (word.substring(0, word.indexOf(" ")));
        System.out.println(firstPart);
    }
    else {
        firstPart = (word.substring(0, (word.length() / 2)));
        System.out.println(firstPart);
    }

    sc.close();
  }
}