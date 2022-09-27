package assignment01;

import java.util.Scanner;

public class E3_17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int player = input.nextInt();
		
		int computer = (int)(Math.random() * 3);
		
		String pHand = null;
		String cHand = null;
		
		switch(player) {
		case 0:
			pHand = "scissors";
			break;
		case 1:
			pHand = "rock";
			break;
		case 2:
			pHand = "paper";
			break;
		}
		
		switch(computer) {
		case 0:
			cHand = "scissors";
			break;
		case 1:
			cHand = "rock";
			break;
		case 2:
			cHand = "paper";
			break;
		}
		
		System.out.print("The computer is " + cHand + ". You are " + pHand);
		
		if (player == computer) {
			System.out.print(" too. It is a draw");			
		} else if ((player == 0 && computer == 2)||(player == 1 && computer == 0)||(player == 2 && computer == 1)) {
			System.out.print(". You won");
		} else {
			System.out.print(". You lost");
		}

		input.close();
		
	}
}