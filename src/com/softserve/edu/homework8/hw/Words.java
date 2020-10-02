package com.softserve.edu.homework8.hw;

import java.util.Scanner;

public class Words {

	public String input() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a sentence of five words: ");
			String sentence = scan.nextLine();
			return sentence;
		}
	}

	public String getLongest(String sentence) {
		String[] array = sentence.split("\s");
		String longWord = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > longWord.length())
				longWord = array[i];
		}
		return longWord;
	}

	public int countLetters(String longWord) {
		return longWord.length();
	}

	public String reverse(String sentence) {

		String[] array = sentence.split("\s");
		String longWord = array[1];
		StringBuilder sb = new StringBuilder();
		sb.append(longWord);
		sb = sb.reverse();
		return sb.toString();

	}

	public void output() {
		String sentence = input();
		String longWord = getLongest(sentence);
		int number = countLetters(longWord);
		String reverse = reverse(sentence);
		System.out.println("The longest word  is: " + longWord + ";");
		System.out.println("This word contans: " + number + " letters;");
		System.out.println("Second word in reverse order: " + reverse + ";");

	}

	public static void main(String[] args) {

		Words word = new Words();
		word.output();
	}
}