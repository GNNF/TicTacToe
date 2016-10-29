package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerPlayerTest{

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("com.tictactoe.ComputerPlayer");
    }

    @Test
	public void testGetName(){
		ComputerPlayer computer = new ComputerPlayer();
		assertEquals("computer", computer.getName());
	}

	@Test
	public void testGetSymbol(){
		ComputerPlayer computer = new ComputerPlayer();
		assertEquals('O', computer.getSymbol());
	}

	@Test
	public void testMakePlay(){
		ComputerPlayer computer = new ComputerPlayer();
		int random = computer.makePlay();
		assertNotNull(random);
	}
}