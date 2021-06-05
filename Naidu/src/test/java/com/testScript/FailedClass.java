package com.testScript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedClass implements IRetryAnalyzer{

	int min=0, max=10;
	public boolean retry(ITestResult result) {
		
		if (min<=max) {
			min++;
			return true;
			
		}
		
		return false;
	}
	
	

}
