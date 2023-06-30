package com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

@Listeners(com.genericLibrary.ListenerImplementation.class)

public class Learning_TestNG_Listeners extends Base_Test{
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys("chandelwar7@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Nikhil@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		WebElement logOutButton = driver.findElement(By.partialLinkText("Log out"));
		
		Assert.assertEquals(logOutButton.getText(), "Log Out");
	}
}
