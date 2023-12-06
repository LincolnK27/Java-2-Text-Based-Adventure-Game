package User;


public class Character {
	
	//A private string only accessible to the class.
	private String name;
	
	//Set the name of the character.
	public void setName() {
		
		//Set the name
		name = "Alex";
	}
	
	//Get the name of the character.
	public String getName() {
		
		//Return the character's name.
		return name;
	}
	
	/*
	Thoughts:
	I think this would probably perform well. Overall, this would prevent multiple inventories accidentally being created, and is an easy way to add or remove items from the inventory as the user interacts with the game itself. Certainly, it cuts down on the code and checks that might otherwise be needed to avoid duplicate instances in a user's game.
	If nothing else, I can certainly see the value and convenience (as well as the general improvement) of this pattern. I think it will be useful overall in the final project to have aspects used in this way.
	*/
	//A singleton class to manage inventory
	public static class Inventory {

		//Class variables
		private int quantity = 0;
		private final int capacity = 5;
		private Inventory() {};
		
		//Create the instance of the Inventory
		private static final Inventory instance = new Inventory();
		
		//Get the instance
		public static Inventory getInstance() { return instance;}
		
		//Add and item to the inventory
		public synchronized void addItem() {
			//If the quantity is less than capacity, add the item to the inventory.
			if(quantity < capacity) {
				quantity += 1;
				System.out.println("You put the item in your pocket.");	
			}
			else {
				System.out.println("Your pockets are already full. You set the item back where you found it.");
			}
		}
		
		//Remove an item from the inventory
		public synchronized void removeItem() {
			//If the quantity is greater than zero, remove the item from inventory.
			if(quantity > 0) {
				quantity -= 1;
				System.out.println("You remove the item from your pockets and set it down.");
			}
			else {
				System.out.println("You reach into your pockets and find nothing.");
			}
		}
		
		//Get the inventory
		public synchronized int getInventory() {
			return quantity;
		}
	}

}
