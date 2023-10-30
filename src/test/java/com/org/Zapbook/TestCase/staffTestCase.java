package com.org.Zapbook.TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.zapbook_StaffPage.Staff;

public class staffTestCase extends BaseTest {

	@Test

	public void StaffVarification() throws InterruptedException, IOException {
		Staff st = new Staff(util);
		util.implicitWait(10);
		st.StaffLink();
		Thread.sleep(2000);

		st.NewEmpolyee();
		Thread.sleep(2000);

		//st.Image();
//		System.out.println("jghg");
//		Thread.sleep(5000);

		st.Full_name();
		Thread.sleep(2000);
		//st.DateOfBirth();
		//Thread.sleep(2000);

		st.Email();
		Thread.sleep(2000);

		st.Phone();
		Thread.sleep(2000);
		st.Position();
		Thread.sleep(2000);

		st.Roll();

		st.Select_roll();
		Thread.sleep(2000);

		st.SelectJob();
		Thread.sleep(2000);
		st.PartTime();
		Thread.sleep(2000);
		st.SelectLocation();
		Thread.sleep(2000);
		st.Location();
		Thread.sleep(2000);
		st.Address();
		util.flush();
		System.out.println("Inn this test case when we have create new empoly than the detail page in not fill ");
	}

}
