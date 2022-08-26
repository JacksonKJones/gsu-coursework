import java.util.Scanner;

class Blackjack_Jr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------Blackjack Jr!--------------------");

        System.out.println("What numbers did you draw? (Between 1-10)");
        int player1 = input.nextInt();
        int player2 = input.nextInt();
        int playert = (player1 + player2);

        System.out.println("What number did the dealer draw?");
        int dealer1 = input.nextInt();
        int dealer2 = 1 + (int)(Math.random() * ((10-1) + 1));
        int dealert = (dealer1 + dealer2);

        input.close();

        System.out.println("You drew " + player1 + " and " + player2 + ".");
        System.out.println("Your total is: " + playert);
        System.out.println("The dealer drew " + dealer1 + " and " + dealer2 + ".");
        System.out.println("The Dealer's total is: " + dealert);

        if(playert > dealert) {
            System.out.println("You win!");
        }
        else if(playert < dealert) {
            System.out.println("You lose.");
        }
        else {
            System.out.println("You tied.");
        }

        System.out.println("-----------------------------------------------------");
    }
}