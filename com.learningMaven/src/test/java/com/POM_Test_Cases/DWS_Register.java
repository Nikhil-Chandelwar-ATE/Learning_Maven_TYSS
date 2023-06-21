package com.POM_Test_Cases;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import pom_Repository.Register_Page;
import pom_Repository.Welcome_Page;

public class DWS_Register extends Base_Test{

	@Test
	public void registerToDWS() {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.clickRegister();
		Register_Page rp = new Register_Page(driver);
		rp.clickMaleRadioButton();
		rp.enterFirstName("Nikhil");
		rp.enterlastName("Chandelwar");
		rp.enterEmail("chandelwar100@gmail.com");
		rp.enterPassword("Nikhil123");
		rp.enterConfirmPassword("Nikhil123");
		rp.clickRegisterButton();
	}
}
