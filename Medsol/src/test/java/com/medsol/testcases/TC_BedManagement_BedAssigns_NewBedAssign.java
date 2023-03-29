package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobjects.BedManagementPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_BedManagement_BedAssigns_NewBedAssign extends BaseClass {

	Readconfig config=new Readconfig();
	public String searchBox=config.getSearch();
	public String casename=config.getCase();
	public String date=config.getDate();
	public String month=config.getMonth();
	public String year=config.getYear();
	public String hour=config.getHour();
	public String description=config.getCaseDescription();
	public String bedType=config.getBedType();
	
	
	@Test
	public void assigningNewBed() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		BedManagementPage bmp=new BedManagementPage(driver);
		bmp.clickOnBedManagement();
		bmp.clickOnBedAssigns();	
		Thread.sleep(2000);
		bmp.clickOnActionsDropdown();
		Thread.sleep(2000);
		bmp.clickOnNewBedAssign();
		Thread.sleep(2000);
		bmp.setSelectCase();
		Thread.sleep(2000);
		bmp.clickOnBedDropdown();
		Thread.sleep(2000);
		bmp.setBedType(bedType);
		Thread.sleep(2000);
		bmp.setAssignDate(year, month, date, hour);
		Thread.sleep(2000);
		bmp.setCaseDescription(description);
		Thread.sleep(2000);
		bmp.clickOnSaveButton();
	
	}
}
