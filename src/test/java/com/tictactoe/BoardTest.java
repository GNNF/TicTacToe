package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

	@Test
    public void testIsOver() {
    	Board board = new Board();
        assertEquals(true, board.isOver());
    }

}