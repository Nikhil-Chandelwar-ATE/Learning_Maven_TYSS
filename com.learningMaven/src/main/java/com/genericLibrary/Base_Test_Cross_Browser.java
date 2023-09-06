package com.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test_Cross_Browser {

	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void browser_Setup(@Optional("firefox")String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			//System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void browser_Tear_Down() {
		driver.quit();
	}
}
