package log4jPractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jMethod {
	
	static Logger log=Logger.getLogger(Log4jMethod.class.getName());
	public static void main(String[] args) {

		
		
		BasicConfigurator.configure();
		log.debug("Hello debug");
		log.info("hello info");
		log.warn("Hello warn");
		log.error("Hello Error");
		log.fatal("Hello Fatal");
		

	}
}
