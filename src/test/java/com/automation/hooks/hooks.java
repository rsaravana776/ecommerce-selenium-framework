package com.automation.hooks;

import com.automation.base.basetest;
import com.automation.utils.ExtentManager;
import com.automation.utils.ScreenshotUtil;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends basetest {

    ExtentTest test;        //Create report object

    @Before
    public void start( Scenario scenario) {  //Current cucumber scenario.

        setup();

        test =ExtentManager
                .getReport()   //Get report object.
                .createTest(scenario.getName()); //Create one report entry.

    }

    @After
    public void end(Scenario scenario)throws Exception {

        if (scenario.isFailed()) {

            ScreenshotUtil.capture(driver);

        }

        driver.quit();

        ExtentManager
                .getReport()
                .flush(); //Save report

    }

}