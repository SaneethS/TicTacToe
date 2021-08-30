package com.tictactoe;

import java.util.*;

/**@class where UC8, UC9, UC10 and UC11 has been implemented in which computer game is played and also block the player moves
 * @author saneeths
 *
 */
public class Computer {
	public static Random random = new Random();
	
	/**
	 * @method in which all the moves which computer is supposed to do is written
	 * and block the moves of the player
	 */
	public static void computer() {
		TicTacToeGame.turn = "computer";
		
		if((TicTacToeGame.board[1]==' ')&&((TicTacToeGame.board[2]==TicTacToeGame.board[3]&&TicTacToeGame.board[2]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[4]==TicTacToeGame.board[7]&&TicTacToeGame.board[4]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[5]==TicTacToeGame.board[9]&&TicTacToeGame.board[5]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[1] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[2]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[8]&&TicTacToeGame.board[8]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[2] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[3]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[2]&&TicTacToeGame.board[2]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[6]==TicTacToeGame.board[9]&&TicTacToeGame.board[9]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[5]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[3] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[4]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[7]&&TicTacToeGame.board[1]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[6]&&TicTacToeGame.board[6]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[4] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[5]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[9]&&TicTacToeGame.board[1]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[7]==TicTacToeGame.board[3]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[4]==TicTacToeGame.board[6]&&TicTacToeGame.board[6]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[2]==TicTacToeGame.board[8]&&TicTacToeGame.board[8]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[5] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[6]==' ')&&((TicTacToeGame.board[9]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[4]&&TicTacToeGame.board[4]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[6] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[7]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[4]&&TicTacToeGame.board[4]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[3]==TicTacToeGame.board[5]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[8]==TicTacToeGame.board[9]&&TicTacToeGame.board[8]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[7] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[8]==' ')&&((TicTacToeGame.board[9]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[2]==TicTacToeGame.board[5]&&TicTacToeGame.board[2]==TicTacToeGame.computerChoice))) {
			
			TicTacToeGame.board[8] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[9]==' ')&&((TicTacToeGame.board[5]==TicTacToeGame.board[1]&&TicTacToeGame.board[5]==TicTacToeGame.computerChoice)||
				(TicTacToeGame.board[8]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.computerChoice)
				||(TicTacToeGame.board[6]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.computerChoice))) {
			TicTacToeGame.board[9] = TicTacToeGame.computerChoice;
		}
		//UC9 Blocking condition in which computer blocks player moves
		else if((TicTacToeGame.board[1]==' ')&&((TicTacToeGame.board[2]==TicTacToeGame.board[3]&&TicTacToeGame.board[2]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[4]==TicTacToeGame.board[7]&&TicTacToeGame.board[4]==TicTacToeGame.playerChoice)
				||(TicTacToeGame.board[5]==TicTacToeGame.board[9]&&TicTacToeGame.board[5]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[1] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[2]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[8]&&TicTacToeGame.board[8]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[2] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[3]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[2]&&TicTacToeGame.board[2]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[6]==TicTacToeGame.board[9]&&TicTacToeGame.board[9]==TicTacToeGame.playerChoice)
				||(TicTacToeGame.board[5]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[3] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[4]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[7]&&TicTacToeGame.board[1]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[6]&&TicTacToeGame.board[6]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[4] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[5]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[9]&&TicTacToeGame.board[1]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[7]==TicTacToeGame.board[3]&&TicTacToeGame.board[7]==TicTacToeGame.playerChoice)
				||(TicTacToeGame.board[4]==TicTacToeGame.board[6]&&TicTacToeGame.board[6]==TicTacToeGame.playerChoice)
				||(TicTacToeGame.board[2]==TicTacToeGame.board[8]&&TicTacToeGame.board[8]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[5] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[6]==' ')&&((TicTacToeGame.board[9]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[5]==TicTacToeGame.board[4]&&TicTacToeGame.board[4]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[6] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[7]==' ')&&((TicTacToeGame.board[1]==TicTacToeGame.board[4]&&TicTacToeGame.board[4]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[3]==TicTacToeGame.board[5]&&TicTacToeGame.board[3]==TicTacToeGame.playerChoice)
				||(TicTacToeGame.board[8]==TicTacToeGame.board[9]&&TicTacToeGame.board[8]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[7] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[8]==' ')&&((TicTacToeGame.board[9]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[2]==TicTacToeGame.board[5]&&TicTacToeGame.board[2]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[8] = TicTacToeGame.computerChoice;
			
		}else if((TicTacToeGame.board[9]==' ')&&((TicTacToeGame.board[5]==TicTacToeGame.board[1]&&TicTacToeGame.board[5]==TicTacToeGame.playerChoice)||
				(TicTacToeGame.board[8]==TicTacToeGame.board[7]&&TicTacToeGame.board[7]==TicTacToeGame.playerChoice)
				||(TicTacToeGame.board[6]==TicTacToeGame.board[3]&&TicTacToeGame.board[3]==TicTacToeGame.playerChoice))) {
			
			TicTacToeGame.board[9] = TicTacToeGame.computerChoice;
		}
		
		else {
			cornerAndCenterPlay();
		}
		TicTacToeGame.showBoard();
		Outcome.winCheck();
		Outcome.winTieResult();
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
	
	/**
	 * @method where the player is taking corner if neither is winning and also taking center
	 */
	public static void cornerAndCenterPlay() {
		int corner[] = {1,3,7,9};
		boolean flag = false;
		
		for(int i=0; i<4; i++) {
			if(TicTacToeGame.board[corner[i]] == ' ') {
				TicTacToeGame.board[corner[i]] = TicTacToeGame.computerChoice;
				flag = true;
				break;
			}
		}
		if(flag == false) {
			if(TicTacToeGame.board[5] == ' ')
				TicTacToeGame.board[5] = TicTacToeGame.computerChoice;
			else
				playComputer();
		}
	}
}
