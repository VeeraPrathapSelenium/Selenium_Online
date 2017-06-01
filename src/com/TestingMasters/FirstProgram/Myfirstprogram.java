package com.TestingMasters.FirstProgram;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Myfirstprogram {
	
	public static ExtentReports extent;
	
	public static ExtentTest test;

	@BeforeTest
	
	public static void starttest()
	{
		
		extent=new ExtentReports(System.getProperty("user.dir")+"/Results/MyHTmlreport.html");
		extent.addSystemInfo("QA","Prathap");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
			
		
	}
	
	@BeforeMethod
	
	public static void before()
	{
		test=extent.startTest("before method");
		
		
	}
	
	
	@AfterMethod
	
	public static void after()
	{
		extent.endTest(test);
		
		
	}
	
@AfterTest
	
	public static void endTest()
	{
		extent.flush();
		
		
	}
	
	
	
	@Test
	
	public static void start()
	
	{
		
	test.log(LogStatus.PASS, "hello");	
		
	}

}
