package com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

public class ListenersLogin extends Base_Test{

	@Test
	public void loginTestListener() {
		
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys("chandelwar7@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Nikhil@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		WebElement logOutButton = driver.findElement(By.partialLinkText("Log out"));
		
		Assert.assertEquals(logOutButton.getText(), "Log Out");
	}
}
