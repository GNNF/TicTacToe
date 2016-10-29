package com.tictactoe;

public class ComputerPlayer{

	private static String name;

	public final char symbol;

	public  ComputerPlayer(){
		name = "computer";
		symbol = 'O';

	}
	public  String getName(){
		return name;
	}

	public char getSymbol(){
		return symbol;
	}
}
