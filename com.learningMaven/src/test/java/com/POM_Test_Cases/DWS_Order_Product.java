package com.POM_Test_Cases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import pom_Repository.Books_Page;
import pom_Repository.Checkout_Page;
import pom_Repository.Login_Page;
import pom_Repository.Shopping_Cart_Page;
import pom_Repository.Thank_You_Page;
import pom_Repository.Welcome_Page;

public class DWS_Order_Product extends Base_Test{

	@Test
	public void orderAProduct() throws InterruptedException, IOException {
		Welcome_Page wp = new Welcome_Page(driver);
		wp.clickLogin();
		
		Login_Page lp = new Login_Page(driver);
		lp.enterEmail("nikhil26@gmail.com");
		lp.enterPassword("nikhil123");
		lp.clickRememberMeCheckBox();
		lp.clickLoginButton();
		
		wp.clickBooksLink();
		
		Books_Page bp = new Books_Page(driver);
		Select sel = new Select(bp.getSortByDropdown());
		sel.selectByIndex(1);
		bp.clickAddToCartButton();
		Thread.sleep(5000);
		
		wp.clickShoppingCart();
		
		Shopping_Cart_Page scp = new Shopping_Cart_Page(driver);
		scp.clickTermsOfServiceCheckBox();
		scp.clickCheckoutButton();
		
		Checkout_Page cp = new Checkout_Page(driver);
		cp.clickBillingAddressContinueButton();
		cp.clickShippingAddressContinueButton();
		cp.clickShippingMethodContinueButton();
		cp.clickPaymentMethodContinueButton();
		cp.clickPaymentInformationContinueButton();
		cp.clickConfirmOrderButton();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/orderSuccessfull.png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		Thank_You_Page typ = new Thank_You_Page(driver);
		typ.clickContinueButton();
	}
	
}
