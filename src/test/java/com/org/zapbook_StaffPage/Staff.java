package com.org.zapbook_StaffPage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class Staff {

	@FindBy(xpath = "//li[normalize-space()='Staff']//ion-icon[@role='img']")
	private WebElement Staff_ln;

	@FindBy(xpath = "//ion-button[normalize-space()='New Employee']")
	private WebElement New_empolyee;

	@FindBy(xpath = "//ion-text[@class='upload-container ios hydrated']")
	private WebElement img_ln;

	@FindBy(xpath = "//input[@placeholder='Full Name']")
	private WebElement fullname_ln;

	@FindBy(xpath = "//input[@max='2005-10-25']")
	private WebElement dob;

	@FindBy(xpath = "//ion-input[@type='email']")
	private WebElement email_ln;

	@FindBy(xpath = "//input[@placeholder='Enter phone']")
	private WebElement phon_ln;

	@FindBy(xpath = "//input[@placeholder='Enter position']")
	private WebElement position_ln;

	@FindBy(xpath = "//ion-select[@placeholder='Select user role']")
	private WebElement Roll_ln;

	@FindBy(xpath = "//ion-item[2]//ion-radio[1]")
	private WebElement selectroll;

	@FindBy(xpath = "//ion-select[@placeholder='Select job time']")
	private WebElement selectjob;

	@FindBy(xpath = "//ion-item[2]//ion-radio[1]")
	private WebElement parttime;

	@FindBy(xpath = "//ion-select[@placeholder='Select location']")
	private WebElement location;

	@FindBy(xpath = "//ion-radio[@role='radio']")
	private WebElement indiranagar;

	@FindBy(xpath = "//textarea[@placeholder='Enter address']")
	private WebElement Address_ln;

	private WebUtil util;

	public Staff(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void StaffLink() {
		util.click(Staff_ln, "staff");

	}

	public void NewEmpolyee() {
		util.click(New_empolyee, "empolyee");

	}

	public void Image() {
         util.actionSendkey(img_ln, "img", "C:\\Users\\hp\\Downloads\\images (1).jpg");
	}

	public void Full_name() {
		util.click(fullname_ln, "fullname");
		util.sendkeys(fullname_ln, "fullname", "Joahn Smith");

	}

	public void DateOfBirth() {
		util.sendkeys(dob, "dateofbirth", "28-5-2003");
	}

	public void Email() {
	//	util.actionClick(email_ln, "email");
		util.actionSendkey(email_ln, "email", "john@gmail.com");

	}

	public void Phone() {
		util.click(phon_ln, "phone");
		util.sendkeys(phon_ln, "phone", "(789)653-2546");

	}

	public void Position() {
		util.actionClick(position_ln, "positionlink");
		util.sendkeys(position_ln, "positionlink", "Tester");

	}

	public void Roll() {
		util.click(Roll_ln, "roll");
	}

	public void Select_roll() {
		util.click(selectroll, "roll link");
	}

	public void SelectJob() {
		util.actionClick(selectjob, "jobtype");

	}

	public void PartTime() {
		util.click(parttime, "part_time");
	}

	public void SelectLocation() {
		util.click(location, "locationlink");

	}

	public void Location() {
		util.click(indiranagar, "locationLN");
	}

	public void Address() {
		util.sendkeys(Address_ln, "address", " Fort Walton Beach");
	}

}
