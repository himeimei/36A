/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
import java.util.Scanner;
public class Planet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double MERCURY_MULT = 0.38;
		final double VENUS_MULT = 0.91;
		final double MARS_MULT = 0.38;
		final double JUPITER_MULT = 2.54;
		final double SATURN_MULT = 1.08;
		final double URANUS_MULT = 0.91;
		final double NEPTURNE_MULT = 1.19;
		final double PLUTO_NULT = 0.06;
		
		System.out.println("Welcome! ");
		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Now, select from one of the following planets: ");
		System.out.println("\tMercury");
		System.out.println("\tVenus");
		System.out.println("\tMars");
		System.out.println("\tJupiter");
		System.out.println("\tSaturn");
		System.out.println("\tUranus");
		System.out.println("\tNeptune");
		System.out.println("\tPluto");
		
		System.out.print("Please enter the planet: ");
		String planet = input.next();
		planet = planet.toLowerCase();
		
		switch (planet) {
			case "mercury":
				System.out.printf("You weigh %.1f %s", weight * MERCURY_MULT,"lbs on Mercury");
				break;	
			case "venus":
				System.out.printf("You weigh %.1f", weight * VENUS_MULT,"lbs on Venus");
				break;
			case "mars":
				System.out.printf("You weigh %.1f", weight * MARS_MULT,"lbs on Mars");
				break;
			case "jupiter":
				System.out.printf("You weigh %.1f", weight * JUPITER_MULT,"lbs on Jupiter");
				break;
			case "saturn":
				System.out.printf("You weigh %.1f", weight * SATURN_MULT,"lbs on Saturn");
				break;
			case "uranus":
				System.out.printf("You weigh %.1f", weight * URANUS_MULT,"lbs on Uranus");
				break;
			case "neptune":
				System.out.printf("You weigh %.1f", weight * NEPTURNE_MULT,"lbs on neptune");
				break;
			case "pluto":
				System.out.printf("You weigh %.1f", weight * PLUTO_NULT,"lbs on Pluto");
				break;
			default:
				System.out.println("You entered an invalid planet name. \nPlease rerun the program to try again.");	
		}
		input.close();		
	}
}
