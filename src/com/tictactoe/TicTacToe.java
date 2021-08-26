package com.tictactoe;

public class TicTacToe {
	private char[] board = new char[10];
	
	public void createBoard() {
		for(int i=1;i<board.length;i++) {
			board[i] = ' ';
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to board game");
		TicTacToe ticTacToe = new TicTacToe(); 
		ticTacToe.createBoard();
	}
}
