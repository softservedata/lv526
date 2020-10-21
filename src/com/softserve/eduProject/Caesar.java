package com.softserve.eduProject;

import java.util.stream.Collectors;

public class Caesar {

	protected final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	protected String SMALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private int n;
	
	public Caesar() {}

	public Caesar(int n) {
		if (n >= 0) {
		this.n = n;
		} else {
		throw new CaezarInvalidValueException("Invalid key number");
		}
	}
	
	public String getCapitalLetters() {
		return CAPITAL_LETTERS;
	}

	public String getSmallLetters() {
		return SMALL_LETTERS;
	}
	
	public int getN() {
		return n;
	}

	/**
	 * Returns character encrypted with Caesar cipher
	 * 
	 * @param input 
	 * 		  character to be encrypted
	 * 
	 * @param signs
	 * 	      string with alphabet characters
	 * 
	 * @param n
	 *        positive integer key for encrypting
	 *        
	 * @return encrypted character
	 * 
	 * @exception IndexOutOfBoundsException   if encrypted character index
	 *            is out of bounds of signs String
	 */
	
	public char signEncrypt(char input, String signs, int n) {
		char newSign;
		int key;
		
		if (n >= 26) {
			key = n - ((n/26) * 26);
		} else {
			key = n;
		}
		
		try {
			newSign = signs.charAt(signs.indexOf(input) + key);
		} catch (IndexOutOfBoundsException e) {
			if (signs.indexOf(input) < 0) {
				newSign = '-';
			} else {
				newSign = signs.charAt(key - (signs.length() - signs.indexOf(input)));
			}
		}
		return newSign;
	}
	
	/**
	 * Returns character decrypted with Caesar cipher
	 * 
	 * @param input 
	 * 		  character to be decrypted
	 * 
	 * @param signs
	 * 	      string with alphabet characters
	 * 
	 * @param n
	 *        positive integer key for decrypting
	 *        
	 * @return decrypted character
	 * 
	 * @exception IndexOutOfBoundsException   if decrypted character index
	 *            is out of bounds of signs String
	 */
	
	public char signDecrypt(char input, String signs, int n) {
		char newSign;
		int key;
		
		if (n >= 26) {
			key = n - (n/26 * 26);
		} else {
			key = n;
		}
		
		try {
			newSign = signs.charAt(signs.indexOf(input) - key); 
		} catch (IndexOutOfBoundsException e) {
			newSign = signs.charAt(signs.length() - (key - signs.indexOf(input)));
		}
		return newSign;
	}
	
	/**
	 * Returns new character according to primary character type
	 * 
	 * @param primary
	 *        character to be checked
	 * @param ifSmall
	 *        character to be returned if primary character is small
	 *        
	 * @param ifCapital
	 *        character to be returned if primary character is capital
	 *        
	 * @return character, which replaces primary character according to its type
	 */
	
	public char charTransform(char primary, char ifSmall, char ifCapital) {
		char transformed;
			if (SMALL_LETTERS.contains(String.valueOf(primary))) {
				transformed = ifSmall;
			} else if (CAPITAL_LETTERS.contains(String.valueOf(primary))) {
				transformed = ifCapital;
			} else {
				transformed = primary;
			}
		return transformed;
	}
	
	/**
	 * Returns String encrypted with Caesar cipher
	 * 
	 * @param input
	 *        String to be encrypted
	 *        
	 * @return encrypted String
	 */
	
	public String encrypt(String input) {
		String encrypted;	
		encrypted  = input.chars()
				.mapToObj(c -> (char) c)
				.map(c -> charTransform(c, (signEncrypt(c, SMALL_LETTERS,n)),
						(signEncrypt(c, CAPITAL_LETTERS, n))))
				.map(String::valueOf)
				.collect(Collectors.joining());
		return encrypted;
	}

	/**
	 * Returns String decrypted with Caesar cipher
	 * 
	 * @param input
	 *        String to be decrypted
	 *        
	 * @return decrypted String
	 */
	
	public String decrypt(String input) {
		String decrypted;	
		decrypted  = input.chars()
				.mapToObj(c -> (char) c)
				.map(c -> charTransform(c, (signDecrypt(c, SMALL_LETTERS,n)),
						(signDecrypt(c, CAPITAL_LETTERS, n))))
				.map(String::valueOf)
				.collect(Collectors.joining());
		return decrypted;
	}
}


