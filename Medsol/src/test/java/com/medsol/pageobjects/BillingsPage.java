package com.medsol.pageobjects;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BillingsPage {
	
WebDriver ldriver;
	
	public BillingsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Billings']")
	WebElement billings;
	
	@FindBy(xpath="//a[@href='http://cls-medsol.in/invoices']")
	WebElement invoices;
	
	@FindBy(xpath="//a[text()='New Invoice']")
	WebElement newInvoice;
	
	@FindBy(xpath="//a[text()='Back']")
	WebElement backButton;
	
	@FindBy(id="select2-patient_id-container")
	WebElement patientDropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement txtSelectPatient;
	
	@FindBy(id="discount")
	WebElement txtDiscount;
	
	@FindBy(id="select2-status-container")
	WebElement statusDropdown;
	
	@FindBy(xpath="//li[text()='Paid']")
	WebElement txtPaidStatus;
	
	@FindBy(xpath="//li[text()='Pending']")
	WebElement txtPendingStatus;
	
	@FindBy(xpath="//button[text()=' Add']")
	WebElement addButton;
	
	@FindBy(xpath="//span[text()='Select Account']")
	WebElement account;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement txtSelectAccount;
	
	@FindBy(xpath="//input[@name='description[]']")
	WebElement txtDescription;
	
	@FindBy(xpath="//input[@class='form-control qty']")
	WebElement txtQty;
	
	@FindBy(xpath="//input[@class='form-control price-input price']")
	WebElement txtPrice;
	
	@FindBy(xpath="//a[@title='Delete']")
	WebElement actionDeleteButton;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement saveButton;
	
	@FindBy(xpath="//a[text()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath="//a[normalize-space()='Print Invoice']")
	WebElement printInvoiceButton;
	
	@FindBy(xpath="//a[@title='Delete']")
	WebElement deleteButton;
	
	@FindBy(xpath="//button[text()='Yes, Delete']")
	WebElement yes_DeleteButton;
	
	@FindBy(xpath="//button[text()='No, Cancel']")
	WebElement no_CancelButton;
	
	@FindBy(xpath="//a[@title='Edit']")
	WebElement editButton;
	
	@FindBy(xpath="//a[@href='http://cls-medsol.in/advanced-payments']")
	WebElement advancePayments;
	
	@FindBy(xpath="//a[normalize-space()='New Advance Payment']")
	WebElement newAdvancePayment;
	
	@FindBy(id="select2-advancePaymentPatientId-container")
	WebElement patientInAPDrp;
	
	@FindBy(xpath="//input[@role='searchbox']")
	WebElement selectPatientInAP;
	
	@FindBy(id="amount")
	WebElement txtAmount;
	
	@FindBy(id="advancedPaymentSave")
	WebElement saveBtnInAP;
	
	@FindBy(xpath="//form[@id='addAdvancedPaymentForm']//button[@type='button'][normalize-space()='Cancel']")
	WebElement cancelBtnInAP;
	
	public void clickOnBillings() {
		billings.click();
	}
	
	public void clickOnInvoices() {
		invoices.click();
	}
	
	public void clickOnNewInvoice() {
		newInvoice.click();
	}
	
	public void clickOnBackButton() {
		backButton.click();
	}
	
	public void clickOnPatientDropdown() {
		patientDropdown.click();
	}
	
	public void selectPatient(String patient) {
		txtSelectPatient.sendKeys(patient);
		txtSelectPatient.sendKeys(Keys.ENTER);
	}
	
	public void setDiscount(String discount) {
		txtDiscount.sendKeys(discount);
		txtDiscount.sendKeys(Keys.ENTER);
	}
	
	public void changeDiscount(String discount) {
		txtDiscount.clear();
		txtDiscount.sendKeys(discount);
		txtDiscount.sendKeys(Keys.ENTER);
	}
	
	public void clickOnStatus() {
		statusDropdown.click();
	}
	
	public void setPaidStatus() {
		txtPaidStatus.click();
	}
	
	public void setPendingStatus() {
		txtPendingStatus.click();
	}
	public void clickOnAddButton() {
		addButton.click();
	}
	
	public void clickOnAccountDropdown() {
		account.click();
	}
	
	public void setAccountName(String account) {
		txtSelectAccount.sendKeys(account);
		txtSelectAccount.sendKeys(Keys.ENTER);
	}
	
	public void setDescription(String description) {
		txtDescription.sendKeys(description);
		
	}
	
	public void changeDescription(String description) {
		txtDescription.clear();
		txtDescription.sendKeys(description);
	}
	
	public void setQuantity(String qty) {
		txtQty.sendKeys(qty);
	}
	
	public void changeQuantity(String qty) {
		txtQty.clear();
		txtQty.sendKeys(qty);
	}
	
	public void setPrice(String price) {
		txtPrice.sendKeys(price);
	}
	
	public void changePrice(String price) {
		txtPrice.clear();
		txtPrice.sendKeys(price);
	}
	
	public void clickOnDeleteButton() {
		actionDeleteButton.click();
	}
	
	public void clickOnSaveButton() {
	saveButton.submit();	
	}
	
	public void clickOnCancelButton() {
		cancelButton.click();
	}
	
	public void takeInvoicePrintout() throws InterruptedException {
		
		/*
				String mainWindow = ldriver.getWindowHandle();

				
				String location=System.getProperty("user.dir")+"\\Downloads\\";
				HashMap preferences=new HashMap();
				preferences.put("download.default_directory", location);
				preferences.put("plugins.always_open_pdf_externally", true); // for pdf download
				
				ChromeOptions options=new ChromeOptions();
				options.setExperimentalOption("prefs", preferences);
				
				ldriver = new ChromeDriver(options);
				ldriver.switchTo().window(mainWindow);
				printInvoiceButton.click();
				Actions a=new Actions(ldriver);
				Thread.sleep(5000);
				a.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).perform();
				Thread.sleep(5000);
				ldriver.switchTo().window(window);
				Thread.sleep(5000);
				a.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).perform();
				*/
			}
	
	public void clickOnDeleteInvoice() {
		deleteButton.click();
	}
	
	public void clickOnYesDelete() {
		yes_DeleteButton.click();
	}
	
	public void clickOnNoCancel() {
		no_CancelButton.click();
	}
	
	public void clickOnEdit() {
		editButton.click();
	}
		
	public void clickOnAdvancePayments() {
		advancePayments.click();
	}
	
	public void clickOnNewAdvancePaymentsButton() {
		newAdvancePayment.click();
	}

	public void clickOnPatientDrpInAP() {
		patientInAPDrp.click();
	}
	
	public void setPatientInAP(String patient) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selectPatientInAP));
//		element.sendKeys(patient);
//		element.sendKeys(Keys.ENTER);
		selectPatientInAP.sendKeys(patient);
		selectPatientInAP.sendKeys(Keys.ENTER);
	}
	
	public void setAmount(String amount) {
		txtAmount.sendKeys(amount);
		txtAmount.sendKeys(Keys.ENTER);
	}
	
//	public void clickOnSaveBtnInAP() {
//		saveBtnInAP.click();
//	}
	
	public void clickOnCancelBtnInAP() {
		cancelBtnInAP.click();
	}

}
		
		
		

		
	
	
	
	
	
	
	
	
	

