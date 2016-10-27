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
		{0,4,7},
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
		return totalPlays == MAX_SIZE;
	}

	public boolean isVictorious(char symbol) {
		for (int[] possibleWins : WIN_CONDITIONS) {
			if (symbol == board [possibleWins[0]] && symbol == board [possibleWins[1]] && symbol == board [possibleWins[2]]) {
				return true;
			}
		}
		return false;
	}

	private boolean isAllowedSymbol(char symbol) {
		for(char allowedSymbol : ALLOWED_SYMBOLS) {
			if (symbol == allowedSymbol)
				return true;
		}
		return false;
	}

}