import java.util.Scanner;

public class averageGrade {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input Name: ");
        String n = in.nextLine();

        System.out.print("Input Grades: ");
        int g1 = in.nextInt();
        int g2 = in.nextInt();
        int g3 = in.nextInt();

        System.out.println("Name: " + n);
        System.out.println("Average: " + ((g1 + g2 + g3) / 3));
    }
}