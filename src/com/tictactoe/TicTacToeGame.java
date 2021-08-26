package com.tictactoe;

import java.util.Scanner;

/**@class in which the methods to create tictactoe game is written
 * @author saneeths
 *
 */

public class TicTacToeGame {
	public static Scanner scanner = new Scanner(System.in);
	
	//@array to store board values
	private char[] board = new char[10];
	
	//@parameters to choose the player choice and computer choice as X or O
	public static char playerChoice, computerChoice;
	
	
	/**
	 * @method to create an empty board
	 */
	public void createBoard() {
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
	
	public static void main(String[] args) {
		System.out.println("Welcome to board game");
		TicTacToeGame ticTacToe = new TicTacToeGame(); 
		ticTacToe.createBoard();
		
		choice();
	}
}
