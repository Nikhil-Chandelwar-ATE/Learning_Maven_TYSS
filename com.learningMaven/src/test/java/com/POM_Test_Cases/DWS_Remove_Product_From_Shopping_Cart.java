package com.POM_Test_Cases;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import pom_Repository.Books_Page;
import pom_Repository.Login_Page;
import pom_Repository.Shopping_Cart_Page;
import pom_Repository.Welcome_Page;

public class DWS_Remove_Product_From_Shopping_Cart extends Base_Test{

	@Test
	public void removeProductFromShoppingCart() throws InterruptedException {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.clickLogin();
		
		Login_Page lp = new Login_Page(driver);
		lp.enterEmail("chandelwar100@gmail.com");
		lp.enterPassword("Nikhil123");
		lp.clickRememberMeCheckBox();
		lp.clickLoginButton();
		Thread.sleep(2000);
		
		wp.clickBooksLink();
		
		Books_Page bp = new Books_Page(driver);
		bp.clickAddToCartButton();
		Thread.sleep(5000);
		wp.clickShoppingCart();
		
		Shopping_Cart_Page scp = new Shopping_Cart_Page(driver);
		scp.clickRemoveCheckBox();
		scp.clickUpdateShoppingCartButton();
	}
}
