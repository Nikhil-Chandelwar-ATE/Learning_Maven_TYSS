package com.testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register_Test_CaseTest {

	@DataProvider(name = "RegisterData")
	public Object[][] registerData() {
		Object[][] data = new Object[1][5];
		data[0][0] = "nikhil";
		data[0][1] = "chandelwar";
		data[0][2] = "nikhil103@gmail.com";
		data[0][3] = "nikhil123";
		data[0][4] = "nikhil123";

		return data;
	}

	@Test(dataProvider = "RegisterData")
	public void registerToDWS(String fName, String lName, String email, String pwd, String cPwd) {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fName);
		driver.findElement(By.id("LastName")).sendKeys(lName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cPwd);
		driver.findElement(By.id("register-button")).click();

		System.out.println(driver.findElement(By.xpath("//div[@class='page registration-result-page']")).getText());
		driver.quit();
	}
}
