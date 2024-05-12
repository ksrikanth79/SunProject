package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Thread.sleep(3000);
//driver.switchTo().frame("singleframe");
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Srikanth");
driver.switchTo().frame("frame1").switchTo().frame("frame3");
WebElement box=driver.findElement(By.xpath("//input[@id='a']"));
box.click();
	}

}
