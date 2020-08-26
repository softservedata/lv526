package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1{

	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		int r = Integer.parseInt(s);
		
		System.out.println("P = " + 2*Math.PI*r);
	}
}