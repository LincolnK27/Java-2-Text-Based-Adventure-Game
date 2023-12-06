package Interactable;
import java.time.LocalTime;

public class Lever implements Interactables {
	
	//Variables
	private boolean levOnOff = false;
	private int time = 1;
	private LocalTime currentTime = LocalTime.now();
	private LocalTime hoursLater = currentTime;
	
	//Inspect text
	public void inspect() {
		System.out.println("A simple lever.");
	}

	//Use text
	public void use() {
		//The first time the lever is flipped, drop the box. Otherwise nothing will happen.
		if(levOnOff == false && time == 1) {
			System.out.println("You hear the whirring of gears and suddenly a box drops on the floor next to you with a dull thud. Where did that come from?");	
			
			levOnOff = true;
			time = 2;
		}
		else {
			System.out.println("You flip the lever again, and hear the whirring of gears, but nothing happens.");
			levOnOff = false;
		}
	}

	//Open text
	public void open() {
		hoursLater = hoursLater.plusHours(2);
		System.out.println("You accidentally pry the lever from the wall. After staring at in shock, you spend a concerning amount of time getting it back in place.");
		System.out.println("You glance at a clock on the wall after reattaching the lever and realize it's now " + hoursLater);
	}
}
