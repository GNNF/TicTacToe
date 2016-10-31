package com.tictactoe;

import java.lang.*;

public class WebTicTacToe {
	
	private Board board;
	private Player player;
	private ComputerPlayer computer;
		
	public WebTicTacToe() {
		board = new Board();
		this.init();
	}
	
	public void init() {
		board.init();
		player = new Player();
		computer = new ComputerPlayer();
	}

	public void initPlayer(String name) {
		player.setName(name);
	}
	
	public String renderGame() {
		StringBuilder html = new StringBuilder("");
		html.append("<div class='grid'>");
		for (int i = 0; i < 9; i++) {
			html.append("<div data-cell='"+i+"'class='cell cell-"+i+"'>"+board.getCell(i)+"</div>");
		}
		html.append("</div>");
		return html.toString();
	}

	public void clear() {
		board.clear();
	}

	public boolean makePlay(int index) {
		return board.checkCell(index, player.getSymbol());
	}

	public void computerMakePlay() {
		boolean play = false;
		do  {
			play = board.checkCell(computer.makePlay(), computer.getSymbol());
		} while (!play);
	}

	public boolean isOver() {
		return board.isGameOver();
	}
}