package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.Zapbook.LanePage.LanePage;

public class LaneTest_Case extends BaseTest {
	@Test
	public void Lane() throws InterruptedException {
		LanePage lan = new LanePage(util);
		util.extentReport("Booking Test Case");
		util.createTestCase("lane & game varification");
		util.implicitWait(10);
		lan.SettingOfBooking();
		Thread.sleep(2000);
		lan.Lane_ln();
//		lan.NewLane();
//		lan.Enter_lanename();
//		lan.Experience();
//		Thread.sleep(2000);
//		lan.Check_BOX();
//		lan.Check_BOX2();    
//		Thread.sleep(2000);
//		lan.SliderBT();
//		lan.Create();
//		Thread.sleep(2000);
//		
//		util.refreshWindow();

		lan.URLButton();
		Thread.sleep(2000);
		lan.CopyulOfTablate();
		util.openURl("https://app.zap.betaplanets.com/new-jersey/teseqa");
		lan.PlayOffline();
		Thread.sleep(2000);

		lan.Smallgroup();
		Thread.sleep(2000);

		lan.Axe_Relax();
		Thread.sleep(2000);
        
		 lan.Target_A();
		 Thread.sleep(2000);
		
		
		lan.Enter_name();
		Thread.sleep(2000);
		
		lan.AddButton();
		Thread.sleep(2000);

		lan.Enter_name2();
		// lan.AddButton();
		Thread.sleep(2000);
		lan.SaveBT();
		
		Thread.sleep(2000);
		lan.Mariya();
		
	Thread.sleep(2000);
	lan.Swapbutton();
//		Thread.sleep(2000);
//		lan.FirstRing();
		
		Thread.sleep(2000);
		lan.SecondRing();
		
		util.flush();
		System.out.println("In lane section i have created a lane and also paly the game axe n realax");
		}

}

