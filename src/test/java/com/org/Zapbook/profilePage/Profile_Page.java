package com.org.Zapbook.profilePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class Profile_Page {
	
	@FindBy(xpath ="//ion-avatar[@class='md hydrated']//img")
	private WebElement profile;
	
	@FindBy(xpath = "//ion-icon[@name='create-outline']")
	private WebElement edit_bt;
	
	
	
	private WebUtil util;

	public Profile_Page(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);
	}
	public void Profile() {
		util.click(profile,"pro");
	}
	public void Edit() {
		util.sendkeys(edit_bt, "file","‪‪‪C:\\Users\\hp\\images (1).jpg");
	}

	
	
	
	
	
	
	
}
