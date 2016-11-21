package com.dataxf.core;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Tweed {
	
	private static final Logger logger = Logger.getLogger(Tweed.class);
	
	public static void go(){
		logger.debug("We are inside core module, class Tweed!");
	}
}
