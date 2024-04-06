package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("testing for log4j");
		
		logger.trace("trace msg");
		logger.info("info msg");
		logger.error("error msg");
		logger.warn("warning msg");
		logger.fatal("fatal msg");
		
		System.out.println("completed test");
		


		
		

	}

}
