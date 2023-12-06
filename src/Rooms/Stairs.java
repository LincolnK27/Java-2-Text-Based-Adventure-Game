package Rooms;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import User.UserInterp;

//The stairs 'room'
public class Stairs implements Room {

	//Variables
	public String name;
	public String desc;

	// Logging Object Instantiated
		final static Logger log = 
				LogManager.getLogger(UserInterp.class.getName());

	
	//Set the room's name.
	public void setName() {
		name = "Stairs";
	}

	//Return the room's name.
	public void getName() {
		System.out.println("You are on the " + name);
	}

	//Display the text when a player chooses to inspect the room.
	public void inspectRoom() {
		//Print the proper inspection of the stairs
		System.out.println(desc);
	}

	
	//Set the description based on the time and locale
	public void setInspect(LocalTime time, Locale locale) {
		//Create resource bundle variable
		ResourceBundle rb = ResourceBundle.getBundle("Stairs", locale);
		
		//Set description to appropriate language string based on the time and locale
		if(time.isAfter(LocalTime.parse("00:00")) && time.isBefore(LocalTime.parse("06:00"))) {
			desc = rb.getString("earlyMorn");
		}
		else if(time.isAfter(LocalTime.parse("06:01")) && time.isBefore(LocalTime.parse("11:59"))) {
			desc = rb.getString("morn");
		}
		else if(time.isAfter(LocalTime.parse("12:00")) && time.isBefore(LocalTime.parse("12:59"))) {
			desc = rb.getString("noon");
		}
		else if(time.isAfter(LocalTime.parse("13:00")) && time.isBefore(LocalTime.parse("20:59"))) {
			desc = rb.getString("afternoon");
		}
		else {
			desc = rb.getString("evening");
		}
	}
	
	//Get the description
	public void getDesc() { 
		System.out.println(desc);
	}
	
	//A method run when the user elects to move down the stairs and doesn't have the flashlight in order to warn them.
		public void noFlashlight() {
			//Try to make a new scanner, then continue
			try (Scanner noLight = new Scanner(System.in)) {
				System.out.println("You peer down the steps, unable to see past the first step. It seems dangerous to try and navigate down toe the basement in the dark.");

				if(noLight.nextLine() == "Yes" || noLight.nextLine() == "yes" ) {
					//Trigger death ending.
					System.out.println("You take a deep breath and start down the steps.");
					System.out.println("One step, two step, four step, ten step. CRASH!");
					System.out.println("Blearily, you blink up at the rectangle of light swimming up in your hazy vision, but after a moment it all goes dark.");
					System.out.println("ENDING 1 of ??: What did you think would happen?");
				}
				else {
					//User turns around
					System.out.println("You turn back to the hallway rather than risk going down the steps.");
				}
			}
			catch (Exception e) {
				//Display an error and log it in the file.
				log.error("Error Occured: " + e.getMessage());
			}

		}
}
