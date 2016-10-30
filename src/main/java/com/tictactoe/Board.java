package com.tictactoe;

public class Board {
	private static final int MAX_SIZE = 9;
	private static final char[] ALLOWED_SYMBOLS = new char[] {'X', 'O'};
	private static final int[][] WIN_CONDITIONS = new int[][] {
		{0, 1, 2},
		{3, 4, 5},
		{6, 7, 8},
		{0, 3, 6},
		{1, 4, 7},
		{2, 5, 8},
		{0, 4, 8},
		{6, 4, 2}
	};
	private char[] board;
	private int totalPlays;

	Board() {
		this.init();
	}

	public final void init() {
		board = new char[MAX_SIZE];
		this.clear();
	}

	public final boolean isCellEmpty(final int cell) {
		if (cell < MAX_SIZE && cell >= 0) {
			if (board[cell] == ' ') {
				return true;
			}
		}
		//cell is out of bounds or not empty
		return false;
	}

	public final boolean checkCell(final int cell, final char symbol) {
		if (this.isCellEmpty(cell)) {
			if (this.isAllowedSymbol(symbol)) {
				board[cell] = symbol;
				totalPlays++;
				return true;
			}
		}
		//Unable to check cell since its out of bounds, not empty or symbol is not allowed
		return false;
	}

	public final boolean isGameOver() {
		return (totalPlays == MAX_SIZE || this.isVictorious('O') || this.isVictorious('X'));
	}

	public final boolean isVictorious(final char symbol) {
		if (this.isAllowedSymbol(symbol)) {
			for (int[] possibleWins : WIN_CONDITIONS) {
				boolean allSame = false;
				for (int currentCell : possibleWins) {
					if (symbol == board[currentCell]) {
						allSame = true;
					} else {
						allSame = false;
						break;
					}
				}
				if (allSame) {
					return true;
				}
			}
		}
		return false;
	}

	public final  boolean isDraw() {
		return (!isVictorious('X') && !isVictorious('O') && totalPlays == MAX_SIZE);
	}

	private boolean isAllowedSymbol(final char symbol) {
		for (char allowedSymbol : ALLOWED_SYMBOLS) {
			if (symbol == allowedSymbol) {
				return true;
			}
		}
		return false;
	}

	public final String toString() {
		String currentBoard =
		  " " + board[0] + " | " + board[1] + " | " + board[2] + " \n"
		+ "-----------\n"
		+ " " + board[3] + " | " + board[4] + " | " + board[5] + " \n"
		+ "-----------\n"
		+ " " + board[6] + " | " + board[7] + " | " + board[8] + " \n";
		return currentBoard;
	}

	public final void clear() {
		totalPlays = 0;
		for (int i = 0; i < MAX_SIZE; i++) {
			board[i] = ' ';
		}
	}
}
