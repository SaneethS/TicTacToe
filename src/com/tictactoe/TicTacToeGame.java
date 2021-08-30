package com.tictactoe;

import java.util.*;

/**@class in which the methods to create tictactoe game is written
 * @author saneeths
 *
 */

public class TicTacToeGame {
	public static Scanner scanner = new Scanner(System.in);
	
	public static Random random = new Random();
	
	//@array to store board values
	public static char[] board = new char[10];
	
	//@parameters to choose the player choice and computer choice as X or O
	public static char playerChoice, computerChoice;
	
	//@parameter to select the location in board by storing index
	public static int location;
	
	public static String turn;
	
	/**
	 * @method to create an empty board
	 */
	public static void createBoard() {
		for(int i=1;i<board.length;i++) {
			board[i] = ' ';
		}
	}
	
	/**
	 * @method for the user to choose X or O
	 */
	public static void choice() {
		System.out.println("Enter the choice X or O");
		playerChoice = scanner.next().charAt(0);
		if(playerChoice == 'X') {
			computerChoice = 'O';
		}else if(playerChoice == 'O')
			computerChoice = 'X';
		else {
			System.out.println("Select X or O");
			choice();
		}
		
	}
	
	/**
	 * @method to display the board to the player
	 */
	public static void showBoard() {
		//display row 1 
		System.out.println(" "+board[1]+" | "+board[2]+" | "+board[3]);
		System.out.println("-----------");
		//display row 2
		System.out.println(" "+board[4]+" | "+board[5]+" | "+board[6]);
		System.out.println("-----------");
		//display row 3
		System.out.println(" "+board[7]+" | "+board[8]+" | "+board[9]);
		
	}
	
	/**
	 * @method to select the location between index 1 and 9
	 * and also checking the location is between 1 and 9
	 */
	public static void desiredLocation() {
		turn = "player";
		System.out.println("Enter the location between 1 and 9");
		location = scanner.nextInt();
		
		if(location < 1 || location > 9) {
			System.out.println("Please Enter the number between 1 to 9 for location");
			desiredLocation();
		}
		desiredMove();
	}
	
	/**
	 * @method to fill the location with X or O
	 * if the location is filled it will ask for another loaction to fill
	 */
	public static void desiredMove() {
		 if(board[location] == ' ')
			 board[location] = playerChoice;
		 else {
			 System.out.println("This location is already filled so try another location");
			 desiredLocation();
			 desiredMove();
		 }
		 showBoard();
		 Outcome.winCheck();
		 Outcome.winTieResult();
	}
	
	/**
	 * @method to check whether the player has toss or not
	 * if he won its his turn
	 * otherwise its computer turn
	 */
	public static void toss() {
		System.out.println("Enter your choice\n1.Head\n2.Tail");
		int choice = scanner.nextInt();
		
		if(choice<1 || choice>2) {
			System.out.println("Enter the choice 1 or 2");
			toss();
		}
		
		int toss = random.nextInt(2)+1;
		
		if(choice == toss) {
			System.out.println("You won toss, it's Your turn");
			desiredLocation();
		}else {
			System.out.println("Computer won toss, it's computer turn");
			Computer.computer();
		}
	}
	
	/**
	 * @method is created to ask whether player wishes to play again or not
	 */
	public static void playAgain() {
		System.out.println("Do you want to play again?(Y/N)");
		char playChoice = scanner.next().charAt(0);
		
		if(playChoice == 'Y' || playChoice == 'y') {
			createBoard();
			choice();
			toss();
		}else if(playChoice == 'N' || playChoice == 'n') {
			System.out.println("See you Again.");
			System.exit(0);
		}else {
			System.out.println("Please enter Y or N");
			playAgain();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to board game");
		
		createBoard();
		
		choice();
		
		toss();
		
		
	}
}
