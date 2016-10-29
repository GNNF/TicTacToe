package com.tictactoe;

public class Board {
	private final int MAX_SIZE = 9;
	private final char ALLOWED_SYMBOLS[] = new char[] {'X', 'O'};
	private final int WIN_CONDITIONS[][] = new int[][] {
		{0,1,2}, 
		{3,4,5},
		{6,7,8},
		{0,3,6},
		{1,4,7},
		{2,5,8},
		{0,4,8},
		{6,4,2}
	};
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

	public boolean isCellEmpty(int cell) {
		if (cell < MAX_SIZE && cell >= 0) {
			if (board[cell] == cell)
				return true;
		}
		//Unable to check cell since its out of bounds
		return false;
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
		return (totalPlays == MAX_SIZE || this.isVictorious('O') || this.isVictorious('X'));
	}

	public boolean isVictorious(char symbol) {
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

	public boolean isDraw() {
		return (!isVictorious('X') && !isVictorious('O') && totalPlays == MAX_SIZE);
	}

	private boolean isAllowedSymbol(char symbol) {
		for(char allowedSymbol : ALLOWED_SYMBOLS) {
			if (symbol == allowedSymbol)
				return true;
		}
		return false;
	}

}
