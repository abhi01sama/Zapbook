package com.org.Zapbook.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class LoginPage {

	@FindBy(xpath = "//input[@placeholder='Enter email']")
	private WebElement SignIN_eamil;

	@FindBy(xpath = "//input[@placeholder='Enter password']")
	private WebElement User_Pass;

	@FindBy(xpath = "//ion-button['SIGN IN']")
	private WebElement Sign_IN;

	@FindBy(xpath = "//ion-button[@class='hidden-mobile md button button-clear in-toolbar ion-activatable ion-focusable hydrated']//ion-icon[@name='log-out-outline']")
	private WebElement log;

	@FindBy(xpath = "//button[@class='alert-button ion-focusable ion-activatable sc-ion-alert-ios']")
	private WebElement logout;

	private WebUtil util;

	public LoginPage(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void EmailBOX() {
		util.click(SignIN_eamil, "user_email");
		util.sendkeys(SignIN_eamil, "user_email", "testerjamtech@gmail.com");
	}

	public void PasswordBOX() {
		util.click(User_Pass, "Password");
		util.sendkeys(User_Pass, "Password", "sR123456");
	}

	public void SignINButton() {
		util.click(Sign_IN, "sign");

	}

	public void log() {
		util.click(log, "logo");
	}

	public void logout() {
		util.actionClick(logout, "Logout");

	}

}
