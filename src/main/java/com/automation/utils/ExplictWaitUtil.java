package com.automation.utils;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitUtil {
	
	public static void wait(WebDriver driver,By locator) {
		
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(8));
		
		ew.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

}