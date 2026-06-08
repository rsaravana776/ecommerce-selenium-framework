package com.automation.utils;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.automation.constants.Constants;
public class WaitUtil {
	
	public static void wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.WAIT));
	}
	

}
