package com.org.Zapbook.SchedulePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class Schedulepage {
	
	@FindBy(xpath = "//app-schedule-calendar[@class='ion-page can-go-back']//li[@class='active'][normalize-space()='Schedule']//ion-icon[@role='img']")
	private WebElement Schedul_ln;
	
	@FindBy(xpath = "//ion-button[normalize-space()='New Booking']")
	private WebElement  newbooking;
	
	private WebUtil util;

	public Schedulepage(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}
	 public void ScheduleLink() {
		util.actionClick(Schedul_ln, "sedule");
	}
	
	public void Newbooking() {
	 util.click(Schedul_ln, "newbook");
	}

}
