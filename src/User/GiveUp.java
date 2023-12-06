//This is an abstract class with a method allowing the user to give up.
//If a character finds the game too hard, they can give up and automatically lose, perhaps.
package User;

public abstract class GiveUp {

	public void giveUp() {
		System.out.println("You have given up, and will never escape.");
	}
}
