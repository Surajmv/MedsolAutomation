package com.medsol.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		/*
		File img = new File("./images/profile.png");

		try {
			FileInputStream fi = new FileInputStream(img);
			pro = new Properties();
			pro.load(fi);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		*/
	}

	public String getApplicationURL() {
		String baseurl = pro.getProperty("baseurl");
		return baseurl;
	}

	public String getUserName() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getIEPath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}

	public String getFirstName() {
		String firstname = pro.getProperty("firstname");
		return firstname;
	}

	public String getLastName() {
		String lastname = pro.getProperty("lastname");
		return lastname;
	}

	public String getEmail() {
		String email = pro.getProperty("email");
		return email;
	}

	public String getPhoneNumber() {
		String phonenumber = pro.getProperty("phonenumber");
		return phonenumber;
	}

	public String getBloodGroup() {
		String bloodgroup = pro.getProperty("bloodgroup");
		return bloodgroup;
	}

	public String getDesignation() {
		String designation = pro.getProperty("designation");
		return designation;
	}

	public String getQualification() {
		String qualification = pro.getProperty("qualification");
		return qualification;
	}

	public String getDate() {
		String date = pro.getProperty("date");
		return date;
	}

	public String getMonth() {
		String month = pro.getProperty("month");
		return month;
	}

	public String getYear() {
		String year = pro.getProperty("year");
		return year;
	}

	public String getPassword1() {
		String password1 = pro.getProperty("password1");
		return password1;
	}

	public String getConfirmPassword() {
		String confirmpassword = pro.getProperty("confirmpassword");
		return confirmpassword;
	}

	public String getAddress1() {
		String address1 = pro.getProperty("address1");
		return address1;
	}

	public String getAddress2() {
		String address2 = pro.getProperty("address2");
		return address2;
	}

	public String getCity() {
		String city = pro.getProperty("city");
		return city;
	}

	public String getZipCode() {
		String zip = pro.getProperty("zip");
		return zip;
	}

	public String getPatientName() {
		String patient = pro.getProperty("patient");
		return patient;
	}

	public String getDiscount() {
		String discount = pro.getProperty("discount");
		return discount;
	}

	public String getAccountName() {
		String account = pro.getProperty("account");
		return account;
	}

	public String getDescription() {
		String description = pro.getProperty("description");
		return description;
	}

	public String getQuantity() {
		String qty = pro.getProperty("quantity");
		return qty;
	}

	public String getPrice() {
		String price = pro.getProperty("price");
		return price;
	}

	public String getAmount() {
		String amount = pro.getProperty("amount");
		return amount;
	}

	public String getSearch() {
		String searchbox = pro.getProperty("search");
		return searchbox;
	}

	public String getCase() {
		String selectCase = pro.getProperty("case1");
		return selectCase;
	}

	public String getHour() {
		String hour = pro.getProperty("hour");
		return hour;
	}

	public String getCaseDescription() {
		String descr = pro.getProperty("description");
		return descr;

	}

	public String getBedType() {
		String bedType = pro.getProperty("bed");
		return bedType;
	}

	public String getTitle() {
		String title = pro.getProperty("title");
		return title;
	}

	public String getDocumentType() {
		String docType = pro.getProperty("documentType");
		return docType;
	}

	public String getProfileImage() {
		String image = pro.getProperty("image");
		return image;
	}

	public String getNotes() {
		String notes = pro.getProperty("notes");
		return notes;
	}
}
