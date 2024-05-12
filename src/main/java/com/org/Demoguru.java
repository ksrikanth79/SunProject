package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoguru {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/v1/");
driver.manage().window().maximize();
driver.findElement(By.name("uid")).sendKeys("Test");
driver.findElement(By.name("password")).sendKeys("Test123");
driver.findElement(By.name("btnLogin")).click();

	}

}
