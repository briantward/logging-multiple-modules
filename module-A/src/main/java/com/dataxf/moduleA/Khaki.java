package com.dataxf.moduleA;

import org.apache.log4j.Logger;

import com.dataxf.core.Tweed;
import org.springframework.stereotype.Component;

@Component("khaki")
public class Khaki {
	private static final Logger logger = Logger.getLogger(Khaki.class);
	
	public void go(){
		logger.debug("Module A - Khahki");
		Tweed.go();
	}
}
