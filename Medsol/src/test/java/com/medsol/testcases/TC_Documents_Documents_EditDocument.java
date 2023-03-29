package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobjects.DocumentsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_Documents_Documents_EditDocument extends BaseClass {

	Readconfig config=new Readconfig();
	public String title=config.getTitle();
	public String documentType=config.getDocumentType();
	public String notes=config.getNotes();
	public String patient=config.getPatientName();
	
	@Test
	public void editDocument() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		DocumentsPage dp=new DocumentsPage(driver);
		dp.clickOnDocuments();
		Thread.sleep(1000);
		//dp.clickOnNewDocumentButton();
		Thread.sleep(1000);
		dp.clickOnEditButton();
		Thread.sleep(1000);
		dp.editTitle(title);
		Thread.sleep(1000);
		dp.ClickOnEditDocTypeDrp();
		Thread.sleep(1000);
		dp.editDocType(documentType);
		Thread.sleep(1000);
		dp.clickOnEditPatientDrp();
		Thread.sleep(1000);
		dp.editPatient(patient);
		//Thread.sleep(5000);
		//dp.setProfileImage(image);
		//Thread.sleep(5000);
		dp.editNotes(notes);
		Thread.sleep(2000);
		dp.clickOnSaveDocument();	
	}
}
