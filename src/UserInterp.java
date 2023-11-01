import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserInterp {

	// Declarations
	private String userInput;
	private String[] userStepThrough;
	private String verb;
	private String noun;
	private Integer verbSelect;
	
	// Logging Object
		final static Logger log = 
				LogManager.getLogger(UserInterp.class.getName());
	
	// Step 1 of the user interpretation methods (If there needs to be more)
	public Integer userInterpStep1(String Input) {

		try {
		
		// Grab user input and break it down (Lower case for simplicity)
		userInput = Input;
		userStepThrough = userInput.toLowerCase().split(" ");
		
		// The first thing the user types should be the action
		verb = userStepThrough[0];
		
		// Figure out which action they selected, act accordingly
        switch(verb) {
        case "walk":
            verbSelect = 1;
            break;
        case "interact":
            verbSelect = 2;
            break;
        case "use":
            verbSelect = 3;
            break;
        case "open":
            verbSelect = 4;
            break;
        }
		
		// Return what they wanted to do in Int format for easy ID
		return verbSelect;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
	        log.warn("Invalid input format");
	        return null;
	        
	    	} catch (Exception e) {
	    		
	        log.error("Error Occured: " + e.getMessage());
	        return null;
	        
	    	}
	}
	
	// Figure out which item they interacted with
	public String userInterpStep2(String Input) {
		
		
		// Find length, modify noun by length
		if (userStepThrough.length == 2) {
			
			Integer i = 1; // index starts at 1 in this case as we want to skip the verb.
			while(i < userStepThrough.length){
				
				noun = noun + userStepThrough[i];
				i++;
			}
			
		} else {
			
			Integer i = 1; // index starts at 1 in this case as we want to skip the verb.
			while(i < userStepThrough.length){
				
				// In case they specify multiple words as one object/item then we must concat a space
				noun = noun + userStepThrough[i] + " ";
				i++;
			}
			
			// But because we have to concat a space at the end of every loop, 
			// the noun will end with a space, causing issues
			// so we must trim that extra space.
			noun.trim();
			
		}		
		
		return noun;
	}
	
}
