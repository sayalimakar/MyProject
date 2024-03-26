package com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.sp.TicTacToe;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

	@Test
	public void testMakeMoveValid() {
		TicTacToe game = new TicTacToe();
		assertTrue(game.makeMove(0, 0)); // Valid move
		assertEquals('X', game.currentPlayer);
	}

	@Test
	public void testMakeMoveInvalid() {
		TicTacToe game = new TicTacToe();
		game.makeMove(0, 0);
		assertFalse(game.makeMove(0, 0)); // Invalid move (cell already occupied)
	}

	@Test
	public void testCheckRows() {
		TicTacToe game = new TicTacToe();
		game.makeMove(0, 0);
		game.makeMove(1, 0);
		game.makeMove(0, 1);
		game.makeMove(1, 1);
		game.makeMove(0, 2);
		assertTrue(game.checkRows()); // First row is filled
	}

	@Test
	public void testCheckColumns() {
		TicTacToe game = new TicTacToe();
		game.makeMove(0, 0);
		game.makeMove(0, 1);
		game.makeMove(1, 0);
		game.makeMove(1, 1);
		game.makeMove(2, 0);
		assertTrue(game.checkColumns()); // First column is filled
	}

	@Test
	public void testCheckDiagonals() {
		TicTacToe game = new TicTacToe();
		game.makeMove(0, 0);
		game.makeMove(0, 1);
		game.makeMove(1, 1);
		game.makeMove(1, 2);
		game.makeMove(2, 2);
		assertTrue(game.checkDiagonals()); // Main diagonal is filled
	}

	@Test
	public void testIsGameOver() {
		TicTacToe game = new TicTacToe();
		assertFalse(game.isGameOver()); // Game has just started, not over
		game.makeMove(0, 0);
		game.makeMove(0, 1);
		game.makeMove(0, 2);
		assertTrue(game.isGameOver()); // First row filled, game over (draw)
	}
}
