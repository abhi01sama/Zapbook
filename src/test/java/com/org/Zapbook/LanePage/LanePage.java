package com.org.Zapbook.LanePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class LanePage {

	@FindBy(xpath = "//ion-button[@routerlink='/settings']")
	private WebElement Setting_BT;

	@FindBy(xpath = "//ion-segment-button[@value='Lane']")
	private WebElement Lane_link;

	@FindBy(xpath = "//ion-text[@class='w-full d-flex item-center justify-space-between sm-column ios hydrated']//ion-text[@class='ios hydrated']")
	private WebElement New_lane;

	@FindBy(xpath = "//input[@placeholder='Enter here']")
	private WebElement Lane_name;

	@FindBy(xpath = "//ion-select[@placeholder='Select Experience']")
	private WebElement Select_Experience;

	@FindBy(xpath = "//ion-item[1]//ion-checkbox[1]")
	private WebElement checkBox;

	@FindBy(xpath = "//ion-item[2]//ion-checkbox[1]")
	private WebElement checkBox2;

	@FindBy(xpath = "//ion-range[@id='ion-r-2']")
	private WebElement slider;

	@FindBy(xpath = "//ion-button[@type='submit']")
	private WebElement create_bt;

	@FindBy(xpath = "//ion-button[@id='copy-link-lane-0']")
	private WebElement Url_Bt;

	@FindBy(xpath = "//ion-item[normalize-space()='Tablet Link']")
	private WebElement Tablate_ln;

	@FindBy(xpath = "//ion-button[@class='ios button button-solid ion-activatable ion-focusable hydrated']")
	private WebElement play_Offline;

	@FindBy(xpath = "//ion-row[@class='ios hydrated']//ion-col[1]")
	private WebElement small_group;

	@FindBy(xpath = "//ion-button[normalize-space()='30 - 60 Min']")
	private WebElement axe_relax;

	@FindBy(xpath = "//ion-col[1]//ion-card[1]")
	private WebElement targetA;

	@FindBy(xpath = "//input[@placeholder='Enter name']")
	private WebElement enter_name;

	@FindBy(xpath = "//ion-icon[@name='add-circle']")
	private WebElement Add_BT;

	@FindBy(xpath = "//input[@name='ion-input-1']")
	private WebElement enter_name2;

	@FindBy(xpath = "//ion-button[@class='ios button button-large button-round button-solid ion-activatable ion-focusable hydrated']")
	private WebElement save;

	@FindBy(xpath = "//div[@class='thad_main-list']//ion-text[1]")
	private WebElement mariya;

	@FindBy(xpath = "//ion-content[@class='ios content-ltr hydrated']//ion-button[3]")
	private WebElement swap_Bt;

	@FindBy(xpath = "//div[@class='ring layerOne']")
	private WebElement first_ring;

	@FindBy(xpath = "//div[@class='ring layertwo']")
	private WebElement second_ring;

	private WebUtil util;

	public LanePage(WebUtil util) {
		this.util = util;
		PageFactory.initElements(util.getDriver(), this);

	}

	public void SettingOfBooking() {
		util.click(Setting_BT, "setting");
	}

	public void Lane_ln() {
		util.click(Lane_link, "lane");

	}

	public void NewLane() {
		util.click(New_lane, "AddLane");

	}

	public void Enter_lanename() {
		util.click(Lane_name, "LaneName");
		util.sendkeys(Lane_name, "LaneName", "LastLane");

	}

	public void Experience() {
		util.click(Select_Experience, "experience");

	}

	public void Check_BOX() {
		util.actionClick(checkBox, "check");
	}

	public void Check_BOX2() {
		util.actionClick(checkBox2, "check2");
	}

	public void SliderBT() {
		util.dragAndDrop(slider, 2, 7, "slide");

	}

	public void Create() {
		util.click(create_bt, "create");
	}

	public void URLButton() {
		util.click(Url_Bt, "url");
	}

	public void CopyulOfTablate() {
		util.click(Tablate_ln, "Target A");
	}

	public void PlayOffline() {
		util.click(play_Offline, "Ofline");
	}

	public void Smallgroup() {
		util.click(small_group, "small");
	}

	public void Axe_Relax() {
		util.click(axe_relax, "Axe");
	}

	public void Target_A() {
		util.click(targetA, "targetln");
	}

	public void Enter_name() {
		util.sendkeys(enter_name, "enter", "Marya");
	}

	public void AddButton() {
		util.click(Add_BT, "add");
	}

	public void Enter_name2() {
		// util.scrollToElement(enter_name2, "enter_2");
		util.sendkeys(enter_name2, "enter_2", "Abhi");
	}

	public void SaveBT() {
		util.click(save, "save_bt");
	}

	public void Mariya() {
		util.click(mariya, "mariyaRing");

	}

	public void Swapbutton() {
		util.click(swap_Bt, "swp");

	}

	public void FirstRing() {
		util.click(first_ring, "ring");
	}

	public void SecondRing() {
		util.click(second_ring, "sering");
	}
}
