package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.ZapBook_BookingPage.Booking;

public class Booking_Page extends BaseTest {
	@Test

	public void bookingVarification() throws InterruptedException {
		Booking book = new Booking(util);
		util.implicitWait(10);

		book.Booking_ln();
		Thread.sleep(4000);
	

		book.Location();
		Thread.sleep(2000);

		book.SelectLocation();
		Thread.sleep(2000);

		book.Experience();
		Thread.sleep(2000);

		book.Select_experience();
		Thread.sleep(2000);

		book.Slider();
	Thread.sleep(2000);

		book.Calender();
		Thread.sleep(2000);

  //		 book.Pup_up();
 //		Thread.sleep(2000);
		book.Time();
		Thread.sleep(2000);

		book.Selecttime();
		Thread.sleep(2000);

		book.Drop();
		Thread.sleep(2000);

		book.Phone();
		Thread.sleep(2000);

		book.Submit();
		Thread.sleep(2000);

		book.Pencil();
		Thread.sleep(2000);

		book.PriceOverride();
		Thread.sleep(2000);

		book.DiscountValue();
		Thread.sleep(2000);

		book.Save();
		Thread.sleep(2000);

		book.Continue();
		Thread.sleep(2000);

		book.Firstname();
   book.Lastname();
	System.out.println(" yha pe guest section work nhi kar rha h to ye test case fail ho gya h ");
    
	}

}
