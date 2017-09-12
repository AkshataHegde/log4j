package com.akshu.log4jexmpl;

import org.apache.log4j.Logger;

public class Log4j2{

	final static Logger logger = Logger.getLogger(Log4j2.class);

	public static void main(String[] args) {

		Log4j2 obj = new Log4j2();

		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}


	}

	private void divide(){

		int i = 10 /0;

	}

}