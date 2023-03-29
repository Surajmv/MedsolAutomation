package com.medsol.testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.medsol.pageobjects.BillingsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_Billing_Invoice_Edit extends BaseClass {

	Readconfig config=new Readconfig();
	public String patient=config.getPatientName();
	public String discount=config.getDiscount();
	public String account=config.getAccountName();
	public String description=config.getDescription();
	public String quantity=config.getQuantity();
	public String price=config.getPrice();
	
	@Test
	public void editInvoice() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(2000);
		lp.clickOnLoginSubmit();
		
		BillingsPage bp=new BillingsPage(driver);
		bp.clickOnBillings();
		Thread.sleep(2000);
		bp.clickOnInvoices();
		Thread.sleep(2000);
		bp.clickOnEdit();
		Thread.sleep(2000);
		bp.clickOnPatientDropdown();
		Thread.sleep(2000);
		bp.selectPatient(patient);
		Thread.sleep(2000);
		bp.changeDiscount(discount);
		Thread.sleep(1000);
		bp.clickOnStatus();
		Thread.sleep(1000);
		bp.setPaidStatus();
		//bp.setPendingStatus();
		Thread.sleep(1000);
		//bp.clickOnAddButton();
		//Thread.sleep(2000);
		bp.clickOnAccountDropdown();
		Thread.sleep(1000);
		bp.setAccountName(account);
		Thread.sleep(1000);
		bp.changeDescription(description);
		Thread.sleep(1000);
		bp.changeQuantity(quantity);
		Thread.sleep(1000);
		bp.changePrice(price);
		Thread.sleep(1000);
		bp.clickOnSaveButton();
		
	}
	
}
