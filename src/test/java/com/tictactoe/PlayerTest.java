package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest{

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
}