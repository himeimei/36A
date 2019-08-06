/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.io.*;
import java.util.Scanner;
public class Animals {
	public static void main(String[] args) throws IOException{
		File in = new File("infile.txt");
		File out = new File("outfile.txt");
		Scanner input = new Scanner(in);
		PrintWriter output = new PrintWriter(out);
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		int fourth = input.nextInt();
		int fifth = input.nextInt();
		
		output.println("Animals at our farm");
		output.println(first + " chickens");
		output.println(second + " cows");
		output.println(third + " ducks");
		output.println(fourth + " horses");
		output.println(fifth + " pigs");
		
		input.close();
		output.close();	
	}
}
