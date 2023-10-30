package com.org.ZapBook_BaseConfig;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.org.Zapbook.LanePage.LanePage;
import com.org.Zapbook.LoginPage.LoginPage;
import com.org.Zapbook.WebUtillayer.WebUtil;

public class BaseTest {
	protected WebUtil util;
	protected List<Map<String, String>> listdata;
	protected Map<String, String> mapData;

	@BeforeClass

	public void initDriver() {
		util = new WebUtil();
		util.extentReport("ZapBook");
		util.openBroswer("chrome");
		util.openURl("https://app.zap.betaplanets.com");
		util.maximize();
	}

	@BeforeMethod

	public void login(Method m) throws InterruptedException {
		String testName = m.getName();
		util.createTestCase(testName);
		LoginPage log = new LoginPage(util);
		log.EmailBOX();
		Thread.sleep(2000);
		log.PasswordBOX();
		Thread.sleep(2000);
		log.SignINButton();

	}

//	@AfterMethod
//	public void name() {
//		LoginPage log = new LoginPage(util);
//		log.log();
//		util.implicitWait(10);
//		log.logout();
//
//	}

}
