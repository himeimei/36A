/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class RPS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play Rock-Paper-Scissors!");
		String repeat = "y";
		int i = 1;
		
		while(repeat.equalsIgnoreCase("y")) {
			System.out.println("Rock-Paper-Scissors Round " + i + " !");
			System.out.print("\nPlayer one, please enter your name: ");
			String player1Name = input.next();
			System.out.print("Player two, please enter your name: ");
			String player2Name = input.next();
			System.out.print(player1Name + " enter \"Rock\", \"Paper\", or \"Scissors\": ");
			String player1Enter = input.next();
			System.out.print(player2Name + " enter \"Rock\", \"Paper\", or \"Scissors\": ");
			String player2Enter = input.next();
			 
			if(player1Enter.equalsIgnoreCase(player2Enter)){
				System.out.println("It's a tie!");	
			}else if(player1Enter.equalsIgnoreCase("rock") && player2Enter.equalsIgnoreCase("paper")) {
				System.out.println("Paper covers rock!");
				System.out.println(player2Name + " wins!");	
			}else if(player1Enter.equalsIgnoreCase("rock") && player2Enter.equalsIgnoreCase("scissors")) {
				System.out.println("Rock breaks scissors!");
				System.out.println(player1Name + " wins!");
			}else if(player1Enter.equalsIgnoreCase("paper") && player2Enter.equalsIgnoreCase("rock")) {
				System.out.println("Paper covers rock!");
				System.out.println(player1Name + " wins!");
			}else if(player1Enter.equalsIgnoreCase("paper") && player2Enter.equalsIgnoreCase("scissors")) {
				System.out.println("Scissors cut paper!");
				System.out.println(player2Name + " wins!");
			}else if(player1Enter.equalsIgnoreCase("scissors") && player2Enter.equalsIgnoreCase("rock")) {
				System.out.println("Rock breaks scissors!");
				System.out.println(player2Name + " wins!");
			}else if(player1Enter.equalsIgnoreCase("scissors") && player2Enter.equalsIgnoreCase("paper")) {
				System.out.println("Scissors cut paper!");
				System.out.println(player1Name + " wins!");
			}else{
				System.out.println("Error: Please  enter \"Rock\", \"Paper\", or \"Scissors\"! ");
				}
			
			i++;
			System.out.print("\nDo you want to play again (y/n): ");
			repeat = input.next();
		}
		
		System.out.println("Thanks for playing!");
		input.close();
	}
}
