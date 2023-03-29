package com.medsol.testcases;
import org.testng.annotations.Test;
import com.medsol.pageobjects.BillingsPage;
import com.medsol.pageobjects.LoginPage;
import com.medsol.utilities.Readconfig;

public class TC_Billing_Invoice_Created extends BaseClass {

	Readconfig rc=new Readconfig();
	public String patient=rc.getPatientName();
	public String discount=rc.getDiscount();
	public String account=rc.getAccountName();
	public String description=rc.getDescription();
	public String quantity=rc.getQuantity();
	public String price=rc.getPrice();
	
	
	@Test
	public void creatingNewInvoice() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.clickOnLogin();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickOnLoginSubmit();
		
		BillingsPage bp=new BillingsPage(driver);
		bp.clickOnBillings();
		Thread.sleep(2000);
		bp.clickOnInvoices();
		Thread.sleep(2000);
		bp.clickOnNewInvoice();
		Thread.sleep(2000);
		bp.clickOnPatientDropdown();
		//Thread.sleep(1000);
		bp.selectPatient(patient);
		//Thread.sleep(1000);
		bp.setDiscount(discount);
		//Thread.sleep(1000);
		bp.clickOnStatus();
		//Thread.sleep(1000);
		bp.setPaidStatus();
		//Thread.sleep(5000);
		bp.clickOnAccountDropdown();
		//Thread.sleep(5000);
		bp.setAccountName(account);
		//Thread.sleep(1000);
		bp.setDescription(description);
		//Thread.sleep(1000);
		bp.setQuantity(quantity);
		//Thread.sleep(1000);
		bp.setPrice(price);
		//Thread.sleep(5000);
		bp.clickOnSaveButton();
		Thread.sleep(1000);
		//bp.clickOnCancelButton();
			
		bp.takeInvoicePrintout();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
