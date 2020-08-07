package com.kren.logging.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppMain {
	private static Logger logger = LoggerFactory.getLogger(AppMain.class);

	public static void main(String[] args) {
		logger.debug("Hello world.");
		logger.info("Hello world.");
	}
}