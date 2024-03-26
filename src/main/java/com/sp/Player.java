package com.sp;

public class Player {
	private String name;
	private char symbol;

	public Player(String name, char symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public char getSymbol() {
		return symbol;
	}

	// Optionally, you can add setters if needed

	@Override
	public String toString() {
		return "Player{" + "name='" + name + '\'' + ", symbol=" + symbol + '}';
	}
}
