package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.base.basetest;
import com.automation.pages.LoginPage;

public class loginTest extends basetest{
	
	@Test
	public void testlogin() throws Exception {

	    setup();

	    LoginPage lp = new LoginPage(driver);

	    Thread.sleep(60000); // 60 sec to solve captcha

	    lp.login("test@gmail.com","123456");

	    Thread.sleep(30000); // observe after login

	    // driver.quit();   // comment for now
	}
}