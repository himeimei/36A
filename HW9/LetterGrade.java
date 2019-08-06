/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class LetterGrade{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String letterGrade = input.next();
		if(letterGrade.equalsIgnoreCase("A") || letterGrade.equalsIgnoreCase("A+")) {
			System.out.print("The numeric value is 4.00");
		}else if(letterGrade.equalsIgnoreCase("A-")) {
			System.out.print("The numeric value is 3.67");
		}else if(letterGrade.equalsIgnoreCase("B+")) {
			System.out.print("The numeric value is 3.33");
		}else if(letterGrade.equalsIgnoreCase("B")) {
			System.out.print("The numeric value is 3.00");
		}else if(letterGrade.equalsIgnoreCase("B-")) {
			System.out.print("The numeric value is 2.67");
		}else if(letterGrade.equalsIgnoreCase("C+")) {
			System.out.print("The numeric value is 2.33");
		}else if(letterGrade.equalsIgnoreCase("C")) {
			System.out.print("The numeric value is 2.00");
		}else if(letterGrade.equalsIgnoreCase("C-")) {
			System.out.print("The numeric value is 1.67");
		}else if(letterGrade.equalsIgnoreCase("D+")) {
			System.out.print("The numeric value is 1.00");
		}else if(letterGrade.equalsIgnoreCase("D")) {
			System.out.print("The numeric value is 0.67");
		}else{
			System.out.print("The numeric value is 0.00");
		}	
		input.close();
	}
}
