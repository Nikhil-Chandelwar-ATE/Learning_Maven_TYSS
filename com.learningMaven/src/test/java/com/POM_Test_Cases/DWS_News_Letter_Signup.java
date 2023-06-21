package com.POM_Test_Cases;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import pom_Repository.Welcome_Page;

public class DWS_News_Letter_Signup extends Base_Test{

	@Test
	public void subscribeTONewsLetter() {
		Welcome_Page wp = new Welcome_Page(driver);
		wp.enterNewsletterSignupTextField("chandelwar100@gmail.com");
		wp.clickSubscribeToNewsletterButton();
	}
}
