package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest{

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("com.tictactoe.Player");
    }

	@Test
	public void testName(){
		Player player = new Player();
		assertEquals("", player.getName());
	}
}