package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMScreenshots {
public static ChromeDriver driver;
public static int i=0;
 public static void main(String[] args) throws InterruptedException, IOException {
  // TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
  driver=new ChromeDriver();
  HRMScreenshots hs=new HRMScreenshots();
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  driver.manage().window().maximize();
  Thread.sleep(4000);
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
  //driver.findElement(By.name("username")).sendKeys("Admin");
  Thread.sleep(4000);
  hs.snap();
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
  hs.snap();
  driver.findElement(By.xpath("//button[@type='submit']")).click();
  Thread.sleep(4000);
  hs.snap();
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