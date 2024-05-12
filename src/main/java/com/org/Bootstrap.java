package com.org;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {
	//public static int i=0;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
HRMScreenshots hs=new HRMScreenshots();
driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
driver.manage().window().maximize();
Thread.sleep(4000);
hs.snap();
WebElement skill=driver.findElement(By.xpath("//button[@id='menu1']"));
Thread.sleep(4000);
hs.snap();
skill.click();
List<WebElement> all=driver.findElements(By.xpath("//a[@role='menuitem']"));
Thread.sleep(4000);
hs.snap();
for(WebElement each:all)
{
	String value = each.getText();
	System.out.println(value);
	if(value.equals("JavaScript"))
	{
		each.click();
		break;
	}
}

	}
	public void snap() throws IOException
	 {
	  Random r=new Random();
	  if(r.nextInt()!=0)
	  {
	   i=i+1;
	  File src = driver.getScreenshotAs(OutputType.FILE);
	  File dest=new File(".//images//pic"+i+".png");
	  FileUtils.copyFile(src, dest);
	  }
	 }
}
