package com.bridgelabz.demo;

import java.util.Random;
import java.util.Scanner;

public class SnakesAndLadders {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WIN_POSITION = 100;

	public static int diceRolls = 0;

	public int currentPositionPlayer1 = 0, currentPositionPlayer2 = 0;
	public int diceValue = 0, currentPlayer = -1;
	public int player1Position = 0, player2Position = 0;
	public int ladderValue = 0, snakeValue = 0;

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
			break;
		case LADDER:
			position = position + diceValue; // + getLadderValue(position) + diceThrow();
			break;
		case SNAKE:
			position = position + diceValue; // getSnakeValue(position);
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
				if (player1Position > 100) {
					player1Position = player1Position - diceValue;
					diceValue = diceThrow();
					player1Position = player1Position + diceValue;
				}
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

	public int getLadderValue(int position) {
		System.out.println("You got a ladder :)");
		switch (position) {
		case 32:
			ladderValue = 9;
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
			ladderValue = 24;
			break;
		case 93:
			ladderValue = 4;
			break;
		default:
			ladderValue = 0;
		}
		return ladderValue;
	}

	public int getSnakeValue(int position) {
		System.out.println("Too bad, bitten by snake :(");
		switch (position) {
		case 54:
			snakeValue = 12;
			break;
		case 90:
			snakeValue = 18;
			break;
		case 99:
			snakeValue = 15;
			break;
		case 19:
			snakeValue = 4;
			break;
		case 40:
			snakeValue = 10;
			break;
		case 67:
			snakeValue = 22;
			break;
		default:
			snakeValue = 0;
		}
		return snakeValue;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Snakes and Ladders game");
		SnakesAndLadders sl = new SnakesAndLadders();
		sl.startGame();
	}

}
