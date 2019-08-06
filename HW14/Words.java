/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class Words {
	public static void main(String[] args) {
		String sentence;
		int numWords = 1;
		int start_index = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence and I will count the number of words.");
		System.out.print("Please enter your sentence: ");
		sentence = input.nextLine();
		System.out.println("\nThe words in your sentence are: ");
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				System.out.println(sentence.substring(start_index, i));
				start_index = i + 1;
				numWords++;
			}
		}
		System.out.println(sentence.substring(start_index,sentence.length()));
		System.out.println("There are " + numWords + " words in \"" + sentence + "\"");
		input.close();
	}
}
