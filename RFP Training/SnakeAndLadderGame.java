package com.bridgelabz.demo;

import java.util.Random;

public class SnakeAndLadderGame {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WIN_POSITION = 100;
	
    int snakesArray [] = {54,90,99,9,40,67};
    int laddersArray[] = {32,13,45,53,75,93};
    int currentPlayer = 0;
    int player1Position = 0, player2Position = 0, currentPositionPlayer1 = 0, currentPositionPlayer2 = 0, diceValue = 0;
	int diceRolls = 0, ladderValue = 0, snakeValue = 0;
	public void startGame() {	
	do {
		 System.out.println("FIRST PLAYER'S TURN");
		 diceValue = diceThrow();
		 currentPositionPlayer1 = updatePlayerPosition(player1Position,diceValue);
		 System.out.println("Position of first player: "+currentPositionPlayer1);
		 currentPlayer++;
		 System.out.println("SECOND PLAYER'S TURN");
		 diceValue = diceThrow();
		 currentPositionPlayer2 = updatePlayerPosition(player2Position,diceValue);
		 System.out.println("Position of second player: "+currentPositionPlayer2);
		 currentPlayer--;
		 }while ((currentPositionPlayer1 == WIN_POSITION) || (currentPositionPlayer2 == WIN_POSITION) );
    
	if(currentPositionPlayer1 == WIN_POSITION)
    	System.out.println("Player 1 is the Winner!");
    else
    	System.out.println("Player 2 is the Winner!");
	}
		public int updatePlayerPosition(int position, int diceValue) {
			Random r = new Random();
			int option = r.nextInt(3);
			switch(option) {
			case NO_PLAY:
				position = position + diceValue;
				if(position > 100) {
					diceValue = diceThrow();
					position = position + diceValue;
				}
				break;
			case LADDER: 
				position = position + diceValue + getLadderValue() + diceThrow();
				if(position > 100) {
				diceValue = diceThrow();
				position = position + diceValue;
				}
				break;
			case SNAKE:
				position = position + diceValue - getSnakeValue();
				if(position < 0) 
					position = 0;
				if(position > 100) {
				diceValue = diceThrow();
				position = position + diceValue;
				}
				break;
			default:
				//Do Nothing
			}
			return position;
		}

	public int getLadderValue() {
		System.out.println("You got a ladder :)");
		switch (laddersArray[0]) {
		case 32:
			ladderValue =  9;
			break;
		case 13:
			ladderValue = 13;
			break;
		case 45:
			ladderValue = 5;
			break;
		case 53:
			ladderValue = 12;
			break;
		case 75: 
			ladderValue = 18;
			break;
		case 22: 
			ladderValue = 25;
			break;
		default: 
			ladderValue = 0;			
		}
		return ladderValue;
	}
	public int getSnakeValue() {
		System.out.println("Too bad, bitten by snake :(");
		switch (laddersArray[0]) {
		case 32:
			snakeValue =  5;
			break;
		case 13:
			snakeValue = 10;
			break;
		case 45:
			snakeValue = 8;
			break;
		case 53:
			snakeValue = 53;
			break;
		case 75: 
			snakeValue = 75;
			break;
		case 93: 
			snakeValue = 93;
			break;
		default: 
			snakeValue = 0;
		}		
		return snakeValue;
	}
	public int diceThrow() {
			int diceValue = (int) (Math.random() * (6 - 1)) + 1;
			diceRolls++;
			return diceValue;
		}
	public static void main(String[] args) {
		System.out.println("Welcome to the Snakes and Ladder game\n");
		
		SnakeAndLadderGame snakeAndLadder = new SnakeAndLadderGame();
		snakeAndLadder.startGame();
	}
	} 
	
	
