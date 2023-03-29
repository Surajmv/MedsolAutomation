package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobjects.DocumentsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_Documents_Documents_SearchDocument extends BaseClass {

	Readconfig config=new Readconfig();
	public String search=config.getSearch();
	
	@Test
	public void searchDocument() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		DocumentsPage dp=new DocumentsPage(driver);
		dp.clickOnDocuments();
		Thread.sleep(3000);
		dp.clickOnDocumentSearchBox(search);
	}
	
}
