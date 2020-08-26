package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3{
	
	public static void main (String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String s1 = reader.readLine();
	int c1 = Integer.parseInt(s1);
	String s2 = reader.readLine();
	int c2 = Integer.parseInt(s2);
	String s3 = reader.readLine();
	int c3 = Integer.parseInt(s3);
	String s4 = reader.readLine();
	int t1 = Integer.parseInt(s4);
	String s5 = reader.readLine();
	int t2 = Integer.parseInt(s5);
	String s6 = reader.readLine();
	int t3 = Integer.parseInt(s6);
	
	int total = (c1*t1)+(c2*t2)+(c3*t3);
	
	System.out.println("Call from first country: " + c1*t1);
	System.out.println("Call from second country: " + c2*t2);
	System.out.println("Call from third country: " + c3*t3);
	System.out.println("Total cost: " + total);
	
	}
}