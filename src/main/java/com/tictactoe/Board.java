package com.tictactoe;

public class Board {
	private final int MAX_SIZE = 9;
	private final char ALLOWED_SYMBOLS[] = new char[] {'X', 'O'};
	private char board[];
	private int totalPlays;

	Board() {
		this.init();
	}

	public void init() {
		board = new char[MAX_SIZE];
		totalPlays = 0;
		for (int i = 0; i < MAX_SIZE; i++) {
			board[i] = (char)i;
		}
	}

	public boolean checkCell(int cell, char symbol) {
		if (cell < MAX_SIZE && cell >= 0) {
			if (this.isAllowedSymbol(symbol)) {
				board[cell] = symbol;
				totalPlays++;
				return true;
			}
		}
		//Unable to check cell since its out of bounds
		return false;
	}

	public boolean isGameOver() {
		return totalPlays == 9;
	}

	private boolean isAllowedSymbol(char symbol) {
		for(char allowedSymbol : ALLOWED_SYMBOLS) {
			if (symbol == allowedSymbol)
				return true;
		}
		return false;
	}

}