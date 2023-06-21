package com.testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Test_CaseTest {

	@DataProvider(name = "LoginData")
	public Object[][] logindata() {
		Object[][] data = new Object[1][2];
		data[0][0] = "nikhil26@gmail.com";
		data[0][1] = "nikhil123";
		return data;
	}

	@Test(dataProvider = "LoginData")
	public void loginToDWS(String usn, String pwd) {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(usn);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.quit();
	}
}
