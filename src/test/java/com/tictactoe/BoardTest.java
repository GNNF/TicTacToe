package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

	@Test
    public void testIsOver() {
    	Board board;
        assertEquals(true, board.isOver());
    }

}