package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.Zapbook.Create_Game.CreateGame;

public class CreateGame_TestCase extends BaseTest {

	@Test

	public void CreateGame_Varification() throws InterruptedException {

		CreateGame game = new CreateGame(util);
		util.implicitWait(10);
		game.SettingOfBooking();
		Thread.sleep(2000);
		game.Game_link();
		game.DropDown();
		game.Save();
		util.navigateURL("https://app.zap.betaplanets.com/settings");
		Thread.sleep(4000);
		game.Notification_ln();
		game.New_Notification();
		game.EnterNotification();
		game.SMSDiscription();
		Thread.sleep(2000);
		game.DropdownOFday();
		Thread.sleep(2000);
		game.Firsy_day();
		Thread.sleep(2000);
		game.StartingDropdown();
		game.AfterStart();
		Thread.sleep(2000);
		game.BookingStatus();
		Thread.sleep(2000);
		game.Paid();
		Thread.sleep(2000);
		game.Bookable();
		game.BookanleProduct();
		Thread.sleep(2000);
		game.Submit();
		util.flush();
		System.out.println("Inthis test case we have to created game and  create notification");
	}

}
