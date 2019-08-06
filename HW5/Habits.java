/**
 * @author Huimei Wu
 * CIS 36A
 *
 */

import java.util.Scanner;
public class Habits{
	public static void main(String[] args) {
		int age;
		double dailyCost;
			
		System.out.print("Current age (years): ");
		Scanner inAge = new Scanner(System.in);
		age = inAge.nextInt();
		
		System.out.print("Cost of daily habit: ");
		Scanner inDailyCost = new Scanner(System.in);
		dailyCost = inDailyCost.nextDouble();
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("This year your habit will cost you $" + dailyCost * 365);
		System.out.println("Between now and age 75, it will cost you $" + dailyCost * 365 * (75 - age) + "!");
		System.out.println("Cost in millions of dollars is " + dailyCost * 365 * (75 - age) / 1000000 + "!");
		
		inAge.close();
		inDailyCost.close();
	}
}
		