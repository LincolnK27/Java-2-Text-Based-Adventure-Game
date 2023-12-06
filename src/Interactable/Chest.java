package Interactable;
public class Chest implements Interactables {
	//Inspect text
	public void inspect() {
		System.out.println("An old wooden chest with a key hole. The chest is locked, but maybe you can find the key?");
	}

	//Use text
	public void use() {
		System.out.println("You stand on the chest. You feel taller, but that's about it. You get off the chest.");
	}

	//Open text
	public void open() {
		System.out.println("You try to rip open the chest. You even take random items in the room and try to force it. It doesn't work. And now you're just tired.");
	}
}
