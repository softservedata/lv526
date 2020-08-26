package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2{

	public static void main (String[] args) throws IOException{
		System.out.println("Enter your name and address: ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String address = read.readLine();
		
		System.out.println(" - What is your name?");
		System.out.println(" - My name is " + name);
		System.out.println(" - Where do you live, " + name + "?");			
		System.out.println(" - I'm from " + address);
	}
}