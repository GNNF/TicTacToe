package com.tictactoe;
import java.util.Random;

public class ComputerPlayer extends Player {

	private static Random randomplay;

	public ComputerPlayer() {
		this.init();
		randomplay = new Random();
	}

	public ComputerPlayer(final long seed) {
		this.init();
		randomplay = new Random(seed);
	}

	private void init() {
		this.setName("Computer");
		this.setSymbol('O');
	}

	//returns a random number between 0 and 8
	public final int makePlay() {
		int x = randomplay.nextInt(8 - 0 + 1) + 0;
		return x;
	}
}
