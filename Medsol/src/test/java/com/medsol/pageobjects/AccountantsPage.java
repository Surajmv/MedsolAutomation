package com.medsol.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountantsPage {

	WebDriver driver;
	
	public AccountantsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Accountants']")
	WebElement accountantsButton;
	
	@FindBy(xpath="//a[text()='New Accountant']")
	WebElement newAccountantButton;
	
	@FindBy(id="first_name")
	WebElement txtFirstName;
	
	@FindBy(id="last_name")
	WebElement txtLastName;
	
	@FindBy(id="createAccountantEmail")
	WebElement txtEmail;
	
	@FindBy(xpath="//div[@class='iti__flag-container']")
	WebElement selectCountryCodeDropdown;
	
	@FindBy(xpath="//span[text()='India (भारत)']")
	WebElement india;
	
	@FindBy(id="phoneNumber")
	WebElement txtPhoneNumber;
	
	@FindBy(id="select2-bloodGroup-container")
	WebElement bloodGroupDropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement txtBloodGroup;
	
	@FindBy(id="designation")
	WebElement txtDesignation;
	
	@FindBy(id="qualification")
	WebElement txtQualification;
	
	@FindBy(id="birthDate")
	WebElement txtdob;
	
	@FindBy(xpath="//input[@aria-label='Year']")
	WebElement txtYearInDob;
	
	@FindBy(xpath="//select[@aria-label='Month']")
	WebElement txtMonthInDob;
	
	@FindBy(xpath="//span[@class='flatpickr-day']")
	List<WebElement> txtDateInDob;
	
	@FindBy(id="accountantGenderMale")
	WebElement maleGender;
	
	@FindBy(name="status")
	WebElement status;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="password_confirmation")
	WebElement txtConfirmPassword;
	
	@FindBy(id="profileImageIcon")
	WebElement profileImg;
	
	@FindBy(id="address1")
	WebElement txtAddress1;
	
	@FindBy(id="address2")
	WebElement txtAddress2;
	
	@FindBy(id="city")
	WebElement txtCity;
	
	@FindBy(id="zip")
	WebElement txtZip;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement saveButton;
	
	@FindBy(xpath="//a[text()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath="//a[text()='Back']")
	WebElement backButton;
	
	public void clickOnAccountantsButton() {
		accountantsButton.click();
	}
	
	public void clickOnNewAccountantButton() {
		newAccountantButton.click();
	}
	
	public void setFirstName(String firstname) {
		txtFirstName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		txtLastName.sendKeys(lastname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void clickOnCountryCode() {
		selectCountryCodeDropdown.click();
	}
	
	public void setCountryCode() {
		india.click();
	}
	
	public void setPhoneNumber(String phonenumber) {
		txtPhoneNumber.sendKeys(phonenumber);
	}
	
	public void clickOnBloodGroupDropDown() {
		bloodGroupDropdown.click();
	}
	
	public void setBloodGroup(String bloodgroup) {
		txtBloodGroup.sendKeys(bloodgroup);
		txtBloodGroup.sendKeys(Keys.ENTER);
	}
	
	public void setDesignation(String designation) {
		txtDesignation.sendKeys(designation);
	}
	
	public void setQualification(String qualification) {
		txtQualification.sendKeys(qualification);
	}
	
	public void setDob(String year,String month,String date) {
		txtdob.click();
		txtYearInDob.click();
		txtYearInDob.sendKeys(year);
		Select month_drp=new Select(txtMonthInDob);
		month_drp.selectByVisibleText(month);
		List<WebElement> allDate=txtDateInDob;
		for(WebElement ele:allDate) {
			String dt=ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
	}
	
	public void clickOnMaleGender() {
		maleGender.click();
	}
	
	public void clickOnStatus() {
		status.click();
	}
	
	public void setAccPassword(String password1) {
		txtPassword.sendKeys(password1);
	}
	
	public void setConfirmPassword(String confirmpassword) {
		txtConfirmPassword.sendKeys(confirmpassword);
	}
	
	public void clickOnProfileImage() {
		profileImg.click();
	}
	
	public void setAddress1(String address1) {
		txtAddress1.sendKeys(address1);
	}
	
	public void setAddress2(String address2) {
		txtAddress2.sendKeys(address2);
	}
	
	public void setCity(String city) {
		txtCity.sendKeys(city);
	}
	
	public void setZip(String zip) {
		txtZip.sendKeys(zip);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public void clickOnCancelButton() {
		cancelButton.click();
	}
	
	public void clickOnBackButton() {
		backButton.click();
	}
	
	
	
	
}
