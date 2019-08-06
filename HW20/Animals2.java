/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
public class Animals2 {
	public static void printArray(String animals[], int number_animals[]) {
		for(int i = 0; i < animals.length; i++ )
			System.out.println(number_animals[i] + " " +animals[i]);
	}
	public static void main(String[] args) {
		String animals[] = {"sheep", "donkeys", "goats", "geese", "cats"};
		int number_animals [] = {5,3,8,2,4};
		
		System.out.println("Other animals at our farm:");
		printArray(animals, number_animals);
	}
}
