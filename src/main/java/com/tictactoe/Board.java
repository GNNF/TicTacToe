package com.tictactoe;

public class Board {
	private char board[];

	Board() {
		this.init();
	}

	public void init() {
		board = new char[9];
		for (int i = 0; i < 9; i++) {
			board[i] = (char)i;
		}
	}

	public boolean isOver() {
		return true;
	}

}