package assignment4;
import java.util.Scanner;
import java.util.Random;

public class game {
	//Colden Jeanmonod
	//2/19/2024
	//Assignment 4 Game
	//
	//This Program plays a game with the user.
	//
	public static final int EKENABBEN = 1; 
	public static final int VITTSJO = 2; 
	public static final int OXBERG = 3; 
	public static final int FJALLBO = 4; 
	public static final int JATTETSA = 5; 
	public static void main(String[] args) {


		play();
		
		
	}
	public static void play() {
	 printRules();
	Scanner playAgain = new Scanner(System.in);
	 int playerWins = 0;
		int comWin = 0;
	System.out.println("Would you like to play? 1 or 0");
	int userInput = playAgain.nextInt();
	

	do {
		
		
	
		int player = playerMove();
		int com = computerMove();
		if(player == com) {
			comWin += 1;
			System.out.println("Computer wins!");
			System.out.println("Computer wins" + comWin + "Player Wins:" + playerWins);
		}else if((player == EKENABBEN) && (com == VITTSJO || com == FJALLBO)) {
			playerWins += 1;
			System.out.println("Player wins!");
			System.out.println("Computer wins" + comWin + "Player Wins:" + playerWins);
		}else if((playerWins == VITTSJO) && (com == OXBERG || com == JATTETSA)) {
			playerWins += 1;
			System.out.println("Player wins!");
			System.out.println("Computer wins" + comWin + "Player Wins:" + playerWins);
		}else if ((player == OXBERG) && (com == EKENABBEN || com == FJALLBO )) {
			playerWins += 1;
			System.out.println("Player wins!");
			System.out.println("Computer wins" + comWin + "Player Wins:" + playerWins);
		}else if ((player == FJALLBO) && (com == JATTETSA || com == VITTSJO)) {
			playerWins += 1;
			System.out.println("Player wins!");
			System.out.println("Computer wins" + comWin + "Player Wins:" + playerWins);
		}else if(( player == JATTETSA) && (com == EKENABBEN || com == OXBERG)) {
			playerWins += 1;
			System.out.println("Player wins!");
			System.out.println("Computer wins" + comWin + "Player Wins:" + playerWins);
		}else {
			comWin +=1;
			System.out.println("Computer wins!");
			System.out.println("Computer wins" + comWin + "Player Wins:" + playerWins);
		}
		 
		System.out.println("Would you like to play again? 0 for no or 1 for yes");
		userInput = playAgain.nextInt();

	}while(userInput == 1);
	finalTotal(playerWins, comWin);
	playAgain.close();
}
	public static void printRules() {
		System.out.println("Hello! here are the rules");
		System.out.println("Ekenabben beats Vittsjo, Fjallbo\r\n"
				+ "Vittsjo beats Oxberg, Jattesta\r\n"
				+ "Oxberg beats Ekenabben, Fjallbo\r\n"
				+ "Fjallbo Beats Jattesta, Vittsjo\r\n"
				+ "Jattesta beats Ekenabben, Oxberg");
		System.out.println("For Ekenabben put 1, For Vittsjo put 2, for Oxeberg put 3, for Fjallbo put 4, for Jattetsa put 5");
	}
	public static int computerMove() {
		Random computer = new Random();
		int computerChose = (computer.nextInt(5)) + 1;
		return computerChose;
	}
	
	public static int playerMove(){
		Scanner gameMaster = new Scanner(System.in);
		int playerMove = 0;
		boolean valid = false;
		do {
			
			System.out.println("Please pick a move");
			playerMove = gameMaster.nextInt();
			if(playerMove == EKENABBEN) {
				System.out.println("Move picked Ekenabben");
				valid = true;
			}else if(playerMove == VITTSJO) {
				System.out.println("Move picked Vittsjo");
				valid = true;
			}else if(playerMove == OXBERG) {
				System.out.println("Move Picked Oxberg");
				valid = true;
			}else if(playerMove == FJALLBO) {
				System.out.println("Move Picked Fjallbo");
				valid = true;
			}else if(playerMove == JATTETSA) {
				System.out.println("Move picked Jattetsa");
				valid = true;
			}else {
				valid = false;
			}
		}while(valid == false);
	
		return playerMove;
		
		
	}
	
	public static void finalTotal(int playerWin, int computerWin) {
		if(playerWin <computerWin ) {
			System.out.println("Computer wins overall!");
		}else if(computerWin < playerWin) {
			System.out.println("Player Wins overall!");
		}else {
			System.out.println("Tie");
		}
	}
	
}


