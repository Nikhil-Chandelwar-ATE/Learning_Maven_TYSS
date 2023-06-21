package com.POM_Test_Cases;

import org.testng.annotations.Test;

import com.genericLibrary.Base_Test;

import pom_Repository.Welcome_Page;

public class DWS_Search_A_Product extends Base_Test{

	@Test
	public void searchAProduct() {
		Welcome_Page wp = new Welcome_Page(driver);
		wp.searchtextField("mobiles");
		wp.clickSearchButton();
	}
}
