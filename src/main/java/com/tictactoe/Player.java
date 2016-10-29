package com.tictactoe;

public class Player {

	protected String name;
	protected char symbol;

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

	public void setSymbol(char psymbol) {
		this.symbol = psymbol;
	}
	public char getSymbol() {
		return symbol;
	}
}
