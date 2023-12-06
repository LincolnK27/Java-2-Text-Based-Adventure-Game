package Interactable;

public class PressurePlate implements Interactables {
	//Inspect text
	public void inspect() {

		System.out.println("A pressure plate. What is it's purpose?");
	}

	//Use text
	public void use() {
		System.out.println("You stand on the pressure plate, and hear the basement lock unlatch. You can hear the lock re-engage the moment you step off the pressure plate.");
	}

	//Open text
	public void open() {
		System.out.println("You pry at the pressure plate. It doesn't do much.");
	}
}
