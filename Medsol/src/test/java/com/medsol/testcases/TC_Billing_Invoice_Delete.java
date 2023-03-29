package com.medsol.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.medsol.pageobjects.BillingsPage;
import com.medsol.pageobjects.LoginPage;

public class TC_Billing_Invoice_Delete extends BaseClass{

	@Test
	public void deleteExistingInvoice() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		BillingsPage bp=new BillingsPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bp.clickOnBillings();
		Thread.sleep(2000);
		bp.clickOnInvoices();
		Thread.sleep(2000);
		bp.clickOnDeleteInvoice();
		Thread.sleep(2000);
		bp.clickOnYesDelete();
		
		
	}
}
