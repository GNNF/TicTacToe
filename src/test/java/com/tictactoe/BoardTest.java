package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

	@Test
    public void testIsGameOver() {
    	Board board = new Board();
    	for (int i = 0; i < 9; i++) {
    		board.checkCell(i, 'X');
    	}
        assertEquals(true, board.isGameOver());
    }

    @Test
    public void testIsGameNotOver() {
    	Board board = new Board();
    	for (int i = 0; i < 5; i++) {
    		board.checkCell(i, 'O');
    	}
        assertEquals(false, board.isGameOver());
    }

    @Test
    public void testCheckCellOne() {
    	Board board = new Board();
    	assertEquals(true, board.checkCell(4, 'X'));
    }

	@Test
    public void testCheckCellTwo() {
    	Board board = new Board();
    	assertEquals(false, board.checkCell(12, 'X'));
    }

    @Test
    public void testCheckCellThree() {
    	Board board = new Board();
    	assertEquals(false, board.checkCell(4, 'g'));
    }

    @Test
    public void testCheckCellFour() {
    	Board board = new Board();
    	assertEquals(true, board.checkCell(8, 'O'));
    }

}