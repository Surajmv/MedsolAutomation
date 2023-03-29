package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobjects.DocumentsPage;
import com.medsol.pageobjects.LoginPage;

public class TC_Documents_Documents_DeleteDocument extends BaseClass {

	@Test
	public void deleteDocument() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		DocumentsPage dp=new DocumentsPage(driver);
		dp.clickOnDocuments();
		Thread.sleep(3000);
		dp.clickOnDeleteButton();
		Thread.sleep(3000);
		dp.clickOnYesDeleteButton();
		Thread.sleep(3000);
	}
}
