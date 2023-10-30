package com.org.Zapbook.TestCase;

import org.testng.annotations.Test;

import com.org.ZapBook_BaseConfig.BaseTest;
import com.org.ZapBook_InventryPage.Inventry;

import bsh.util.Util;

public class InventryTestCase extends BaseTest {

	
	@Test
	
	public void inventryVarification() throws InterruptedException {
    Inventry ivn = new Inventry(util);
    util.implicitWait(10);
    util.maximize();
		ivn.invetry();
		Thread.sleep(2000);
		ivn.NewProduct();
		Thread.sleep(2000);
		ivn.ProductName();
		Thread.sleep(2000);
		    
		ivn.SKULn();
		Thread.sleep(2000);
	 ivn.Brand();
	 Thread.sleep(2000);
	 ivn.Suppli();
	 Thread.sleep(2000);
	 ivn.Size();
//	 util.implicitWait(10);
//		ivn.Chiled();
//		Thread.sleep(4000);
		ivn.Category();
		Thread.sleep(2000);
		ivn.Game();
		Thread.sleep(2000);
    ivn.Reatil();
    Thread.sleep(2000);
    ivn.PurchesPrice();
    Thread.sleep(2000);
    ivn.Stock();
    Thread.sleep(2000);
    ivn.Lowstock();
    Thread.sleep(2000);
    System.out.println("In this we have create a new product but its do not properly worked");
  //  ivn.TeextBox();
	
	}
	
}
