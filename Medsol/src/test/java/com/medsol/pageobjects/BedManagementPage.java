package com.medsol.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BedManagementPage {

	WebDriver ldriver;
	public BedManagementPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[text()='Bed Management']")
	WebElement bedManagement;

	@FindBy(xpath = "//a[@href='http://cls-medsol.in/bed-assigns']")
	WebElement bedAssigns;

	@FindBy(xpath = "//input[@name='search']")
	WebElement txtSearchBox;

	@FindBy(id = "bedAssignFilterBtn")
	WebElement filterButton;

	@FindBy(xpath = "//div[@class='p-5']//span[@class='select2-selection select2-selection--single']")
	WebElement statusBox;

	@FindBy(xpath = "//li[text()='All']")
	WebElement allButton;

	@FindBy(xpath = "//li[text()='Active']")
	WebElement activeButton;

	@FindBy(xpath = "//li[text()='Deactive']")
	WebElement deactiveButton;

	@FindBy(xpath = "//button[text()='Reset']")
	WebElement resetButton;

	@FindBy(xpath = "//div[@class='dropdown d-flex align-items-center me-4 me-md-5']//button[@id='dropdownMenuButton1']")
	WebElement actionsDropdown;

	@FindBy(xpath = "//a[normalize-space()='Bed Status']")
	WebElement bedStatusLink;

	@FindBy(xpath = "//a[text()='New Bed Assign']")
	WebElement newBedAssignLink;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']//span[@id='select2-caseId-container']")
	WebElement selectCaseDropdown;

	@FindBy(xpath = "//li[text()='Select Case']")
	WebElement txtSelectCase;
	
	@FindBy(xpath="//span[text()='Select Bed']")
	WebElement bedDropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement txtBed;

	@FindBy(id = "BedAssignDate")
	WebElement bedAssignDate;

	@FindBy(xpath = "//input[@class='numInput cur-year']")
	WebElement txtYear;

	@FindBy(xpath = "//select[@class='flatpickr-monthDropdown-months']")
	WebElement monthDropdown;

	@FindBy(xpath = "//span[@class='flatpickr-day']")
	List<WebElement> txtAllDates;

	@FindBy(xpath = "//input[@class='numInput flatpickr-hour']")
	WebElement txtHour;

	@FindBy(xpath = "//span[@class='flatpickr-am-pm']")
	WebElement txtAm;

	@FindBy(id = "BedAssignDescription")
	WebElement txtDescription;

	@FindBy(name = "status")
	WebElement statusButton;

	@FindBy(id = "BedAssignSaveBtn")
	WebElement BedAssignSaveBtn;

	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelButton;

	public void clickOnBedManagement() {
		bedManagement.click();
	}

	public void clickOnBedAssigns() {
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(bedAssigns)).click();
		//bedAssigns.click();
	}

	public void clickOnSearchBox(String searchbox) {
		
//		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(txtSearchBox)).click();
		txtSearchBox.click();
		txtSearchBox.sendKeys(searchbox);
		
	}

	public void clickOnFilterButton() {
		filterButton.click();
	}

	public void clickOnStatusDropdown() {
		statusBox.click();
	}

	public void clickOnAllButton() {
		allButton.click();
	}

	public void clickOnActiveButton() {
		activeButton.click();
	}

	public void clickOnDeactiveButton() {
		deactiveButton.click();
	}

	public void clickOnResetButton() {
		resetButton.click();
	}

	public void clickOnActionsDropdown() {
		actionsDropdown.click();
	}

	public void clickOnBedStatus() {
		bedStatusLink.click();
	}

	public void clickOnNewBedAssign() {
		newBedAssignLink.click();
	}

	public void clickOnSelectCaseDropdown() {
		selectCaseDropdown.click();
	}

	public void setSelectCase() {
		txtSelectCase.click();
	}

	public void clickOnBedDropdown() {
		bedDropdown.click();
	}
	
	public void setBedType(String bed) {
		txtBed.sendKeys(bed);
		txtBed.sendKeys(Keys.ENTER);
	}
	
	
	public void setAssignDate(String year, String month, String date, String time) {
		bedAssignDate.click();
		txtYear.click();
		txtYear.sendKeys(year);
		Select s = new Select(monthDropdown);
		s.selectByVisibleText(month);
		List<WebElement> allDates = txtAllDates;
		for (WebElement ele : allDates) {
			String dt = ele.getText();
			if (dt.equals(date)) {
				ele.click();
				break;
			}
		}

		txtHour.clear();
		txtHour.sendKeys(time);
		txtHour.sendKeys(Keys.ENTER);
		//txtAm.click();
	}

	public void setCaseDescription(String description) {
		txtDescription.sendKeys(description);
	}

	public void clickOnStatusToInactive() {
		statusButton.click();
	}

	public void clickOnSaveButton() {
		BedAssignSaveBtn.click();
	}

	public void clickOnCancelButton() {
		cancelButton.click();
	}

}
