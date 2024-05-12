package com.org;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();
driver.findElementByXPath("//*[@placeholder='First Name']").sendKeys("Srikanth");
driver.findElementByXPath("//*[@placeholder='Last Name']").sendKeys("Kumar");
//driver.findElementById("userEmail").sendKeys("test@gmail.com");
driver.findElementById("userNumber").sendKeys("1234567890");

	}

}
