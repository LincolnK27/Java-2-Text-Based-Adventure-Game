package User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Enum.ActionType;
import Enum.ItemType;
import Enum.RoomType;
import Item.Item;
import Item.Key;
import Item.Tool;

public class InventoryHelper {

	//Variables
	private static ItemType itemType = null;
	private static ActionType actionType = null;
	private static RoomType roomType = null;
	private static Tool flashlight = new Tool();
	private static Tool box = new Tool();
	private static Key goldKey = new Key();
	private static Key rustyKey = new Key();

	//Create the inventory 
	private static List<Item> inventory = new ArrayList<>();


	// Logging Object Instantiated
	final static Logger log = 
			LogManager.getLogger(UserInterp.class.getName());
	public static void sortInventory(List<Item> inventory) {

		//Create a new list to hold the weights, and add all inventory weights to the list
		List<Double> weights = new ArrayList<>();
		for(Item item : inventory) {
			weights.add(item.getWeight());
		}

		//Sort the weights from lowest to highest
		Collections.sort(weights);

		//Print out the inventory items, from lowest to highest weight
		System.out.println("Here is your inventory, sorted by weight.");
		for (Double weight : weights) {
			for (Item item : inventory) {

				//Check that the item in the inventory matches the next weight in the list, and print it once a match is found.
				if(item.getWeight() == weight) {
					System.out.println(item.getName() + " : Weight - " + item.getWeight());
				}
			}
		}
	}

	public static void main(String[] args) {
		//Set the items' weights and names
		flashlight.setWeight(10.0);
		flashlight.setInspect("You hold up the flashlight and shake it lightly. Sounds like there's batteries. You flip it on and off once, and light bounces off the wall.");
		flashlight.setName("Flashlight");
		box.setWeight(30.0);
		box.setInspect("You inspect the box. It seems to be heavy and wooden. Perhaps you should name it.");
		box.setName("Box");
		goldKey.setWeight(3.0);
		goldKey.setInspect("A shimmering golden key. You wonder what it unlocks.");
		goldKey.setName("Golden Key");
		rustyKey.setWeight(5.0);
		rustyKey.setInspect("A heavy key, rusted and old, but just maybe still useful.");
		rustyKey.setName("Rusted Key");

		//Sort the inventory and display the results to the user.
		sortInventory(inventory);
	}

	public void actions() {
		/* When user takes an item */
		try {
			switch(itemType) {
			case BOX:
				switch(actionType) {
				case TAKE:
					inventory.add(box);
					break;
				case USE:
					switch(roomType) {
					case BASEMENT:
						break;
					case BEDROOM:
						break;
					case HALLWAY:
						break;
					case KITCHEN:
						break;
					case STAIRS:
						break;					
					}
					break;
				case INSPECT:
					break;
				}
				break;
			case FLASHLIGHT:
				switch(actionType) {
				case TAKE:
					inventory.add(flashlight);
					break;
				case USE:
					switch(roomType) {
					case BASEMENT:
						break;
					case BEDROOM:
						break;
					case HALLWAY:
						break;
					case KITCHEN:
						break;
					case STAIRS:
						break;
					}
						break;
				case INSPECT:
						break;
					}
					break;
				case GOLDKEY:
					switch(actionType) {
					case TAKE:
						inventory.add(goldKey);
						break;
					case USE:
						switch(roomType) {
						case BASEMENT:
							break;
						case BEDROOM:
							break;
						case HALLWAY:
							break;
						case KITCHEN:
							break;
						case STAIRS:
							break;
						}	
							break;
						case INSPECT:
							break;
						}
						break;
					case RUSTYKEY:
						switch(actionType) {
						case TAKE:
							inventory.add(rustyKey);
							break;
						case USE:
							switch(roomType) {
							case BASEMENT:
								break;
							case BEDROOM:
								break;
							case HALLWAY:
								break;
							case KITCHEN:
								break;
							case STAIRS:
								break;
							}	
								break;
							case INSPECT:
								break;
							}
							break;
						}
					} catch (Exception e) {
						//Display an error and log it in the file.
						log.error("Error Occured: " + e.getMessage());
					}
				}
			}
