package com.tictactoe;

public class Player{

	private String name;
	private char symbol;

	public Player(){
		name = "";
	}
	public String getName(){
		return name;
	}

	public void setName(String pname){
		this.name = pname;
	}
}