package assignment01;

public class E3_24 {
	
	public static void main(String[] args) {
		
		double card = 1 + Math.random() * 52;
		int rankNum = (int)(card / 4) + 1;
		int suitNum = (int)(card / 13) + 1;
		
		String suit = "";
		
		switch(suitNum) {
		case(1):
			suit = "Hearts";
			break;
		case(2):
			suit = "Diamonds";
			break;
		case(3):
			suit = "Spades";
			break;
		case(4):
			suit = "Clubs";
			break;
		}
		
		String rank = "";
		
		switch(rankNum) {
		case(1):
			rank = "Ace";
			break;
		case(2):
			rank = "Two";
			break;
		case(3):
			rank = "Three";
			break;
		case(4):
			rank = "Four";
			break;
		case(5):
			rank = "Five";
			break;
		case(6):
			rank = "Six";
			break;
		case(7):
			rank = "Seven";
			break;
		case(8):
			rank = "Eight";
			break;
		case(9):
			rank = "Nine";
			break;
		case(10):
			rank = "Ten";
			break;
		case(11):
			rank = "Jack";
			break;
		case(12):
			rank = "Queen";
			break;
		case(13):
			rank = "King";
			break;
		}

		System.out.print("The card you picked is " + rank + " of " + suit + ".");
	}
}