package com.org.Zapbook.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class SettingPage {

	

	@FindBy(xpath = "")
	private WebElement Sign_IN;
	
	
	private WebUtil util;

	public SettingPage(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void EmailBOX() {
	//	util.click(,"user_email");
	}
	
	
	
	
	
}
