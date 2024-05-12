package com.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWindows{
	public static String parent,facebook,linkedIn,twitter,youtube;
	public static Set<String> all;
	public static Iterator<String> it;
	public void hrm()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());		
parent=driver.getWindowHandle();
System.out.println("parent");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//a[target='_blank'])[2]")).click();
all=driver.getWindowHandles();
it=all.iterator();
while(it.hasNext())
{
	facebook=it.next();
	if(!parent.equals(facebook))
	{
		driver.switchTo().window(facebook);
	}
	}//while loop ended
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@id=:'rm:']")).sendKeys("facebookuser");
driver.switchTo().window(parent);
driver.findElement(By.xpath("//a[target='_blank'])[1]")).click();
all=driver.getWindowHandles();
it=all.iterator();
while(it.hasNext())
{
	linkedIn=it.next();
	if(!parent.equals(linkedIn))
	{
		driver.switchTo().window(linkedIn);
	}

	}
	}
}

