import java.util.Scanner;

public class arrayTable {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = in.nextInt();
    int holder = num;

    System.out.print("Enter the number to find Multiplication Table at specific number: ");
    int mul = in.nextInt();

    int[] table = new int[10];

    for(int i = 0; i < table.length;i++) {
      table[i] = num;
      num += holder;
    }
    
    System.out.println("Table stored in array is: ");
    
    for(int i = 0; i < table.length;i++) {
      System.out.print(table[i] + " ");
    }

    System.out.println();
    System.out.println("Result for " + mul + " is: " + table[mul-1]);

    in.close();
  }
}