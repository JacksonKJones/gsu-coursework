import java.util.Scanner;

public class nameFlipper {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input Full Name: ");
        String name = in.nextLine();
        String[] nameSplit = name.split(" ");

        String result;
        if (nameSplit.length > 2) {
            result = nameSplit[1] + ", " + nameSplit[0] + ", " + nameSplit[2];
        }
        else {
            result = nameSplit[1] + ", " + nameSplit[0];
        }
        System.out.println("Your Name in Reverse Order: " + result);
    }
}