package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By login = By.linkText("Log in");	
	By email = By.id("Email");
	By password = By.id("Password");
	By submit = By.xpath("//button[contains(text(),'Log in')]");
	
	public void login(String user, String pass) {
		
		driver.findElement(login).click();
		driver.findElement(email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submit).click();

		
		
	}
	
}

