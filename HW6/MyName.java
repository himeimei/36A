/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class MyName {
	public static void main(String[] args) {
		String first_name;
		String last_name;
		String full_name;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! I want to learn your name!");
		
		System.out.print("Please enter your first name: ");
		first_name = input.next();
		
		System.out.print("Please enter your last name: ");
		last_name = input.next();
		
		full_name = first_name + " " +last_name;
		System.out.println("Nice to meet you " + full_name + "!");
		
		input.close();
	}
}
