package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
 WebDriver driver;
 
 public CartPage(WebDriver driver) {
	 this.driver= driver;
	 
 }
 
 By shoppingCart =By.xpath("//span[contains(text(),'Shopping cart')]");
 By title = By.xpath("//div[@class='page-title']");
 
 public void openCart() {
	 driver.findElement(shoppingCart).click();
 }
 
 public String getTitle(){

	 return driver.findElement(title).getText();

	 }
}
