package com.tictactoe;
import java.util.Random;

public class ComputerPlayer extends Player {

	private static Random randomplay;

	public ComputerPlayer(){
		this.init();
		randomplay = new Random();
	}

	public ComputerPlayer(long seed){
		this.init();
		randomplay = new Random(seed);
	}

	private void init() {
		name = "Computer";
		symbol = 'O';
	}

	//returns a random number between 0 and 8
	public int makePlay(){
		int x = randomplay.nextInt(8 - 0 + 1) + 0;
		return x;
	}
}
