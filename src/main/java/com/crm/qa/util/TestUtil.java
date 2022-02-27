package com.crm.qa.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICITLY_WAIT = 10;
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		
	try {
	
	
		TakesScreenshot ts = (TakesScreenshot) driver ;
		
	    File src = ts.getScreenshotAs(OutputType.FILE);
	 
	    FileUtils.copyFile(src, new File("C:\\Users\\Dharmendra\\eclipse-workspace\\CRMTest\\Screenshots\\"+screenshotName+".png"));
	    
	    System.out.println("Screenshot Taken");
	}
	
	    catch (Exception e) {
	    	
	    	System.out.println("Exception while taking screenshot"+ e.getMessage());
	    	
	    }
	    
	
	}
}
