package com.automation.utils;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

public static ExtentReports report;

public static ExtentReports getReport(){

if(report==null){

ExtentSparkReporter spark=new ExtentSparkReporter("target/report.html"); //Create report file.

report=new ExtentReports(); //Create report file.

report.attachReporter(spark); //Connect Extent Report object to report file.

}

return report;

}

}