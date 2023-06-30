package com.testScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Learning_Extent_Report {

	public static WebDriver driver;
	
	@DataProvider(name = "LoginData")
	public Object[][] logindata() {
		Object[][] data = new Object[1][2];
		data[0][0] = "nikhil26@gmail.com";
		data[0][1] = "nikhil123";
		return data;
	}

	@Test(dataProvider = "LoginData")
	public void loginToDWS(String usn, String pwd) {

		ExtentReports report=new ExtentReports("./Reports/reportNameFail.html");
		
		ExtentTest test=report.startTest("Login");
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser is open");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("Log")).click();
		test.log(LogStatus.INFO, "Login page is displayed");
		
		driver.findElement(By.id("Email")).sendKeys(usn);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		test.log(LogStatus.PASS, "User is logged in");
		
		test.log(LogStatus.INFO, test.addScreenCapture(takingScreenshotMethod()));
		report.endTest(test);
		report.flush();
		
		driver.quit();
	}
	
	public static String takingScreenshotMethod() {
		
			String path="./ScreenShots/name2.png";
			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "."+path;
		}
}
