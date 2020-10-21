package com.softserve.eduProject;

import java.util.ArrayList;
import java.util.List;

public class Vizhener extends Caesar {

	private String key;
	
	public Vizhener(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
	/**
	 * Returns List with sequence numbers for signs of input String
	 * 
	 * @param key
	 *        String to be used for encrypting
	 *        
	 * @return List of integers
	 */
	
	public List<Integer> keyWord(String key) {
		List<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < key.length(); i++) {
			ints.add(SMALL_LETTERS.indexOf(key.toLowerCase().charAt(i)));
		}
		return ints;
	}

	/**
	 * Returns List of Strings created from primary string according to 
	 * quantity of signs in inputed key word
	 * 
	 * @param key
	 *        String to be used for encrypting
	 * 
	 * @param input
	 *        String to be encrypted
	 *        
	 * @return List of Strings created from inputed String
	 */
	
	public List<String> group(String key, String input) {

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < input.length(); i += key.length()) {
			try {
				list.add(input.substring(i, i + key.length()));
			} catch (IndexOutOfBoundsException e) {
				list.add(input.substring(i));
			}
		}
		return list;
	}

	/**
	 * Returns String encrypted with Vizhener cipher
	 * 
	 * @param input
	 *        String to be encrypted
	 *        
	 * @return encrypted String
	 */
	
	@Override
	public String encrypt(String input) {
		List<Integer> ints = keyWord(key);
		List<String> list = group(key, input);
		StringBuilder encrypted = new StringBuilder();
		for (String element : list) {
			for (int i = 0; i < element.length(); i++) {
				encrypted = encrypted.append(charTransform(element.charAt(i), 
						signEncrypt(element.charAt(i), SMALL_LETTERS, ints.get(i)), 
						signEncrypt(element.charAt(i), CAPITAL_LETTERS, ints.get(i))));
			}
		}
		return encrypted.toString();
	}
	
	/**
	 * Returns String decrypted with Vizhener cipher
	 * 
	 * @param input
	 *        String to be decrypted
	 *        
	 * @return decrypted String
	 */
	
	@Override
	public String decrypt(String input) {

		List<Integer> ints = keyWord(key);
		List<String> list = group(key, input);
		StringBuilder decrypted = new StringBuilder();
		for (String element : list) {
			for (int i = 0; i < element.length(); i++) {
				decrypted = decrypted.append(charTransform(element.charAt(i), 
						signDecrypt(element.charAt(i), SMALL_LETTERS, ints.get(i)), 
						signDecrypt(element.charAt(i), CAPITAL_LETTERS, ints.get(i))));
			}
		}
		return decrypted.toString();
	}
	
}
