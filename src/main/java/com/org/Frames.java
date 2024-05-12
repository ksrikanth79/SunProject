package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Frames.html");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Thread.sleep(3000);
WebElement border=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
driver.switchTo().frame(border);
//driver.switchTo().frame("singleframe");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Srikanth");


	}

}
