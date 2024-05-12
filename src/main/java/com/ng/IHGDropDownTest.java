package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IHGDropDownTest {
	@Test(invocationCount = 2)
			public void ihg()
			{
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.findElementByXPath("//*[@placeholder='First Name']").sendKeys("Srikanth");
	driver.findElementByXPath("//*[@placeholder='Last Name']").sendKeys("Kumar");
	//driver.findElementById("userEmail").sendKeys("test@gmail.com");
	driver.findElementById("userNumber").sendKeys("1234567890");

		}

	
}
