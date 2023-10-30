package com.org.ZapBook_InventryPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class Inventry {

	@FindBy(xpath = "//li[normalize-space()='Inventory']")
	private WebElement inventry;

	@FindBy(xpath = "//ion-button[normalize-space()='New Product']")
	private WebElement newproduct;

	@FindBy(xpath = "//input[@name='ion-input-3']")
	private WebElement productname;
	
	@FindBy(xpath = "//input[@name='ion-input-4']")
	private WebElement skuln;

	 @FindBy(xpath = "//input[@name='ion-input-5']")
	 private WebElement brandln;
	 
	 @FindBy(xpath = "//input[@name='ion-input-6']")
	 private WebElement supplier_link;
	 
	 @FindBy(xpath = "//ion-select[@class='ng-pristine ng-valid ios in-item hydrated ng-touched ion-pristine ion-valid ion-touched']")
	 private WebElement size_ln;
	 
	 @FindBy(xpath = "//ion-label[@id='ion-rb-0-lbl']")
	 private WebElement ChiledSmall_Ln;
	 
	 @FindBy(xpath = "//ion-select[@formcontrolname='category_id']")
	 private WebElement category_ln;
	 
	 @FindBy(xpath = "//ion-radio[@role='radio']")
	 private WebElement Game_ln;
	 
	 @FindBy(xpath = "//ion-input[@formcontrolname='retail_price']")
	 private WebElement retail_price;
	 
	 @FindBy(xpath = "//ion-input[@formcontrolname='purchase_price']")
	 private WebElement purchase_price;
	 
	 @FindBy(xpath = "//ion-input[@formcontrolname='stock']")
	 private WebElement Stock_ln;
	 
	 @FindBy(xpath = "//input[@name='ion-input-24']")
	 private WebElement lowstock;
	
	 @FindBy(xpath = "//textarea[@name='ion-textarea-3']")
	 private WebElement textbox;
	 
	private WebUtil util;

	public Inventry(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void invetry() {
		util.click(inventry, "inventrylink");                     
	}

	public void NewProduct() {
		util.click(newproduct, "newpro");
	}
	public void ProductName() {

	 util.sendkeys(productname, "proname", "BsookStop");
	}
 public void SKULn() {
	 util.sendkeys(skuln, "Sku", "Stock2");
	 
 }
  public void Brand() {
	  util.sendkeys(brandln, "brand", "latest");
  }
  
  public void Suppli() {
	util.sendkeys(supplier_link, "supply", "First");
}
  public void Size() {
	util.actionClick(size_ln, "size");
}
  public void Chiled() {
 util.click(ChiledSmall_Ln, "chiled");
}
  
  public void Category() {
	  util.click(category_ln, "category");
	  }
  public void Game() {
util.click(Game_ln, "game");
}
  public void Reatil() {
	  util.actionSendkey(retail_price, "retail","500");
 }
  public void PurchesPrice() {
	util.actionClick(purchase_price, "purches");
	util.actionSendkey(purchase_price, "purches", "400");
}
  public void Stock() {
	  util.actionClick(Stock_ln, "stock");
	  util.actionSendkey(Stock_ln, "stock","23");
	
}
  public void Lowstock() {
	util.actionSendkey(lowstock, "low", "34");
}
  public void TeextBox() {
	util.sendkeys(textbox, "text","this is for testing");
}
}
