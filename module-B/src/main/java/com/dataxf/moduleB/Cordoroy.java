package com.dataxf.moduleB;

import org.apache.log4j.Logger;

import com.dataxf.core.Tweed;
import org.springframework.stereotype.Component;

@Component("cordoroy")
public class Cordoroy {
	private static final Logger logger = Logger.getLogger(Cordoroy.class);
	
	public static void go(){
		logger.debug("Cordoroy!");
		Tweed.go();
	}
}
