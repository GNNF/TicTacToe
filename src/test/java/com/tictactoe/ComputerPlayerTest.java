package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComputerPlayerTest {

	public static void main(final String[] args) {
      org.junit.runner.JUnitCore.main("com.tictactoe.ComputerPlayer");
    }

    @Test
	public final void testGetName() {
		ComputerPlayer computer = new ComputerPlayer();
		assertEquals("Computer", computer.getName());
	}

	@Test
	public final void testGetSymbol() {
		ComputerPlayer computer = new ComputerPlayer();
		assertEquals('O', computer.getSymbol());
	}

	@Test
	public final void testMakePlay() {
		ComputerPlayer computer = new ComputerPlayer(150);
		assertEquals(8, computer.makePlay());
	}
}
