package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Srikanth");
//driver.findElement(By.name("email")).sendKeys("Srikanth");
//driver.findElement(By.id("pass")).sendKeys("Password");
driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Srikanth");
//driver.findElement(By.name("login")).click();
driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
	}

}
