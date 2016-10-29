package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComputerPlayerTest{

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("com.tictactoe.ComputerPlayer");
    }

    @Test
	public void testGetName(){
		ComputerPlayer computer = new ComputerPlayer();
		assertEquals("computer", computer.getName());
	}
}