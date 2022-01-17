package com.bridgelabz.demo;

import java.util.Random;

public class SnakesAndLadders {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WIN_POSITION = 100;

	public static int diceRolls = 0;

	public int currentPositionPlayer1 = 0, currentPositionPlayer2 = 0;
	public int diceValue = 0, currentPlayer = -1;
	public int player1Position = 0, player2Position = 0;
	public int ladderValue = 10, snakeValue = 7;

	public static int diceThrow() {
		int diceValue = (int) (Math.random() * (6 - 1)) + 1;
		diceRolls++;
		return diceValue;
	}

	public int updatePlayerPosition(int position, int diceValue) {
		Random r = new Random();
		int option = r.nextInt(3);
		switch (option) {
		case NO_PLAY:
			position = position + diceValue;
			if (position > 100) {
				position = position - diceValue;
			}
			break;
		case LADDER:
			System.out.println("Congrats, You got a ladder! :)");
			position = position + diceValue + ladderValue;
			if (position > 100) {
				position = position - diceValue - ladderValue;
			}
			break;
		case SNAKE:
			System.out.println("Too bad, bitten by a snake :(");
			position = position + diceValue - snakeValue;
			break;
		default:
			// Do Nothing
		}
		return position;
	}

	public void startGame() {
		do {
			diceValue = diceThrow();
			if (currentPlayer == -1) {
				System.out.println("FIRST PLAYER'S TURN");
				currentPositionPlayer1 = updatePlayerPosition(player1Position, diceValue);
				player1Position = currentPositionPlayer1;
				System.out.println("Position of first player: " + currentPositionPlayer1);
				if (isWin(player1Position)) {
					System.out.println("First player wins");
					System.out.println("Dice is thrown " + diceRolls + " times.");
					return;
				}
			} else {
				System.out.println("SECOND PLAYER'S TURN");
				currentPositionPlayer2 = updatePlayerPosition(player2Position, diceValue);
				player2Position = currentPositionPlayer2;
				if (player2Position > 100) {
					player2Position = player2Position - diceValue;
					diceValue = diceThrow();
					player2Position = player2Position + diceValue;
				}
				System.out.println("Position of second player: " + currentPositionPlayer2);
				if (isWin(player2Position)) {
					System.out.println("Second player wins");
					System.out.println("Dice is thrown " + diceRolls + " times.");
					return;
				}
			}
			currentPlayer = -currentPlayer;

		} while (currentPositionPlayer1 <= WIN_POSITION && currentPositionPlayer2 <= WIN_POSITION);

	}

	public boolean isWin(int position) {
		return WIN_POSITION == position;
	}


	public static void main(String[] args) {
		System.out.println("Welcome to the Snakes and Ladders game");
		SnakesAndLadders sl = new SnakesAndLadders();
		sl.startGame();
	}

}
