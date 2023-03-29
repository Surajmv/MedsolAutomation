package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobjects.DocumentsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_Documents_Documents_NewDocument extends BaseClass {

	Readconfig config=new Readconfig();
	public String title=config.getTitle();
	public String documentType=config.getDocumentType();
	public String notes=config.getNotes();
	public String patient=config.getPatientName();
	public String image=config.getProfileImage();
	
	
	
	@Test
	public void creatingNewDocument() throws InterruptedException, AWTException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		
		DocumentsPage dp=new DocumentsPage(driver);
		dp.clickOnDocuments();
		Thread.sleep(1000);
		dp.clickOnNewDocumentButton();
		Thread.sleep(1000);
		dp.setTitle(title);
		Thread.sleep(1000);
		dp.clickOnDocumentTypeDropdown();
		Thread.sleep(1000);
		dp.setDocumentType(documentType);
		Thread.sleep(1000);
		dp.clickOnPatientDropdown();
		Thread.sleep(1000);
		dp.setPatient(patient);
		Thread.sleep(5000);
		dp.setProfileImage(image);
		Thread.sleep(5000);
		dp.setNotes(notes);
		Thread.sleep(2000);
		dp.clickOnSaveDocument();	
	}
	
}
