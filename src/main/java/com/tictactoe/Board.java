package com.tictactoe;

public class Board {
	char board[];

	Board() {
		this.init();
	}

	public void init() {
		for (int i = 0; i < 9; i++) {
			board[i] = (char)i;
		}
	}

	public boolean isOver() {
		return false;
	}

}