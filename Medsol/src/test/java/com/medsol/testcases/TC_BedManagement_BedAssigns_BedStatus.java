package com.medsol.testcases;
import org.testng.annotations.Test;

import com.medsol.pageobjects.BedManagementPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_BedManagement_BedAssigns_BedStatus extends BaseClass {

	
	
	@Test
	public void checkBedStatus() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		BedManagementPage bmp=new BedManagementPage(driver);
		bmp.clickOnBedManagement();
		bmp.clickOnBedAssigns();	
		Thread.sleep(2000);
//		bmp.clickOnSearchBox(searchBox);
//		bmp.clickOnFilterButton();
//		bmp.clickOnStatusDropdown();
//		bmp.clickOnAllButton();
//		bmp.clickOnActiveButton();
//		Thread.sleep(2000);
//		bmp.clickOnDeactiveButton();
//		Thread.sleep(2000);
//		bmp.clickOnResetButton();
		bmp.clickOnActionsDropdown();
		bmp.clickOnBedStatus();
		
	
	}
	
	
	
	
	
}
