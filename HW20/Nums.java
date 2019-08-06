/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class Nums {
	public static void main(String[] args) {
		int count = 1;
		double number;
		double sum = 0;
		double product = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of numbers: ");
		int size = input.nextInt();
		
		System.out.println("Enter 4 numbers: \n");
		for(int i = 0; i < size; i++) {
			System.out.print("Number " + count +": ");
			number = input.nextDouble();
			count++;
			sum += number;
			product *=number;
		}
		System.out.printf("\nThe sum of the numbers is: %.1f", sum);
		System.out.printf("\nAnd the product is: %.1f", product);
		input.close();
	}
}
