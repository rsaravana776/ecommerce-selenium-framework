package com.automation.base;

import org.openqa.selenium.WebDriver;

import com.automation.config.configReader;
import com.automation.factory.Driverfactory;
import com.automation.utils.WaitUtil;

public class basetest {

	public WebDriver driver;
	
	public void setup() {
		driver = Driverfactory.getDriver();
		WaitUtil.wait(driver);
		driver.get(configReader.getProperty("url"));
	}

	}

