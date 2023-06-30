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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Working_With_Extent_Report {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ExtentReports report = new ExtentReports("./Reports/report.html");
		ExtentTest test = report.startTest("Login");
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		test.log(LogStatus.PASS, "Web Application launched successfully");
		
		driver.findElement(By.className("ico-login")).click();
		test.log(LogStatus.PASS, "Clicked on loggin");
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Nikhil123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		test.log(LogStatus.INFO, "Logged in successfully");
		test.log(LogStatus.PASS, test.addScreenCapture(takesScreenshot()));
		
		report.endTest(test);
		report.flush();
		
		driver.close();
	}
	
	public static String takesScreenshot() throws IOException {
		String imagePath = "./screenshots/login.png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(imagePath);
		FileHandler.copy(temp, dest);
		return "."+imagePath;
	}

}
