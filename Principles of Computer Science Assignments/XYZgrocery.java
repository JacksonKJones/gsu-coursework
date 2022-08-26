import java.util.Scanner;

class XYZgrocery {
        public static void main(final String[] args) {
        
            System.out.println("Welcome to XYZ Grocery Store");
            System.out.println("Items available to purchase: ");
            System.out.println("1 - Apple - 5$");
            System.out.println("2 - Coca Cola - 7$");
            System.out.println("3 - Maple Syrup - 4$");
            System.out.println("4 - Breads - 3$");
            System.out.println("5 - Cheese - 6$");
            System.out.println("6 - Coffee - 8$");
            System.out.println("7 - Chicken Nuggets - 15$");
            System.out.println("8 - Hand Sanitizer - 4$");
            System.out.println("9 - Socks - 5$");
            System.out.println("0 - Complete Purchase");
            System.out.println("Enter item number to purchase: ");
            
            Scanner input = new Scanner(System.in);
            int item = input.nextInt();
            int total = 0;
            int fin = 0;
            
            for(fin = 0; fin == 0;) {
                if(item == 0) {
                System.out.println("Thank you for shopping!");
                System.out.println("Your Grand Total is: " + total + "$");
                fin = 1;
                }
                else if(item == 1 || item == 9) {
                total = total + 5;
                System.out.println("Total= " + total);
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
                else if(item == 2) {
                total = total + 7;
                System.out.println("Total= " + total);
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
                else if(item == 3 || item == 8) {
                total = total + 4;
                System.out.println("Total= " + total);
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
                else if(item == 4) {
                total = total + 3;
                System.out.println("Total= " + total);
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
                else if(item == 5) {
                total = total + 6;
                System.out.println("Total= " + total);
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
                else if(item == 6) {
                total = total + 8;
                System.out.println("Total= " + total);
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
                else if(item == 7) {
                total = total + 15;
                System.out.println("Total= " + total);
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
                else {
                System.out.println("Enter item number to purchase: ");
                item = input.nextInt();
                }
            }
            
            input.close();
        }
    }