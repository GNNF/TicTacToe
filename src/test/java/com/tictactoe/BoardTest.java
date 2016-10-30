package com.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

	@Test
    public final void testIsGameOver() {
    	Board board = new Board();
    	for (int i = 0; i < 9; i++) {
    		board.checkCell(i, 'X');
    	}
        assertEquals(true, board.isGameOver());
    }

    @Test
    public final void testIsGameNotOver() {
    	Board board = new Board();
    	board.checkCell(0, 'X');
    	board.checkCell(1, 'O');
    	board.checkCell(2, 'X');
    	board.checkCell(3, 'X');
        assertEquals(false, board.isGameOver());
    }

    @Test
    public final void testIsDraw() {
    	Board board = new Board();
    	board.checkCell(0, 'X');
    	board.checkCell(1, 'O');
    	board.checkCell(2, 'X');
    	board.checkCell(3, 'X');
    	board.checkCell(4, 'O');
    	board.checkCell(5, 'X');
    	board.checkCell(6, 'O');
    	board.checkCell(7, 'X');
    	board.checkCell(8, 'O');
        assertEquals(true, board.isDraw());
    }

    @Test
    public final void testXWon() {
    	Board board = new Board();
    	board.checkCell(0, 'X');
    	board.checkCell(1, 'X');
    	board.checkCell(2, 'X');
        assertEquals(true, board.isVictorious('X'));
    }

    @Test
    public final void testOWon() {
    	Board board = new Board();
    	board.checkCell(1, 'O');
    	board.checkCell(4, 'O');
    	board.checkCell(7, 'O');
        assertEquals(true, board.isVictorious('O'));
    }

    @Test
    public final void testCheckCellOne() {
    	Board board = new Board();
    	assertEquals(true, board.checkCell(4, 'X'));
    }

	@Test
    public final void testCheckCellTwo() {
    	Board board = new Board();
    	assertEquals(false, board.checkCell(12, 'X'));
    }

    @Test
    public final void testCheckCellThree() {
    	Board board = new Board();
    	assertEquals(false, board.checkCell(4, 'g'));
    }

    @Test
    public final void testCheckCellFour() {
    	Board board = new Board();
    	assertEquals(true, board.checkCell(8, 'O'));
    }

    @Test
    public final void testIsCellEmpty() {
    	Board board = new Board();
    	board.checkCell(8, 'O');
    	assertEquals(false, board.isCellEmpty(8));
    }

    @Test
    public final void testIsCellNotEmpty() {
    	Board board = new Board();
    	board.checkCell(7, 'O');
    	assertEquals(true, board.isCellEmpty(8));
    }

	@Test
	public final void testToStringOnEmptyBoard() {
		Board board = new Board();
		String test = "   |   |   \n-----------\n   |   |   \n-----------\n   |   |   \n";
		assertEquals(test, board.toString());
	}

	@Test
	public final void testToStringOnNonEmptyBoard() {
		Board board = new Board();
		board.checkCell(0, 'X');
		board.checkCell(7, 'X');
		board.checkCell(1, 'O');
		board.checkCell(2, 'O');
		board.checkCell(4, 'O');
		String test = " X | O | O \n-----------\n   | O |   \n-----------\n   | X |   \n";
		assertEquals(test, board.toString());
	}
}
