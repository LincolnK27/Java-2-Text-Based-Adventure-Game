package Interactable;

public class Sink implements Interactables {
	//Inspect text
	public void inspect() {
		System.out.println("A sink. There's something glittering in the drain.");
	}

	//Use text
	public void use() {
		System.out.println("You turn on the sink.");
	}
	
	//Use text overloaded
	public void use(String onOff) {
		
		//Check if the switch in the kitchen is flipped on
		if(onOff == "off") {
			System.out.println("You put your hand in the sink and ruffle around. You pull out an old, rusted looking key.");	
		}
		else {
			System.out.println("You put your hand in the sink, and have exactly .2 seconds to consider the ominous whirring noise before you feel your hand shredded in the garbage disposal. Despite your screams, no one comes to save you.");
			System.out.println("Ending 2 of ??: Maybe don't stick your hand in running garbage disposals?");
		}
	}

	//Open text
	public void open() {
		System.out.println("You open the cabinet under the sink. There's nothing of note here.");
	}
}
