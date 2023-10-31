
public class UserInterp {

	// Declarations
	private String userInput;
	private String[] userStepThrough;
	private String verb;
	private String noun;
	private Integer verbSelect;
	
	// Step 1 of the user interpretation methods (If there needs to be more)
	public Integer userInterpStep1(String Input) {
		
		// Grab user input and break it down (Lower case for simplicity)
		userInput = Input;
		userStepThrough = userInput.toLowerCase().split(" ");
		
		// The first thing the user types should be the action
		verb = userStepThrough[0];
		
		// Figure out which action they selected, act accordingly
		switch(verb) {
		case "walk":
			System.out.println("walk");
			break;
		case "interact":
			System.out.println("interact");
			break;
		case "use":
			System.out.println("use");
			break;
		case "open":
			System.out.println("open");
			break;
		}
		
		// Figure out which item they interacted with (If this can pass on, if not, write another method for a "step 2"
		Integer i = 1; // index starts at 1 in this case as we want to skip the verb.
		while(i < userStepThrough.length){
			
			noun = noun + userStepThrough[i];
			i++;
		}
		
		// Return what they wanted to do in Int format for easy ID
		return verbSelect;
	}
	
}
