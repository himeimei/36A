/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class Pass {
	public static void main(String[] args) {
		System.out.print("Enter your score: ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		if (score >= 60)
			System.out.print("Pass!");
		else
			System.out.print("Fail :(");
		
		input.close();
	}

}
