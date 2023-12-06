
public class Kitchen {
	public String name;
	
	//Set the room's name.
	public void setName() {
		name = "Kitchen";
	}

	//Return the room's name.
	public String getName() {
		return "You are in the" + name;
	}

	//Display the text when a player chooses to inspect the room.
	public void inspectRoom() {
		System.out.println("A light swings idly above your head. It almost looks like any other kitchen, with a sink on one side, a switch next to the sink, and a strange lever on the wall.");
	}
}
