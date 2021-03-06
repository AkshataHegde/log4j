package com.akshu.log4jexmpl;
import org.apache.log4j.Logger;

public class Log4j{

	final static Logger logger = Logger.getLogger(Log4j.class);

	public static void main(String[] args) {

		Log4j obj = new Log4j();
		obj.runMe("mkyong");

	}

	private void runMe(String parameter){

		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

}