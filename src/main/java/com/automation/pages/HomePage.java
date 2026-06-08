package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automation.utils.ExplictWaitUtil;
import com.automation.utils.LoggerUtil;


public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		
	}
	By search=By.id("small-searchterms");
	By click=By.xpath("//button[contains(text(),'Search')]");
	
public void Selectproduct(String product) {

LoggerUtil.logger.info("Searching Product");

ExplictWaitUtil.wait(driver,search);


	
	driver.findElement(search).sendKeys(product);
	driver.findElement(click).click();
}
	
	
}
