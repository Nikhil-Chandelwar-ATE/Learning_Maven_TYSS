package com.POM_Test_Cases;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;
import pom_Repository.Home_Page;
import pom_Repository.Login_Page;
import pom_Repository.Welcome_Page;

public class DWS_Logout extends Base_Test{

	@Test
	public void logout() {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.clickLogin();
		Login_Page lp = new Login_Page(driver);
		lp.enterEmail("chandelwar100@gmail.com");
		lp.enterPassword("Nikhil123");
		lp.clickRememberMeCheckBox();
		lp.clickLoginButton();
		
		Home_Page hp = new Home_Page(driver);
		hp.clickLogoutLink();
	}
}