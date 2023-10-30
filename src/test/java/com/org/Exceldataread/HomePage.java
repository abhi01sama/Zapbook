package com.org.Exceldataread;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\hp\\Downloads\\new\\new\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://app.rntr.com/#/tabs/home");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//h3[text()='Log In']"));
		login.click();
		Thread.sleep(2000);

		WebElement Email = driver.findElement(By.xpath("//input[@placeholder=\"Enter email\"]"));
		Email.click();
		Email.sendKeys("eric@knoxweb.com");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Enter password\"]"));
		password.click();
		password.sendKeys("sR123456");

		driver.findElement(By.xpath("//ion-button[@type='submit']")).click();

		// driver.manage().timeouts().implicitlyWait(10, "10000");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement scroll = driver.findElement(By.xpath("//P[text()='No product found.']"));
		Actions ac3 = new Actions(driver);
		ac3.scrollToElement(scroll).build().perform();
		Thread.sleep(2000);

		WebElement close = driver.findElement(By.cssSelector(".ios.ion-color.ion-color-primary.hydrated"));
		close.click();

		Thread.sleep(2000);

		WebElement zip = driver.findElement(By.xpath("//input[@placeholder=\"Zip Code\"]"));
		zip.click();
		zip.sendKeys("91761");
		driver.findElement(By.xpath("//p[text()='Search']")).click();

		WebElement scrol = driver.findElement(By.xpath("//ion-label[text()=' Both test product ']"));
		Actions ac = new Actions(driver);
		ac3.scrollToElement(scroll).build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//ion-label[text()=' Both test product ']")).click();
	}
}
