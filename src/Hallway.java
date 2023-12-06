import java.util.Scanner;

public class Hallway {

	public String name;
	
	//Set the room's name.
	public void setName() {
		name = "Hallway";
	}

	//Return the room's name.
	public String getName() {
		return "You are in the" + name;
	}

	//Display the text when a player chooses to inspect the room.
	public void inspectRoom() {
		System.out.println("You are located in a dimly lit hallway. The front door contains both a lock and a keypad. The door appears to be locked. You can see three different doorways on the opposite side of the doorway. One appears to lead to a kitchen, the second to a bedroom, and the third towards a set of steps and what is presumably, a basement.");
	}
	
	//A method run when the user elects to move to the basement and doesn't have the flashlight in order to warn them.
	public void noFlashlight() {
		Scanner noLight = new Scanner(System.in);
		System.out.println("You peer down the steps, unable to see past the first step. It seems dangerous to try and navigate down toe the basement in the dark.");
		
		if(noLight.nextLine() == "Yes" || noLight.nextLine() == "yes" ) {
			//Trigger death ending.
			System.out.println("You take a deep breath and start down the steps.");
			System.out.println("One step, two step, four step, ten step. CRASH!");
			System.out.println("Blearily, you blink up at the rectangle of light swimming up in your hazy vision, but after a moment it all goes dark.");
			System.out.println("ENDING 1 of ??: What did you think would happen?");
		}
		else {
			//User turns around
			System.out.println("You turn back to the hallway rather than risk going down the steps.");
		}
		
	}

}
