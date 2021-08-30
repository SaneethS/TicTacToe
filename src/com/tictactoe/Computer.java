package com.tictactoe;

import java.util.*;

/**@class where UC8 has been implemented in which computer game is played
 * @author saneeths
 *
 */
public class Computer {
	public static Random random = new Random();
	
	/**
	 * @method in which all the moves which computer is supposed to do is written
	 */
	public static void computer() {
		TicTacToeGame.turn = "computer";
		
		if(((TicTacToeGame.board[1]==' ')&&(TicTacToeGame.board[2]==TicTacToeGame.board[3]&&TicTacToeGame.board[2]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[4]==TicTacToeGame.board[7]&&TicTacToeGame.board[4]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[5]==TicTacToeGame.board[9]&&TicTacToeGame.board[5]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[1] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[2]==' ')&&(TicTacToeGame.board[1]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[8]&&TicTacToeGame.board[8]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[2] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[3]==' ')&&(TicTacToeGame.board[1]==TicTacToeGame.board[2]&&TicTacToeGame.board[2]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[6]==TicTacToeGame.board[9]&&TicTacToeGame.board[9]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[5]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[3] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[4]==' ')&&(TicTacToeGame.board[1]==TicTacToeGame.board[7]&&TicTacToeGame.board[1]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[6]&&TicTacToeGame.board[6]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[4] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[5]==' ')&&(TicTacToeGame.board[1]==TicTacToeGame.board[9]&&TicTacToeGame.board[1]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[7]==TicTacToeGame.board[3]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[4]==TicTacToeGame.board[6]&&TicTacToeGame.board[6]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[2]==TicTacToeGame.board[8]&&TicTacToeGame.board[8]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[5] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[6]==' ')&&(TicTacToeGame.board[9]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[4]&&TicTacToeGame.board[4]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[6] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[7]==' ')&&(TicTacToeGame.board[1]==TicTacToeGame.board[4]&&TicTacToeGame.board[4]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[3]==TicTacToeGame.board[5]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[8]==TicTacToeGame.board[9]&&TicTacToeGame.board[8]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[7] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[8]==' ')&&(TicTacToeGame.board[9]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[2]==TicTacToeGame.board[5]&&TicTacToeGame.board[2]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[8] = TicTacToeGame.computerChoice;
			
		}else if(((TicTacToeGame.board[9]==' ')&&(TicTacToeGame.board[5]==TicTacToeGame.board[1]&&TicTacToeGame.board[5]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[8]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[6]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice))) {
			TicTacToeGame.board[9] = TicTacToeGame.computerChoice;
		}else {
			playComputer();
		}
		TicTacToeGame.showBoard();
		TicTacToeGame.desiredLocation();
	}

	/**
	 * @method in which how computer is played using the moves is written
	 */
	public static void playComputer() {
		
		int index = random.nextInt(9)+1;
		if(TicTacToeGame.board[index] == ' ') {
			TicTacToeGame.board[index] = TicTacToeGame.computerChoice;
		}else
			playComputer();
	}
}
