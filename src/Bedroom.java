
public class Bedroom {
	public String name;
	
	//Set the room's name.
	public void setName() {
		name = "Bedroom";
	}

	//Return the room's name.
	public String getName() {
		return "You are in the" + name;
	}

	//Display the text when a player chooses to inspect the room.
	public void inspectRoom() {
		System.out.println("The bedroom smells musty. At the base of the bed is what appears to be a locked chest..");
	}
}
