package Rooms;

public interface Room {

	//Set the room's name.
	public void setName() throws Exception;

	//Return the room's name.
	public void getName() throws Exception;

	//Display the text when a player chooses to inspect the room.
	public void inspectRoom() throws Exception;

}
