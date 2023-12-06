package Rooms;
import java.time.LocalTime;
import java.util.Locale;

//A test class to test the stair description
public class StairTest {

	//Create a stairs instance, and set the name and description, then get the description
	//Description is based on the paramaters of the user's current time and locale
	public static void main(String[] args) {
		
		Stairs stairs = new Stairs();
		
		stairs.setName();
		stairs.getName();
		Locale us = new Locale("en", "US");
		Locale china = new Locale("zh", "CN");
		
		//Get chinese description with current time
		stairs.setInspect(LocalTime.now(), china);
		stairs.getDesc();
		
		//Get english description with set time of 1 minute after midnight
		stairs.setInspect(LocalTime.parse("00:01"), us);
		stairs.getDesc();
	}

}
