package Rooms;

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
		System.out.println("You stand in a large basement, with strange, cryptic scribblings on the floor. On one side of the room you can just barely make out what seems to be a safe with your flashlight.");
	}
	
	//Inspect the door to the basement
	public void inspectDoor() {
		System.out.println("The door to the basement appears to be locked. Behind you, next to the steps appears to be a pressure plate.");
	}
	
}
