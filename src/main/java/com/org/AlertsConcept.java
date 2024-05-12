package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()[contains(.,'    click the button to display an  alert box:')]]")).click();
Alert a = driver.switchTo().alert();
a.accept();
Thread.sleep(4000);
driver.findElement(By.xpath("//a[text()[contains(.,'Alert with OK & Cancel')]]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[text()[contains(.,'click the button to display a confirm box')]]")).click();
a.dismiss();
	
	
Thread.sleep(4000);
driver.findElement(By.xpath("//a[text()[contains(.,'Alert with Textbox')]]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[text()[contains(.,'click the button to demonstrate the prompt box')]]")).click();
a.sendKeys("Sri");
a.accept();


	}

}
