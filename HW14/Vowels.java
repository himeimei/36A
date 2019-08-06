/**
 * 
 * @author Huimei Wu
 * CIS 36A
 *
 */
import java.util.Scanner;
public class Vowels {
	public static void main(String[] args) {
		String sentence;
		int counter;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! Give me a sentence and I will count its vowels.");
		do{	
			counter = 0;
			System.out.print("\nPlease enter a sentence or q to quit: ");
			sentence = input.nextLine();
		
			sentence = sentence.toLowerCase();
			
			if (!sentence.equalsIgnoreCase("q")) {
				for(int i = 0; i < sentence.length(); i++) {
					if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || 
					   sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' ||
					   sentence.charAt(i) == 'u') {
							counter++;
					}
				}
				System.out.println("There are " + counter + " vowels in your sentence.");
			}
		}while(!sentence.equalsIgnoreCase("q"));
		System.out.println("Goodbye!");
		input.close();
	}
}
