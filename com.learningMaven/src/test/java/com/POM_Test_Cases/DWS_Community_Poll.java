package com.POM_Test_Cases;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import pom_Repository.Login_Page;
import pom_Repository.Welcome_Page;

public class DWS_Community_Poll extends Base_Test{

	@Test
	public void communityPoll() {
		Welcome_Page wp = new Welcome_Page(driver);
		wp.clickLogin();
		
		Login_Page lp = new Login_Page(driver);
		lp.enterEmail("nikhil26@gmail.com");
		lp.enterPassword("nikhil123");
		lp.clickLoginButton();
		
		wp.clickExcellentRadioButton();
		wp.clickGoodRadioButton();
		wp.clickPoorRadioButton();
		wp.clickVeryBadRadioButton();
		wp.clickVoteButton();
	}
}
