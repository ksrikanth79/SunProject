package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
driver.manage().window().maximize();
driver.findElement(By.id("firstName")).sendKeys("Srikanth");
driver.findElement(By.id("lastName")).sendKeys("Kumar");
driver.findElement(By.id("email")).sendKeys("ksri05@gmail.com");
driver.findElement(By.id("confirmEmail")).sendKeys("ksri05@gmail.com");
driver.findElement(By.id("password")).sendKeys("Test123");
driver.findElement(By.id("confirmPassword")).sendKeys("Test123");
driver.findElement(By.id("address1")).sendKeys("123 Main St");
driver.findElement(By.id("address2")).sendKeys("Lenin Nagar");
driver.findElement(By.id("city")).sendKeys("Chennai");
driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
driver.findElement(By.id("zipCode")).sendKeys("600030");

	}

}
