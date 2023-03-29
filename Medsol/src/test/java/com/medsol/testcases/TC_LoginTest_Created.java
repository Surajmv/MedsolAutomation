package com.medsol.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.medsol.pageobjects.LoginPage;

public class TC_LoginTest_Created extends BaseClass{

	
	@Test
	public void loginTest() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(2000);
		lp.clickOnLoginSubmit();
		
		Thread.sleep(2000);
		if(driver.getTitle().equals("    Dashboard\r\n"
				+ " | HMS")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertFalse(false);
	
		lp.clickOnTheme();
		Thread.sleep(3000);
		lp.clickOnLogoutDropdown();
		lp.clickOnLogoutButton();
		
	}
}
