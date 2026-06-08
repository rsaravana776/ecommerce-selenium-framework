package com.automation.stepdefinitions;
import io.cucumber.java.en.*;

import org.testng.Assert;

import com.automation.base.basetest;
import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.CartPage;

public class AddCartStepDefinition extends basetest{

HomePage hp;

ProductPage pp;

CartPage cp;

@Given("User opens website")

public void open(){

hp=new HomePage(driver);

}

@When("User searches product")

	public void search(String product){

			hp=new HomePage(driver);

			hp.Selectproduct(product);

			}

@And("User clicks add cart")

public void add(){

pp=new ProductPage(driver);

pp.ProductToCart();

}

@Then("User should open cart")

public void cart(){

cp=new CartPage(driver);

cp.openCart();

String actual= cp.getTitle();

Assert.assertEquals(actual,"Shopping cart");

}

}