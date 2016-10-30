package com.tictactoe;

public class Player {

	private String name;
	private char symbol;

	public Player() {
		this.name = "Unknown";
		this.symbol = 'X';
	}

	public final String getName() {
		return this.name;
	}

	public final void setName(final String pname) {
		this.name = pname;
	}

	public final void setSymbol(final char psymbol) {
		this.symbol = psymbol;
	}
	public final char getSymbol() {
		return this.symbol;
	}
}
