package com.dataxf.moduleB;

import org.apache.log4j.Logger;

import com.dataxf.core.Tweed;

public class Cordoroy {
	private static final Logger logger = Logger.getLogger(Cordoroy.class);
	
	public static void go(){
		logger.debug("Cordoroy!");
		Tweed.go();
	}
}
