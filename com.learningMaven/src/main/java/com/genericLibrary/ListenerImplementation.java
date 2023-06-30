package com.genericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution finished");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Execution skipped of "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) Base_Test.driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+result.getName()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
