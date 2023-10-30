package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.Zapbook.WebUtillayer.WebUtil;

public class GameUrl_TestCase extends BaseTest {

	protected WebUtil util;

	@Test

	public void Urlgame() {
		WebUtil util = new WebUtil();
		util.extentReport("ZapBook");
		util.openBroswer("chrome");
		util.openURl("https://app.zap.betaplanets.com");
		util.maximize();
	}

}
