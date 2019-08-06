/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
public class Hickory {
	public static void main(String[] args) {
		int number = 1;
		while (number <= 150) {
			if(number % 3 == 0 && number % 5 == 0) {
				System.out.println("Dock! The Mouse Ran Up the Clock!");
			}else if(number % 3 == 0) {
				System.out.println("Hickory!");
			}else if(number % 5 == 0) {
				System.out.println("Dickory!");
			}else {
				System.out.println(number);
			}	
			number++;
		}
	}
}
