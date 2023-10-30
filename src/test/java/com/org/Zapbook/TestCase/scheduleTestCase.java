package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.Zapbook.SchedulePage.Schedulepage;

public class scheduleTestCase extends BaseTest {

	@Test

	public void ScheduleVarification() {

		Schedulepage sched = new Schedulepage(util);
		util.implicitWait(20);
		sched.ScheduleLink();
		sched.Newbooking();
	}

}
