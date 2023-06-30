package com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;
@Listeners(com.genericLibrary.ListenerImplementation.class)
public class Learning_TestNG_Listeners2 extends Base_Test{

	@Test
	public void registerTest() {
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ram");
		driver.findElement(By.id("LastName")).sendKeys("lakhan");
		driver.findElement(By.id("Email")).sendKeys("ram23lakhan@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ramlakhan123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ramlakhan123");
		driver.findElement(By.id("register-button")).click();
		
		WebElement button = driver.findElement(By.xpath("//input[contains(@class,'register-continue-button')]"));
		Assert.assertEquals(button.isDisplayed(), false);
	}
}
