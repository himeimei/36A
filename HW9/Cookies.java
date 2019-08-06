/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class Cookies{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double price_mocha = 1.95;
		final double price_cocoa = 2.15;
		final double price_coffee_chai = 2.05;
		final double price_cho_cho_chip = 1.85;
		
		System.out.println("Welcome to Java Cookies!\nAllow me to assist you with your order.");
		
		System.out.println("\nWe sell the following flavors:");
		System.out.println("Mocha Cookies -- $" + price_mocha + " each");
		System.out.println("Cocoa Cookies -- $" + price_cocoa  + " each");
		System.out.println("Coffee Chai Cookies -- $" + price_coffee_chai + " each");
		System.out.println("C++ Cookies (Chocolate Chocolate Chip with Macadamia) -- $"
							+ price_cho_cho_chip + " each");
		
		System.out.print("\nPlease enter the number of mocha cookies: ");
		int num_mocha = input.nextInt();
		System.out.print("Please enter the number of cocoa cookies: ");
		int num_cocoa = input.nextInt();
		System.out.print("Please enter the number of coffee chai cookies: ");
		int num_coffee_chai = input.nextInt();
		System.out.print("Please enter the number of c++ cookies: ");
		int num_cho_cho_chip = input.nextInt();
		
		System.out.println("\nYou Ordered the Following:");
		
		System.out.println("Mocha Cookies: " + num_mocha + " @ $" + price_mocha 
							+" each... \t\t\t" + "$" +num_mocha * price_mocha);
		
		System.out.println("Cocoa Cookies: " + num_cocoa + " @ $" + price_cocoa 
							+ " each... \t\t\t" + "$" + num_cocoa * price_cocoa);
		
		System.out.println("Coffee Chai Cookies: " +  num_coffee_chai +   " @ $" + price_coffee_chai 
							+ " each... \t\t\t" + "$" + num_coffee_chai * price_coffee_chai);
	
		System.out.println("C++ Cookies: " +  num_cho_cho_chip +  " @ $" + price_cho_cho_chip
							+ " each... \t\t\t\t" + "$" +  num_cho_cho_chip * price_cho_cho_chip);
		
		System.out.printf("\nTotal: \t\t\t\t\t\t\t$" +"%.2f", (num_mocha * price_mocha + num_cocoa * price_cocoa 
							+ num_coffee_chai * price_coffee_chai + num_cho_cho_chip * price_cho_cho_chip));
		
		System.out.println("\n\nThank you for your order! Please come again!");
		
		input.close();	
	}
}
