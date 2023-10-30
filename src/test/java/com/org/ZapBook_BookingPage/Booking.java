package com.org.ZapBook_BookingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class Booking {

	@FindBy(xpath = "//ion-button[@class='btn-blue-icon ios button button-solid ion-activatable ion-focusable hydrated']")
	private WebElement Bookinglink;

	@FindBy(xpath = "//ion-select[@formcontrolname='location_id']")
	private WebElement location_ln;

	@FindBy(xpath = "//ion-radio-group[@role='radiogroup']")
	private WebElement selectlocation;

	@FindBy(xpath = "//ion-select[@formcontrolname='bookable_id']")
	private WebElement experience;

	@FindBy(xpath = "//ion-radio[@role='radio']")
	private WebElement selectex;

	@FindBy(xpath = "//ion-range[@id='ion-r-1']")
	private WebElement slider;

	@FindBy(xpath = "//input[@min='2023-10-26']")
	private WebElement calender;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement pop_up;

	@FindBy(xpath = "//ion-item[1]//ion-radio[1]")
	private WebElement phone;

	@FindBy(xpath = "//ion-select[@aria-label='Select']")
	private WebElement drop;

	@FindBy(xpath = "//ion-button[@type='button']")
	private WebElement submit;

	@FindBy(xpath = "//ion-select[@aria-label='Select timeslot available']")
	private WebElement time;

	@FindBy(xpath = "//ion-radio[@role='radio']")
	private WebElement selecttime;

	@FindBy(xpath = "//ion-icon[@name='pencil']")
	private WebElement pencil_Ic;

	@FindBy(xpath = "//ion-toggle[@aria-checked='false']")
	private WebElement price;

	@FindBy(xpath = "//input[@name='ion-input-6']")
	private WebElement discount;

	@FindBy(xpath = "//ion-button[@class='ios button button-block button-rounded button-solid ion-activatable ion-focusable hydrated']")
	private WebElement save_BT;

	@FindBy(xpath = "//ion-button[@class='ios button button-round button-solid ion-activatable ion-focusable hydrated']")
	private WebElement continue_bt;

	@FindBy(xpath = "//ion-input[@formcontrolname='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//ion-input[@formcontrolname='last_name']")
	private WebElement lastname;

	private WebUtil util;

	public Booking(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void Booking_ln() {
		util.click(Bookinglink, "bookinglink");

	}

	public void Location() {
		util.click(location_ln, "location");

	}

	public void SelectLocation() {
		util.click(selectlocation, "location");
	}

	public void Experience() {
		util.click(experience, "experi");
	}

	public void Select_experience() {
		util.click(selectex, "selctecperience");
	}

	public void Slider() {
		util.click(slider, "s");
		util.dragAndDrop(slider, 2, 5, "s");
	}

	public void Calender() {
		util.sendkeys(calender, "calen", "25-10-2023");
	}

	public void Drop() {
		util.scrollToElement(drop);
		util.actionClick(drop, "d");
	}

	public void Pup_up() {
		util.click(pop_up, "popup_BT");
	}

	public void Phone() {
		util.click(phone, "phone_ln");
	}

	public void Time() {
		util.click(time, "Timeslot");
	}

	public void Selecttime() {
		util.click(selecttime, "tem");
	}

	public void Submit() {
		util.click(submit, "continue");
	}

	public void Pencil() {
		util.click(pencil_Ic, "edit");
	}

	public void PriceOverride() {
		util.click(price, "prce");
	}

	public void DiscountValue() {
		util.click(discount, "g");
		util.sendkeys(discount, "dis", "51%");
	}

	public void Save() {
		util.click(save_BT, "save");
	}

	public void Continue() {
		util.click(continue_bt, "conti");
	}

	public void Firstname() {
		util.click(firstname, "first");
		util.sendkeys(firstname, "first", "jems");
	}

	public void Lastname() {
		util.actionSendkey(lastname, "last", "yesh");
	}

}
