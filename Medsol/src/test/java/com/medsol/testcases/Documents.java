package com.medsol.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medsol.pageobjects.DocumentsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class Documents extends BaseClass {

	Readconfig config = new Readconfig();
	public String title = config.getTitle();
	public String documentType = config.getDocumentType();
	public String notes = config.getNotes();
	public String patient = config.getPatientName();
	public String image = config.getProfileImage();
	public String search = config.getSearch();

	@Test(priority = 1)
	public void creatingNewDocument() throws InterruptedException, AWTException {
		LoginPage lp = new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();

		DocumentsPage dp = new DocumentsPage(driver);
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
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void editDocument() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();

		DocumentsPage dp = new DocumentsPage(driver);
		dp.clickOnDocuments();
		Thread.sleep(1000);
		// dp.clickOnNewDocumentButton();
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
		// Thread.sleep(5000);
		// dp.setProfileImage(image);
		// Thread.sleep(5000);
		dp.editNotes(notes);
		Thread.sleep(2000);
		dp.clickOnSaveDocument();
	}

	@Test(priority = 3)
	public void deleteDocument() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();

		DocumentsPage dp = new DocumentsPage(driver);
		dp.clickOnDocuments();
		Thread.sleep(3000);
		dp.clickOnDeleteButton();
		Thread.sleep(3000);
		dp.clickOnYesDeleteButton();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void searchDocument() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();

		DocumentsPage dp = new DocumentsPage(driver);
		dp.clickOnDocuments();
		Thread.sleep(3000);
		dp.clickOnDocumentSearchBox(search);
	}
}
