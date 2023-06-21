package com.testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Purchase_A_Product_Test_CaseTest {

	@DataProvider(name = "LoginData")
	public String[][] logindata() {
		String[][] data = new String[1][2];
		data[0][0] = "nikhil26@gmail.com";
		data[0][1] = "nikhil123";
		return data;
	}

	@Test(dataProvider = "LoginData")
	public void purchasingProductDWS(String usn, String pwd) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(usn);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.findElement(By.partialLinkText("nikhil26@gmail.com")).getText(), "nikhil26@gmail.com");
		
		WebElement addToCart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", addToCart);
		addToCart.click();
		Thread.sleep(2000);
		
		WebElement cartLink = driver.findElement(By.xpath("//span[@class='cart-qty']"));
		js.executeScript("arguments[0].scrollIntoView(true);", cartLink);
		Assert.assertEquals(cartLink.getText(), "(1)");
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		
		WebElement payInfo = driver.findElement(By.xpath("//div[@class='info']"));
		Assert.assertEquals(payInfo.getText(), "You will pay by COD");
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='order-review-data']")).getText());
		WebElement confirm = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		js.executeScript("arguments[0].scrollIntoView[false]", confirm);
		System.out.println("=================================");
		System.out.println(driver.findElement(By.xpath("//div[@class='total-info']")).getText());
		confirm.click();
		System.out.println("=================================");
		System.out.println(driver.findElement(By.xpath("//div[@class='page checkout-page']")).getText());
		driver.findElement(By.partialLinkText("Click here for order details.")).click();
		
		System.out.println("=================================");
		WebElement invoice = driver.findElement(By.xpath("//div[@class='center-1']"));
		System.out.println(invoice.getText());
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Log out")).click();
		driver.quit();
	}
}
