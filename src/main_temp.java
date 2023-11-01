import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main_temp {

	// Logging Object
	final static Logger log = 
			LogManager.getLogger(main_temp.class.getName());

	public static void main(String[] args) {

		log.debug("Hello World!");
		log.info("Hello World, Again!");

	}

}
