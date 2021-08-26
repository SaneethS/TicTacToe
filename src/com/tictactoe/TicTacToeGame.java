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
	
	public static void main(String[] args) {
		System.out.println("Welcome to board game");
		
		createBoard();
		
		choice();
		
		showBoard();
	}
}
