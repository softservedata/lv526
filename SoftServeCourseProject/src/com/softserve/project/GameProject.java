package com.softserve.project;

import java.util.Random;
import java.util.Scanner;

class GameProject {
	final char X_SIGN = 'X';
	final char O_SIGN = 'O';
	final char EMPTY_SIGN = '.';
	int lineLength = 3;
	int columnLength = 3;
	char [][] field;
	Random random;
	Scanner scanner;
	
	public static void main (final String [] args) {
		new GameProject().game();
	}
	
	GameProject() {
		random = new Random();
		scanner = new Scanner(System.in);
		field = new char[3][3];
	}
	
	void game(){
		initField();
		boolean gameIsRunning = true;
		while (gameIsRunning) {
			playerTurn();
			if (winCheck(X_SIGN) == true) {
				gameIsRunning = false;
				System.out.println("Player win!");
				}
			else if (drawCheck()) {
				System.out.println("Draw!");
				gameIsRunning = false;
				}
			computerTurn();
			if (winCheck(O_SIGN)) {
				System.out.println("Computer win!");
				gameIsRunning = false;
				}
			else if (drawCheck()) {
				System.out.println("Draw!");
				gameIsRunning = false;
				}
			printField();
		}
		System.out.println("Game Over!");
	}
	
	void initField() {
		for (int line = 0; line < lineLength; line++) {
			for (int column = 0; column < columnLength; column++) {
				field [line][column] = EMPTY_SIGN;
			}
		}
	}
	
	void printField(){
		for (int line = 0; line < lineLength; line++) {
			for (int column = 0; column < columnLength; column++) {
				System.out.print(field[line][column] + " ");
			}
			System.out.println();
		}		
	}
	
	void playerTurn() {
		int x, y;
		do {
			System.out.println("Enter X and Y from 1 to 3:");
			x = scanner.nextInt() - 1;
			y = scanner.nextInt() - 1;
		}
		while (!isWrongCellValue (x, y));
			field[y][x] = X_SIGN;
	}
	
	boolean isWrongCellValue(int x, int y) {
		if ( (x < 0) || (y < 0) || (x >= 3) || (y >= 3) ) {
			return false;
		}
		return field[y][x] == EMPTY_SIGN;
	}
	
	void computerTurn() {
		int x, y;
		do {
			x = random.nextInt(3);
			y = random.nextInt(3);
		}
		while (!isWrongCellValue (x, y));
			field [y][x] = O_SIGN;
	}
	
	boolean winCheck(char dot) {
		for (int i = 0; i < lineLength; i++) {
			if ( ( (field[i][0] == dot) && (field[i][1] == dot) && (field[i][2] == dot) ) ||
	             ( (field[0][i] == dot) && (field[1][i] == dot) && (field[2][i] == dot) ) ) {
				return true;
			}
		}
		if ( ( (field [0][0] == dot) && (field [1][1] == dot) && (field [2][2] == dot) ||
			 ( (field [0][2] == dot) && (field [1][1] == dot) && (field [2][0] == dot) ) ) ) {
				return true;
		}
		return false;
	}
	
	boolean drawCheck() {
		for (int line = 0; line < lineLength; line++) {
			for (int column = 0; column < columnLength; column++)
				if (field[line][column] == EMPTY_SIGN)
					return false;
				}
				return true;
	}
}
