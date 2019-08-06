/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class MonthDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("I will print the number of days in a month. ");
		System.out.print("Enter the month (1-12):");
		String month = input.next();
		
		if(month.equalsIgnoreCase("February")) {
			System.out.println("28 or 29 days ");
		}else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") 
				|| month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November")) {
			System.out.println("30 days ");	
		}else {
			System.out.println("31 days ");
		}
		input.close();
	}	
}
