package Interactable;
import java.util.Scanner;

public class Keypad implements Interactables {
	
	private int failCount = 0;
	//Inspect text
	public void inspect() {
		System.out.println("The keypad is in pristine condition. It looks like you need four numbers to open it.");
	}

	//Use text
	public void use() {
		Scanner inputCode = new Scanner(System.in);
		System.out.println("Please input the four digit code.");
		
		//If the fail count is under 20, let them enter a number and check it for being the code.
		//Once they hit 20 attempts, it's game over.
		if(failCount < 20) {
			if(inputCode.nextLine().length() == 4 && inputCode.nextLine() == "3284") {
				System.out.println("The keypad light flashes green, and you hear a satisfying click.");
			}
			else {
				System.out.println("The keypad light flashes red, and you hear an ominous buzz.");
				failCount += 1;
			}	
		}
		else {
			System.out.println("The keypad light flashes red, and you hear a robotic voice state: Attempts exceeded, initiate lockdown.");
			System.out.println("Ending 3 of ???: Looks like you aren't leaving after all.");
		}
	}

	//Open text
	public void open() {
		System.out.println("You claw at the keypad to no effect.");
	}
}
