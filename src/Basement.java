
public class Basement {
	public String name;
	
	//Set the room's name.
	public void setName() {
		name = "Basement";
	}

	//Return the room's name.
	public String getName() {
		return "You are in the" + name;
	}

	//Display the text when a player chooses to inspect the room.
	public void inspectRoom() {
		System.out.println("You are located in a dimly lit hallway. The front door contains both a lock and a keypad. The door appears to be locked. You can see three different doorways on the opposite side of the doorway. One appears to lead to a kitchen, the second to a bedroom, and the third towards a set of steps and what is presumably, a basement.");
	}
	
}
