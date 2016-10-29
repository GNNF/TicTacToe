package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	private Board board;
	private Scanner scanner;
	private Player player;
	private ComputerPlayer computer;
		
	public TicTacToe() {
		this.init();
		this.game();
	}
	
	public void init() {
		board = new Board();
		scanner = new Scanner( System.in );
		player = new Player();
		computer = new ComputerPlayer();
	}
	
	public static void main(String[] args)
	{
		TicTacToe ticTacToe = new TicTacToe();
	}
	
	public void game() {
		this.instructions();
		do {
			board.clear();
			this.displayBoard();
			do {
				this.makeMove();
				this.displayBoard();
				if(this.isGameOver(player.getName())) {
					break;
				} else {
					this.computerTurn();
					this.displayBoard();
				}
			} while(!this.isGameOver(computer.getName()));
		} while(continuePlaying());
	}
	
	public boolean isGameOver(String winner) {
		if(board.isGameOver()) {
			if(board.isDraw()) {
				System.out.println("Draw!");
				return true;
			} else {
				System.out.println(winner + " is Victorious!");
				return true;
			}
		}
		return false;
	}
	
	public void makeMove() {
		System.out.print("Choose a cell to play: ");
		boolean validInput = false;
		int cell = 0;
		do {
			cell = scanner.nextInt();
			validInput = board.checkCell(cell-1, player.getSymbol());
			if(!validInput) {
				System.out.println("Invalid input!");
				System.out.print("Please choose an available valid cell to play: ");
			}
		} while(!validInput);
	}
	public void computerTurn() {
		System.out.println("Computers turn");
		boolean validInput = false;
		int cell = 0;
		do {
			cell = computer.makePlay();
			validInput = board.checkCell(cell-1, computer.getSymbol());
		} while(!validInput);
	}
	
	public boolean continuePlaying() {
		String ans;
		System.out.print("Do you wish to play another game? (Y/N): ");
		ans = scanner.next();
		switch (ans.toUpperCase()) {
			case "Y":
			case "YES":
				return true;
			case "N":
			case "NO":
				return false;
			default:
				throw new IllegalArgumentException("Invalid answer: " + ans);
		}
	}
	
	public void displayBoard() {
		System.out.print(board.toString());
	}
	
	public void instructions() {
		System.out.println("Tic Tac Toe v1.0");
		System.out.println("Be sure to input the number correpsonding to the cell you wish to play.");
		System.out.println(" 1 | 2 | 3 \n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9 \n");
		System.out.print("First choose a name: ");
		String name = scanner.next();
		player.setName(name);
		System.out.println("Lets play " + name + "!");
	}
}