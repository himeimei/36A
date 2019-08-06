/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class Long {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String firstName = input.next();
		
		if(firstName.length() > 6)
			System.out.println(firstName + " is a long name!");
		else
			System.out.println(firstName + " is not a long name!");
		
		input.close();
	}
}
