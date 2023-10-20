package com.log4j;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jApplication {
	static Logger log = Logger.getLogger(Log4jApplication.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");
		log.error("Error");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		log.warn("Warning");
		log.fatal("critical error");
		log.debug("Debugging");
		
	}

}
