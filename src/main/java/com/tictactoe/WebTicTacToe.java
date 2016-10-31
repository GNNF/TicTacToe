package com.tictactoe;

public class WebTicTacToe {
	private Board board;
	private Player player;
	private ComputerPlayer computer;

	public WebTicTacToe() {
		board = new Board();
		this.init();
	}

	public final void init() {
		board.init();
		player = new Player();
		computer = new ComputerPlayer();
	}

	public final void initPlayer(final String name) {
		player.setName(name);
	}

	public final String renderGame() {
		StringBuilder html = new StringBuilder("");
		html.append("<div class='grid'>");
		for (int i = 0; i < 9; i++) {
			html.append("<div data-cell='" + i + "'class='cell cell-" + i + "'>" + board.getCell(i) + "</div>");
		}
		html.append("</div>");
		return html.toString();
	}

	public final void clear() {
		board.clear();
	}

	public final boolean makePlay(final int index) {
		return board.checkCell(index, player.getSymbol());
	}

	public final void computerMakePlay() {
		boolean play = false;
		do  {
			play = board.checkCell(computer.makePlay(), computer.getSymbol());
		} while (!play);
	}

	public final boolean isOver() {
		return board.isGameOver();
	}
}
