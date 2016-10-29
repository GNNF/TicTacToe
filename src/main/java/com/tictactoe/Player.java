package com.tictactoe;

public class Player {

	private String name;
	private char symbol;

	public Player() {
		name = "Unknown";
		symbol = 'X';
	}

	public String getName() {
		return name;
	}

	public void setName(String pname) {
		this.name = pname;
	}

	public char getSymbol() {
		return symbol;
	}
}
