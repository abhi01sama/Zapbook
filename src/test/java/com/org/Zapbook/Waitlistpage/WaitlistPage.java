package com.org.Zapbook.Waitlistpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class WaitlistPage {

	@FindBy(xpath = "//li[normalize-space()='Waitlist']//ion-icon[@role='img']")
	private WebElement Waitlist_ln;

	@FindBy(xpath = "//ion-button[normalize-space()='New Entry']")
	private WebElement New_entry;

	@FindBy(xpath = "//ion-input[@placeholder='First Name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@placeholder='Enter email']")
	private WebElement email;

	@FindBy(xpath = "//input[@placeholder='Enter phone']")
	private WebElement phone;

	@FindBy(xpath = "//ion-range[@id='ion-r-0']")
	private WebElement slider;

	private WebUtil util;

	public WaitlistPage(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void WaitList() {
		util.click(Waitlist_ln, "waitlist");
	}

	public void NewEntry() {
		util.click(New_entry, "newEntry");
	}

	public void FirstName() {
		util.actionClick(firstname, "first");
		util.actionSendkey(firstname, "first", "james");
	}

	public void Lastname() {
		util.click(lastname, "last");
		util.sendkeys(lastname, "last", "Smith");
	}

	public void Email() {
		util.click(email, "emailBT");
		util.sendkeys(email, "emailBT", "james@gamil.com");
	}

	public void Phone() {
		util.click(phone, "phonln");
		util.sendkeys(phone, "phonln", "8578458932");
	}

	public void Slider() {
		util.dragAndDrop(slider, 1, 6, "slider_ln");
		
	}
}
