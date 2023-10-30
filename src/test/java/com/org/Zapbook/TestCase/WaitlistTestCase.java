package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.Zapbook.Waitlistpage.WaitlistPage;

public class WaitlistTestCase extends BaseTest {

	@Test

	public void WaitlistVarification() throws InterruptedException {

		WaitlistPage wait = new WaitlistPage(util);
		util.implicitWait(10);
		wait.WaitList();
		Thread.sleep(2000);
		wait.NewEntry();
		Thread.sleep(2000);
		wait.FirstName();
		Thread.sleep(2000);
		wait.Lastname();   
		Thread.sleep(2000);
		wait.Email();
		Thread.sleep(2000);
		wait.Phone();
		Thread.sleep(2000);
       wait.Slider();
       System.out.println("In this module when we add any new entery than all the details boxes are not fill-up");
	}

}
