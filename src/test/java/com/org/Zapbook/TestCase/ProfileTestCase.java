package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.Zapbook.profilePage.Profile_Page;

public class ProfileTestCase extends BaseTest{
	
	
	@Test
	public void profileVarification() throws InterruptedException {
		Profile_Page  prof = new Profile_Page(util);
		util.implicitWait(10);
		prof.Profile();
		Thread.sleep(4000);
		prof.Edit();
		
	}
	
	

	
}
