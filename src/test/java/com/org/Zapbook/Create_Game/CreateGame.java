package com.org.Zapbook.Create_Game;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class CreateGame {

	@FindBy(xpath = "//ion-button[@routerlink='/settings']")
	private WebElement Setting_BT;

	@FindBy(xpath = "//ion-segment-button[@value='Game']")
	private WebElement Game_BT;

	@FindBy(xpath = "//ion-select[@placeholder='Select']")
	private WebElement Select_dropdown;

	@FindBy(xpath = "//ion-button[@type='submit']")
	private WebElement Save_BT;

	@FindBy(xpath = "//ion-segment-button[@value='Notification']")
	private WebElement Notification;

	@FindBy(xpath = "//ion-button[normalize-space()='New Notifications']")
	private WebElement New_notification;

	@FindBy(xpath = "//input[@placeholder='Enter here']")
	private WebElement Notification_Name;

	@FindBy(xpath = "//textarea[@placeholder='Enter description']")
	private WebElement SMS_Discription;

	@FindBy(xpath = "//body//app-root//ion-col[@class='ios hydrated']//ion-col[@class='ios hydrated']//ion-col[@class='ios hydrated']//ion-col[1]")
	private WebElement Select_Dropdown;

	@FindBy(xpath = " //ion-label[@id='ion-rb-0-lbl']")
	private WebElement firstDay;

	@FindBy(xpath = "//body//app-root//ion-col[@class='ios hydrated']//ion-col[@class='ios hydrated']//ion-col[@class='ios hydrated']//ion-col[2]")
	private WebElement Starting_dropdown;

	@FindBy(xpath = "//ion-label[@id='ion-rb-4-lbl']")
	private WebElement After_Start;

	@FindBy(xpath = "//ion-select[@placeholder='Select Booking Status']")
	private WebElement booking_status;

	@FindBy(xpath = "//ion-label[@id='ion-rb-7-lbl']")
	private WebElement paid_ln;

	@FindBy(xpath = "//ion-select[@placeholder='Select Bookable Items']")
	private WebElement Bookable_ln;

	@FindBy(xpath = "//ion-label[@id='ion-rb-9-lbl']")
	private WebElement Bookable_pro;

	@FindBy(xpath = "//ion-button[@type='submit']")
	private WebElement Submit_BT;

	private WebUtil util;

	public CreateGame(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void SettingOfBooking() {
		util.click(Setting_BT, "setting");
	}

	public void Game_link() {
		util.actionClick(Game_BT, "game");
	}

	public void DropDown() {
		util.checkElement(Select_dropdown, "dropdown");
	}

	public void Save() {
		util.checkElement(Save_BT, "save");
	}

	public void Notification_ln() {
		util.actionClick(Notification, "Notificationlink");
	}

	public void New_Notification() {
		util.click(New_notification, "new_notification");
	}

	public void EnterNotification() {
		util.click(Notification_Name, "enter_notification");
		util.sendkeys(Notification_Name, "enter_notification", "SMS Notification");
	}

	public void SMSDiscription() {
		util.actionClick(SMS_Discription, "discription");
		util.sendkeys(SMS_Discription, "discription", "This is SMS Discription");
	}

	public void DropdownOFday() {
		util.actionClick(Select_Dropdown, "dropdown");

	}

	public void Firsy_day() {
		util.actionClick(firstDay, "1 Day");
	}

	public void StartingDropdown() {
		util.click(Starting_dropdown, "start");
	}

	public void AfterStart() {
		util.actionClick(After_Start, "after");
	}

	public void BookingStatus() {
		util.click(booking_status, "bookingST");
	}

	public void Paid() {
		util.actionClick(paid_ln, "paidlink");

	}

	public void Bookable() {
		util.click(Bookable_ln, "bookiable");
	}

	public void BookanleProduct() {
		util.actionClick(Bookable_pro, "bookableProduct");
	}

	public void Submit() {
		util.click(Submit_BT, "submit");
	}
}
