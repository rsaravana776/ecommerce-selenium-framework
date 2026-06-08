package com.automation.tests;

import com.automation.base.basetest;
import com.automation.pages.LoginPage;

public class loginTest extends basetest{
	
	public void testlogin() {
		setup();
		
		LoginPage lp= new LoginPage(driver);
		lp.login("test@gmail.com", "123456");
	}

}
