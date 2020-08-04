package com.kren.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppMain {
	private static final Logger log = LogManager.getLogger(AppMain.class);

    public static void main(String[] args) {
		log.error("hello world");
		log.warn("hello world");
		log.info("hello world");
		log.debug("hello world");
		log.trace("hello world");
    }
}