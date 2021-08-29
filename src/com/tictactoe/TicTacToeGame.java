package com.tictactoe;

import java.util.Scanner;

/**@class in which the methods to create tictactoe game is written
 * @author saneeths
 *
 */

public class TicTacToeGame {
	public static Scanner scanner = new Scanner(System.in);
	
	//@array to store board values
	public static char[] board = new char[10];
	
	//@parameters to choose the player choice and computer choice as X or O
	public static char playerChoice, computerChoice;
	
	//@parameter to select the location in board by storing index
	public static int location;
	
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
		}else
			computerChoice = 'X';
		
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
		System.out.println("Enter the location between 1 and 9");
		location = scanner.nextInt();
		
		if(location < 1 || location > 9) {
			System.out.println("Please Enter the number between 1 to 9 for location");
			desiredLocation();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to board game");
		
		createBoard();
		
		choice();
		
		desiredLocation();
		
		showBoard();
		
		
	}
}
