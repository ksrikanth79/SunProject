package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Thread.sleep(3000);
WebElement border=driver.findElement(By.xpath("//iframe[@id='frame1']"));
driver.switchTo().frame(border);
//driver.switchTo().frame("singleframe");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Srikanth");
driver.switchTo().defaultContent();
WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
Select s=new Select(animals);
s.selectByValue("avatar");



	}

}
