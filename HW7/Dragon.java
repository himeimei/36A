/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class Dragon {
	public static void main(String[] args) {
		String firstName,
			   lastName,
			   motherName,
			   fatherName,
			   dragonName;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Want to learn your \"dragon name?\"\n");
		
		System.out.print("Please enter your first and last name: ");
		firstName = input.next();
		lastName = input.next();
		
		System.out.print("Please enter your mother's first name: ");
		motherName = input.next();
		
		System.out.print("Please enter your father's first name: ");
		fatherName = input.next();
		
		dragonName = "" + lastName.charAt(0) + lastName.charAt(1) 
					    + firstName.charAt(firstName.length()-2) + firstName.charAt(firstName.length()-1)
					    + motherName.charAt(0) + motherName.charAt(1)
					    + fatherName.charAt(fatherName.length() - 1);
		
		
		System.out.println("Your \"dragon name\" is: " + "\"" + dragonName.toUpperCase() + "\"");
		
	}

}
