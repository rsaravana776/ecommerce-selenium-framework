package com.automation.pages;


import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class ProductPage {
		WebDriver driver;

		public ProductPage(WebDriver driver) {
			this.driver=driver;
		}
		
		By product =By.xpath("//h2//a[contains(text(),'Apple MacBook Pro')]");
		By Cart = By.id("add-to-cart-button-4");
		
		
		public void ProductToCart() {
			  driver.findElement(product).click();
			  driver.findElement(Cart).click();
			
		}
	}

