package com.medsol.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DocumentsPage {

	WebDriver ldriver;
	
	public DocumentsPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Documents']")
	WebElement documents;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement searchBox;
	
	@FindBy(xpath="//a[text()='New Document']")
	WebElement newDocumentButton;
	
	@FindBy(id="title")
	WebElement txtTitle;
	
	@FindBy(xpath="//input[@id='editDocumentTitle']")
	WebElement editTitle;
	
	@FindBy(id="select2-editDocumentTypeId-container")
	WebElement editDocTypeDrp;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement editDocType;
	
	@FindBy(id="select2-editDocumentPatientId-container")
	WebElement editPatientDrp;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement editPatient;
	
	@FindBy(id="editDocumentNotes")
	WebElement editDocNotes;
	
	
	
	
	
	
	@FindBy(xpath="//span[@id='select2-documentTypeId-container']")
	WebElement documentTypeDropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement txtDocumentType;
	
	@FindBy(xpath="//span[@aria-labelledby='select2-documentPatientId-container']")
	WebElement patientDropdown;
	
	@FindBy(xpath="//input[@aria-controls='select2-documentPatientId-results']")
	WebElement txtPatient;
	
	@FindBy(xpath="//span[@title='Attachment']//label//*[name()='svg']")
	WebElement selectProfileImage;
	
	@FindBy(id="notes")
	WebElement txtNotes;
	
	@FindBy(id="documentSave")
	WebElement documentSaveButton;
	
	@FindBy(xpath="//form[@id='addDocumentForm']//button[text()='Cancel']")
	WebElement documentCancelButton;
	
	@FindBy(xpath="//a[@title='Save']")
	WebElement downloadButton;
	
	@FindBy(xpath="//a[@title='Edit']")
	WebElement editButton;
	
	@FindBy(xpath="//a[@title='Delete']")
	WebElement deleteButton;
	
	@FindBy(xpath="//button[text()='Yes, Delete']")
	WebElement yesDeleteButton;
	
	@FindBy(xpath="//button[text()='No, Cancel']")
	WebElement noCancelButton;
	
	@FindBy(id="perPage")
	WebElement pageDrp;
	
	
	public void clickOnDocuments() {
		documents.click();
	}
	
	public void clickOnDocumentSearchBox(String search) {
		searchBox.sendKeys(search);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void clickOnNewDocumentButton() {
		newDocumentButton.click();
	}
	
	public void setTitle(String title) {
		txtTitle.click();
		txtTitle.clear();
		txtTitle.sendKeys(title);
	}
	
	public void editTitle(String title) {
		editTitle.clear();
		editTitle.sendKeys(title);
	}
	
	public void ClickOnEditDocTypeDrp() {
		editDocTypeDrp.click();
	}
	
	public void editDocType(String documentType) {
		editDocType.clear();
		editDocType.sendKeys(documentType);
	}
	
	public void clickOnEditPatientDrp() {
		editPatientDrp.click();
	}
	
	public void editPatient(String patient) {
		editPatient.clear();
		editPatient.sendKeys(patient);
		editPatient.click();
	}
	
	public void editNotes(String notes) {
		editDocNotes.clear();
		editDocNotes.sendKeys(notes);
	}
	
	
	
	
	
	
	
	public void clickOnDocumentTypeDropdown() {
		documentTypeDropdown.click();
	}
	
	public void setDocumentType(String documentType) {
		txtDocumentType.clear();
		txtDocumentType.sendKeys(documentType);
		txtDocumentType.sendKeys(Keys.ENTER);
	}
	
	public void clickOnPatientDropdown() {
		patientDropdown.click();
	}
	
	public void setPatient(String patient) {
		txtPatient.clear();
		txtPatient.sendKeys(patient);
		txtPatient.sendKeys(Keys.ENTER);
	}
	
	public void setProfileImage(String path) throws AWTException{
//		selectProfileImage.sendKeys(path);
//		selectProfileImage.click();
//		JavascriptExecutor js=(JavascriptExecutor)ldriver;
//		js.executeScript("arguments[0].click();", selectProfileImage);
		selectProfileImage.click();
		Robot r=new Robot();
		r.delay(2000);
		
		StringSelection ss=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void setNotes(String notes) {
		txtNotes.clear();
		txtNotes.sendKeys(notes);
	}
	
	public void clickOnSaveDocument() {
		documentSaveButton.click();
	}
	
	public void clickOnCancelDocument() {
		documentCancelButton.click();
	}
	
	public void clickOnDownloadButton() {
		downloadButton.click();
	}
	
	public void clickOnEditButton() {
		editButton.click();
	}
	
	public void clickOnDeleteButton() {
		deleteButton.click();
	}
	
	public void clickOnYesDeleteButton() {
		yesDeleteButton.click();
	}
	
	public void clickOnNoCancelButton() {
		noCancelButton.click();
	}
	
	public void showPages(String page) {
		Select s=new Select(pageDrp);
		s.selectByVisibleText(page);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
