package com.tictactoe.tictactoe;

public class TicTacToe {
	
	private Board board;
	private Player playerOne;
	private Player playerTwo;
	
	
	public TicTacToe() {
		board = new Board();
		playerOne = new Player();
		playerTwo = new Player();
	}
}