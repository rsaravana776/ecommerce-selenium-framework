package com.automation.utils;
import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {
	public static void capture(WebDriver driver) throws Exception {
		
		
		File obj = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(obj, new File("shot.png"));
		
		
	}
	

}

