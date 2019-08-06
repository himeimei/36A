/**
 * 
 * @author Huimei Wu
 *
 */
		
import java.util.Scanner;

public class LoopChars {

    public static void main(String[] args) {
        int n; // the integer number
        String ch; // the single character
        Scanner input = new Scanner(System.in);
        System.out.println("** Loopy Characters!**\n");
        System.out.print("Enter an integer between 1 and 20: ");
        while(!input.hasNextInt()) {
        		System.out.println("\nPlease enter number not characters.");
        		input.nextLine();
        		System.out.print("\nEnter an integer between 1 and 20: ");
        }
        n = input.nextInt();

        //Put your code here to test for input mismatch exception (String entered, not number)

        System.out.print("\nEnter a single character: ");
        ch = input.next();
        System.out.println();
      
        // Repeating the char n times with a for-loop.
        System.out.println("#1. Printing " + ch + " " + n + " times:");
        // Put your code here
        for(int i = 0; i < n; i++) {
    			System.out.print(ch);
        }
        System.out.println("\n");

        // Repeating the char n times with stars on odd indexes.
        System.out.println("#2. Printing " + ch + " character " + n + " times substituting '*' on odd indexes:");
        // Put your code here
        for(int i = 0; i < n; i++) {
        		if(i % 2 == 0)
        			System.out.print(ch);
        		else
        			System.out.print("*");
        }
        System.out.println("\n");

        // Repeating the character n times with tick marks (+) every 5 chars
        System.out.println("#3. Printing " + ch + " character " + n + " times substituting (+) every fifth character:");
        // Put your code here
        for(int i = 0; i < n; i++) {
    			if((i + 1) % 5 == 0)
    				System.out.print("+");
    			else
    				System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("#4. Printing " + n + " lines of the previous loop:");
        // Hint: put your for-loop from the previous challenge inside another
        // for-loop that has a different counting variable.
        // Put your code here
        for(int j = 0; j < n; j++) {
        		for(int i = 0; i < n; i++) {
        			if((i + 1) % 5 == 0)
        				System.out.print("+");
        			else
        				System.out.print(ch);
        		}
        		System.out.println("");
        }
       input.close();
    }
}