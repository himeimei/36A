/**
 * @author Huimei Wu
 * CIS 36A
 *
 */

import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		double GPA;
		int stuNum;
		double attendYears;
		
		System.out.println("Collecting Student Data!");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.print("Please enter your GPA: ");
		Scanner inGPA = new Scanner(System.in);
		GPA = inGPA.nextDouble();
		
		System.out.print("Please enter your student ID number: ");
		Scanner inStuNum = new Scanner(System.in);
		stuNum = inStuNum.nextInt();
		
		System.out.print("Please enter the number of years you have attended De Anza: ");
		Scanner inAttendYears = new Scanner(System.in);
		attendYears = inAttendYears.nextDouble();
		
		System.out.println(" ");
		System.out.println(GPA + " is your GPA.");
		System.out.println("Your student ID number is " + stuNum + ".");
		System.out.println("You have attended De Anza for " + attendYears + " years.");
	
		inGPA.close();
		inStuNum.close();
		inAttendYears.close();
	
	}
}
