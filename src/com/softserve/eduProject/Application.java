package com.softserve.eduProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {

		Application app = new Application();
		Scanner scanInput = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String path = scanInput.nextLine();
		System.out.print("Enter action (Encrypting or Decrypting): ");
		String aciton = scanInput.nextLine();
		System.out.print("Enter encrypting method (Cezar, Vizhener): ");
		String method = scanInput.nextLine();

		
		List<String> textPrimary = new ArrayList<String>();
		List<String> textModified = new ArrayList<String>();
		
		textPrimary = app.textRead(path);

		System.out.println(textPrimary);
	

		if (method.toLowerCase().equals("cezar")) {
			System.out.print("Enter key (positive integer):");
			int n = scanInput.nextInt();
			Caesar  caesar  = new Caesar (n);
			if (aciton.toLowerCase().equals("encrypting")) {
				textModified = textPrimary.stream()
						.map(x -> caesar .encrypt(x))
						.collect(Collectors.toList());
			} else if (aciton.toLowerCase().equals("decrypting")) {
				textModified = textPrimary.stream()
						.map(x -> caesar .decrypt(x))
						.collect(Collectors.toList());
			}
		} else if (method.toLowerCase().equals("vizhener")) {
			System.out.print("Enter key (word)");
			String key = scanInput.nextLine();
			Vizhener vizhener = new Vizhener(key);
			if (aciton.toLowerCase().equals("encrypting")) {
				textModified = textPrimary.stream()
						.map(x -> vizhener.encrypt(x))
						.collect(Collectors.toList());
			} else if (aciton.toLowerCase().equals("decrypting")) {
				textModified = textPrimary.stream()
						.map(x -> vizhener.decrypt(x))
						.collect(Collectors.toList());
			}
		}	
		
		app.textWrite(path, textModified);
		System.out.println(aciton + " was done.");
		scanInput.close();	
		
		}
		
	/**
	 * Returns List of Stings according to text from file
	 * 
	 * @param path
	 *        path of file with text to be encrypted
	 *        
	 * @return List created from file lines
	 * 
	 * @exception FileNotFoundException   if file path is invalid
	 * 
	 * @exception IOException   if it is not possible to read text
	 *            from the file
	 */
	
	public List<String> textRead(String path) {
		List<String> textPrimary = new ArrayList<String>();
		try (BufferedReader brFile = new BufferedReader(new FileReader(path))) {
			String s;
			while ((s = brFile.readLine()) != null) {
				textPrimary.add(s);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File is not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return textPrimary;
	}

	/**
	 * Writes strings from List to file
	 * 
	 * @param path
	 *        path of file where encrypted text should be saved
	 * 
	 * @param textModified
	 *        List of Strings with encrypted text
	 *        
	 * @exception IOException   if file path is invalid or it is not
	 *            possible to write text into the file
	 */
	
	public void textWrite(String path, List<String> textModified) {
		try (BufferedWriter bwFile = new BufferedWriter(new FileWriter(path))) {
			textModified.stream().forEach(s -> {
				try {
					bwFile.write(s);
					bwFile.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (IOException e) {
			System.out.println("File wasn't updated.");
		}
	}
	
	

}
