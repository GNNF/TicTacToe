package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("com.tictactoe.Player");
    }

	@Test
	public void testGetName(){
		Player player = new Player();
		assertEquals("Unknown", player.getName());
	}

	@Test
	public void testSetName(){
		Player player = new Player();
		String name = "Jon";
		player.setName(name);
		assertEquals(name, player.getName());
	}

	@Test
	public void testGetSymbol(){
		Player player = new Player();
		assertEquals('X', player.getSymbol());
	}

	@Test
	public void testSetSymbol(){
		Player player = new Player();
		char symbol = 'O';
		player.setSymbol(symbol);
		assertEquals(symbol, player.getSymbol());
	}
}