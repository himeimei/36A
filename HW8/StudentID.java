/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class StudentID {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your 8 digit student ID number: ");
		String studentID = input.next();
		
		if(studentID.length() == 8)
			System.out.println("You entered: " + studentID.charAt(0) 
			+ studentID.charAt(1) + studentID.charAt(2) + "-" + studentID.charAt(3) 
			+ studentID.charAt(4) + studentID.charAt(5) + "-" + studentID.charAt(6) 
			+ studentID.charAt(7)) ;
		else
		System.out.print("Sorry! That ID is invalid.\nPlease run the program again.");
		
		input.close();
	}

}
