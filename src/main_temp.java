//Import the necessary files for logging
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//A temporary class used to practice and set up the logging
//May be used for other testing in the future.
public class main_temp {

	// Logging Object
	final static Logger log = 
			LogManager.getLogger(main_temp.class.getName());

	public static void main(String[] args) {

		log.debug("Hello World!");
		log.info("Hello World, Again!");

	}

}
