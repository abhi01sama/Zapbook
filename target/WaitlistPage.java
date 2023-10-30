package com.org.Zapbook.Waitlistpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class WaitlistPage {
	
	
	
	
	
	@FindBy(xpath = "//li[@class='active']")
	private WebElement Waitlist;
	
	
	private WebUtil util;

	public WaitlistPage(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void Waitlist_ln() {
		util.click(Waitlist,"waitlist_ln");
	}
	
}
