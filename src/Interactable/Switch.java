package Interactable;

public class Switch implements Interactables {
	public boolean onOff = false;
	
	//Inspect text
	public void inspect() {
		System.out.println("An unassuming switch.");
	}

	//Use text
	public void use() {
		
		//If switch is off, turn it on, if it's on, turn it off
		if(onOff == false) {
			System.out.println("You hear a whirring and grinding noise as the garbage disposal comes to life. It sounds like something is caught in the disposal.");	

			onOff = true;
		}
		else {
			System.out.println("The whirring and grinding dies down as the garbage disposal stops.");	
			onOff = false;
		}
	}

	//Open text
	public void open() {
		System.out.println("You fail to break the switch from the wall. I'm not sure why you'd try.");
	}
}
