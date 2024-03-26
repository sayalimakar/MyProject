package com.sp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Initialize players
		Player player1 = new Player("Player 1", 'X');
		Player player2 = new Player("Player 2", 'O');

		// Initialize TicTacToe game
		TicTacToe game = new TicTacToe();

		// Main game loop
		while (!game.isGameOver()) {
			// Display current board
			game.displayBoard();

			// Get current player's move
			Player currentPlayer = (game.currentPlayer == 'X') ? player1 : player2;
			System.out.println(currentPlayer.getName() + "'s turn");
			System.out.print("Enter row (0-2): ");
			int row = scanner.nextInt();
			System.out.print("Enter column (0-2): ");
			int col = scanner.nextInt();

			// Make the move
			if (game.makeMove(row, col)) {
				game.switchPlayer();
			} else {
				System.out.println("Invalid move! Try again.");
			}
		}

		// Display final board
		game.displayBoard();

		// Determine winner or draw
		if (game.checkRows() || game.checkColumns() || game.checkDiagonals()) {
			Player winner = (game.currentPlayer == 'X') ? player2 : player1;
			System.out.println(winner.getName() + " wins!");
		} else {
			System.out.println("It's a draw!");
		}

		scanner.close();
	}
}
