package LoggerGroup.loggerapp;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;
public class AppLog {

	public static void main(String[] args) {
		//Logger logger=LoggerFactory.getLogger(AppLog.class.getName());
    	//logger.info("info from slf4j");
    	//logger.debug("debug info");
    	Logger logger=Logger.getLogger(AppLog.class.getName());
    	DOMConfigurator.configure("log4j.xml");
		logger.info("info from logger");
		System.out.println("hello world");

	}

}

/*
Excersice for Logger in log4j 1.create a Logging application using slf4j 
and display below given information using info and warning info : displaying developer
 information warning : displaying values over consoleimport org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App 
{ public static void main( String[] args ){
	//Logger logger=Logger.getLogger(App.class.getName());
	//DOMConfigurator.configure("log4j.xml");
	Logger logger=LoggerFactory.getLogger(App.class.getName());
	logger.info("Displaying Developer Information"); 
	logger.debug("displaying values over console"); } }
}*/