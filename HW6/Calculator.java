/**
 *
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: " );
		double number = input.nextDouble();
		
		System.out.print("The square of " + number + " is: " + Math.pow(number, 2) + "\n");
		System.out.print("The cube of " + number + " is: " + Math.pow(number, 3) + "\n");
		System.out.print("The quartic (fourth power) of " + number + " is: " + Math.pow(number, 4) + "\n");
		System.out.print("The ceiling of " + number + " is: " + Math.ceil(number) + "\n");
		System.out.print("The floor of " + number + " is: " + Math.floor(number) + "\n");
		System.out.print("The square root of " + number + " is: " + Math.sqrt(number) + "\n");
	
		input.close();
	}	
}