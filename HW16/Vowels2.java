/**
 * 
 * @author himeimei
 * CIS 36A
 */

import java.util.Scanner;
public class Vowels2 {
	/**
	 * Count how many vowels in a sentence.
	 * @param s the sentence need be count
	 * @return the number of vowels in the sentence
	 */
	public static int countVowels(String s){
		int count = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || 
				   s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
				   s.charAt(i) == 'u') 
						count++;
			}
		return count;
	}
	public static void main(String[] args) {
		String sentence = "";
		int numVowels;
		Scanner input = new Scanner(System.in);
		
		while(!sentence.equalsIgnoreCase("q") && !sentence.equalsIgnoreCase("quit")) {
			System.out.print("Enter a sentence or q to quit: ");
				sentence = input.nextLine();
				sentence = sentence.toLowerCase();
				
				if(!sentence.equalsIgnoreCase("q") && !sentence.equalsIgnoreCase("quit"))
				{
					numVowels = countVowels(sentence);
					System.out.println("\nThere are " + numVowels + " vowels in your sentence.\n");
				}
		}
		System.out.println("\nGoodbye!");
		input.close();
	}
}
