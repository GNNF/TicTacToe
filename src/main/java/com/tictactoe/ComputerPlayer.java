package com.tictactoe;
import java.util.Random;

public class ComputerPlayer{

	private static String name;

	private static Random randomplay = new Random();

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

	//returns a random number between 0 and 8
	public int makePlay(){
		int x = randomplay.nextInt(8 - 0 + 1) + 0;

		return x;
	}
}
