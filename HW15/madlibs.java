/*
 * @author Huimei Wu 
 * CIS 36A
 */
package madlibs;

import java.util.Scanner;
public class madlibs {
	public static void main(String[] args) {
		String manName;
		String womanName;
		String adjective1;
		String adjective2;
		String color;
		int number;
		String holiday;
		String noun;
		String animal;
		String bodyPart;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Madlibs!");
		
		System.out.print("Enter a man's name: ");
		manName = input.next();
		System.out.print("Enter a woman's name: ");
		womanName = input.next();
		System.out.print("Enter an adjective: ");
		adjective1 = input.next();
		System.out.print("Enter another adjective: ");
		adjective2 = input.next();
		System.out.print("Enter a color: ");
		color = input.next();
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		System.out.print("Enter a holiday: ");
		input.nextLine();
		holiday = input.nextLine();
		System.out.print("Enter a noun: ");
		noun = input.next();
		System.out.print("Enter an animal: ");
		animal = input.next();
		System.out.print("Enter a body part: ");
		bodyPart = input.next();
		
		System.out.println("The Haunted Tower");
		System.out.println("One afternoon " + manName + " and " + womanName + "were walking down a(n) "
						 + adjective1 +" trail, looking for kindling for their campfire. The trees were "
						 + adjective2 +" and "+ color +" , and there were colorful wildflowers all around."
						 + manName + " and " + womanName + " began to pick the wildflowers, and after "
						 +  number + " hours, they went so far that they had wandered away from the trail.\n");
						 
		System.out.println("It started to get dark. " + manName + " began to get worried, but " + womanName 
						 +" seemed excited to have an adventure. 'Look! '" + womanName 
						 + "said. 'Do you see that tower? It looks like a " + noun + "!'\n");
		
		System.out.println("'We're saved!' cried " + manName  + ", who was relieved.\n");
		
		System.out.println("Once they got closer, " + manName + " felt very uneasy again."
						 + "It didn't look like the cozy little cottage " + manName + " had been imagining, "
						 + "but rather a big, spooky tower! It was about 14 feet tall, and it was covered "
						 + "with green ivy and moss. It was the creepiest thing " + manName + " had ever seen!\n");
						 
		System.out.println(manName + " said, '" + womanName+ "," + " let's keep walking! There's no way I'm going"
						 + " into that tower! It looks haunted!'\n");
		System.out.println("'Don't be such a(n) " +animal + "! We're going in. I think it looks safe to me!' said " 
						 + womanName + ".\n");
		System.out.println(manName + " was so scared. He felt his " + bodyPart + " chatter as " + womanName 
						 + " opened the door. All of a sudden, " + manName + " felt that he was not alone. "
						 + "He opened his eyes, prepared to see the worst. But instead, he saw all his friends "
						 + "and family inside the haunted tower! " + " 'Surprise! Happy " +holiday + ", " 
						 + manName + "!' they all cried.");
	}

}
