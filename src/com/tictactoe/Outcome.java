package com.tictactoe;

/**
 * This class is created for UC7 where we check if the play or com has won
 * or is it a tie
 * @author saneeths
 *
 */
public class Outcome {
	/**
	 * @return this is a method with returntype char where each line of board is checked
	 * where its equal or not
	 */
	public static char winCheck() {
		
		//@parameter check the line which win
		String winLine = null;
		
		for(int w=1;w<9;w++) {
			switch(w) {
			case 1:
				winLine = ""+TicTacToeGame.board[1]+TicTacToeGame.board[2]+TicTacToeGame.board[3];
				break;
			case 2:
				winLine = ""+TicTacToeGame.board[4]+TicTacToeGame.board[5]+TicTacToeGame.board[6];
				break;
			case 3:
				winLine = ""+TicTacToeGame.board[7]+TicTacToeGame.board[8]+TicTacToeGame.board[9];
				break;
			case 4:
				winLine = ""+TicTacToeGame.board[1]+TicTacToeGame.board[4]+TicTacToeGame.board[7];
				break;
			case 5:
				winLine = ""+TicTacToeGame.board[2]+TicTacToeGame.board[5]+TicTacToeGame.board[8];
				break;
			case 6:
				winLine = ""+TicTacToeGame.board[3]+TicTacToeGame.board[6]+TicTacToeGame.board[9];
				break;
			case 7:
				winLine = ""+TicTacToeGame.board[1]+TicTacToeGame.board[5]+TicTacToeGame.board[9];
				break;
			case 8:
				winLine = ""+TicTacToeGame.board[3]+TicTacToeGame.board[5]+TicTacToeGame.board[7];
				break;
			}
			 if(winLine.equals("XXX"))
				 return 'X';
			 else if(winLine.equals("OOO"))
				 return 'O';
		}
		
		int i ;
		
		for(i=1;i<=9;i++) 
			if(TicTacToeGame.board[i] == ' ')
				return 'N';
		return 'D';
		

	}
	
	/**
	 * @method this is the method which is used to check whether the player or com has won
	 * or is it tie or change the turn between two
	 */
	public static void winTieResult() {
		char win = winCheck();
		
		if(win == TicTacToeGame.playerChoice) {
			System.out.println("You have won the game");
			TicTacToeGame.playAgain();
		}
		else if(win == TicTacToeGame.computerChoice) {
			System.out.println("Computer have won the game");
			TicTacToeGame.playAgain();
		}
		else if(win == 'D') {
			System.out.println("Game is a tie");
			TicTacToeGame.playAgain();
		}
		else {
			if(TicTacToeGame.turn == "player") {
				System.out.println("Computer turn to play");
				Computer.computer();
			}
			else {
				System.out.println("Your turn to play");
				TicTacToeGame.desiredLocation();
			}
		}
	}
}
