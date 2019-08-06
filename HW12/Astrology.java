/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class Astrology {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String repeat = "y";
		
		while(repeat.equalsIgnoreCase("y")) {
			System.out.println("What's your sign?");
			System.out.print("Please enter the month of your birth(1-12): ");
			int month = input.nextInt();
			System.out.print("Please enter the day of your birth(1-31): ");
			int day = input.nextInt();
			
			if((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
				System.out.println("Your sign is Aries.");
				
			}else if((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
				System.out.println("Your sign is Taurus.");
				
			}else if((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 21)) {
				System.out.println("Your sign is Gemini.");
				
			}else if((month == 6 && day >= 22 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
				System.out.println("Your sign is Cancer.");
				
			}else if((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
				System.out.println("Your sign is Leo.");
				
			}else if((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
				System.out.println("Your sign is Virgo.");
				
			}else if((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
				System.out.println("Your sign is Libra.");
				
			}else if((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
				System.out.println("Your sign is Scorpio.");
				
			}else if((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
				System.out.println("Your sign is Sagittarius.");
				
			}else if((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
				System.out.println("Your sign is Capricorn.");
				
			}else if((month == 1 && day >= 20 && day <= 31) || (month == 1 && day >= 1 && day <= 18)) {
				System.out.println("Your sign is Aquarius.");
				
			}else if((month == 2 && day >= 19 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) {
				System.out.println("Your sign is Pisces.");
				
			}else{
				System.out.println("Invaild date!");
			}
			System.out.print("Would you like to run this program again? (y/n) ");
			repeat = input.next();
		}	
		System.out.println("Thank you for using this programming!");
		input.close();
	}
}
