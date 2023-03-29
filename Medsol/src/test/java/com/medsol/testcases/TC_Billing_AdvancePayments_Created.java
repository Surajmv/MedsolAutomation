package com.medsol.testcases;

import org.testng.annotations.Test;

import com.medsol.pageobjects.BillingsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_Billing_AdvancePayments_Created extends BaseClass {

	Readconfig config=new Readconfig();
	public String patient=config.getPatientName();
	public String amount=config.getAmount();
	
	
	@Test
	public void creatingNewAdvancePayment() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(2000);
		lp.clickOnLoginSubmit();
		
		BillingsPage bp=new BillingsPage(driver);
		bp.clickOnBillings();
		Thread.sleep(2000);
		bp.clickOnAdvancePayments();
		Thread.sleep(2000);
		bp.clickOnNewAdvancePaymentsButton();
		Thread.sleep(2000);
		bp.clickOnPatientDrpInAP();
		Thread.sleep(2000);
		bp.setPatientInAP(patient);
		Thread.sleep(2000);
		bp.setAmount(amount);
		Thread.sleep(2000);
		
		
		bp.clickOnCancelBtnInAP();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
