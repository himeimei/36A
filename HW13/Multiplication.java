/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***Time to Learn the Times Table!***");
		System.out.print("Enter the size of the times table: ");
		int size = input.nextInt();
		for(int row = 1; row <= 12; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print(col + "*" +row + "=" + col*row + "\t");
			}
			System.out.println();
		}
		input.close();
	} 
}
