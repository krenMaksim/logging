package com.kren.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.util.UUID;

public class ThreadContextMain {
	private static final Logger loger = LogManager.getLogger();

	public static void main(String[] args) {
		ThreadContext.put("id", UUID.randomUUID().toString()); 
		ThreadContext.put("ipAddress", "localhost");
		ThreadContext.put("loginId", "userOne");
		ThreadContext.put("hostName", "hostOne");

		loger.info("%X Message 1");

		loger.info("%x Message 2");

		ThreadContext.clearAll();
	}
}
