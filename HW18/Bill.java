/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class Bill {
	/**
	 * add tax to update the price of pizza
	 * @param price the price of pizza
	 * @return the price with tax
	 */
	public static double addTax(double price) {
		double price_tax = price * (1 + 0.085); 
		return price_tax;
	}
	
	/**
	 * add tips to update the price of pizza  
	 * @param price the price of pizza include tax
	 * @return the price with both tax and tips
	 */
	public static double calculateTip(double price_tax) {
		double price_tax_tip = price_tax * (1 + 0.15);
		return price_tax_tip;
	}
	
	/**
	 * print out the price in the form of $X.XX 
	 * @param price_tax_tip the price with both tax and tips
	 */
	public static void formatPrice(double price_tax_tip) {
		System.out.printf("\nWith taxes and tip, your total comes to $%.2f", price_tax_tip);
	}
	
	/**
	 * calculate the total price include tax and tips
	 * @param price price the price of pizza
	 */
	public static void calculateBill(double price) {
		double price_tax = addTax(price);
		double price_tax_tip = calculateTip(price_tax);
		formatPrice(price_tax_tip);
	}
	
	public static void main(String[] args) {
		double price;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Mama Domino's Pizzaria!");
		System.out.print("\nEnter the price of the pizza: ");
		price = input.nextDouble();
		calculateBill(price);
		input.close();
	}
}
