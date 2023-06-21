package com.POM_Test_Cases;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import pom_Repository.Jewelry_Page;
import pom_Repository.Jewelry_Selected_Product_page;
import pom_Repository.Login_Page;
import pom_Repository.Welcome_Page;
import pom_Repository.Wishlist_Page;

public class DWS_Add_Product_To_Wishlist extends Base_Test{

	@Test
	public void addProductToWishlist() throws InterruptedException {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.clickLogin();
		
		Login_Page lp = new Login_Page(driver);
		lp.enterEmail("nikhil26@gmail.com");
		lp.enterPassword("nikhil123");
		lp.clickRememberMeCheckBox();
		lp.clickLoginButton();

		wp.clickJewelryLink();
		Thread.sleep(2000);
		
		Jewelry_Page jp = new Jewelry_Page(driver);
		jp.clickDiamondHeartProductLink();
		
		Jewelry_Selected_Product_page jspp = new Jewelry_Selected_Product_page(driver);
		jspp.clickAddToWishlistButton();
		
		Thread.sleep(3000);
		wp.clickWishlist();
		
		Wishlist_Page wlp = new Wishlist_Page(driver);
		String WishlistURL = wlp.getWishlistURL().getText();
		System.out.println(WishlistURL);
	}
}
