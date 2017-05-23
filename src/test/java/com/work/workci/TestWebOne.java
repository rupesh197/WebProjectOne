package com.work.workci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestWebOne {
	
	WebDriver driver = null;
	
	@Test
	public void TestWebMethodOne() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=uUIkWfKXDdmDrAHmt7HgCw");
		driver.findElement(By.id("lst-ib")).click();
		driver.findElement(By.id("lst-ib")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
