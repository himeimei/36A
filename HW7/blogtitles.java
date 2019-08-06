/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */

package blogtitles;
import java.util.Scanner;

public class blogtitles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a single-word topics: ");
		String topic = input.next();
		
		System.out.print("Enter an integer number between 3 and 20: ");
		int number = input.nextInt();
		
		System.out.println("\nSuggested bolg titles: ");
		System.out.println(number + " Secrets That Experts Of " + topic + " Want You To Know! ");
		System.out.println(number + " Reasons " + topic + " Will Change The Way You Think About Everything!");
		System.out.println("You Will Never Believe This Awesome Truth Behind " + topic);
		System.out.println("Here's What No One Tells You About " + topic);
		System.out.println(number + " Ways " + topic + " Can Help You Live To 100! ");
		
		input.close();
	}

}
