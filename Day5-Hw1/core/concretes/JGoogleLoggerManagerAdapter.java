package day5hw1.core.concretes;

import day5hw1.core.abstracts.LoggerService;
import day5hw1.jGoogleLogger.JGoogleLoggerManager;

public class JGoogleLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		JGoogleLoggerManager manager = new JGoogleLoggerManager();
		manager.log(message);
	}
	
}
