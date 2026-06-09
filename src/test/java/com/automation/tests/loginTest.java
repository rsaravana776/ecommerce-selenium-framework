package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.base.basetest;
import com.automation.pages.LoginPage;

public class loginTest extends basetest{
	
	@Test
	public void testlogin() {
		setup();
		
		LoginPage lp= new LoginPage(driver);
		lp.login("test@gmail.com", "123456");
	}

}
