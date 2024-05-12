package com.ng;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import com.org.HRMScreenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OrangeSunReportTest {
	public static ChromeDriver driver;
    public static int i=0;
    public static ExtentReports report;
    public static ExtentTest test;
    
    @BeforeSuite
    public void begin()
    {
    	report=new ExtentReports(".//reports//SunReport.html",true);
    	test=report.startTest("To verify user is able to login orange HRM website");
    	report.addSystemInfo("Auther", "Srikanth");
    	report.addSystemInfo("UserStory", "USA1234");
    	
    }
    
	@Test
	public void orange() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		//HRMScreenshots hs=new HRMScreenshots();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		test.log(LogStatus.PASS,"Entered UserName"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		test.log(LogStatus.PASS,"Entered password"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		test.log(LogStatus.PASS,"User seeing Home Page"+test.addScreenCapture(snap()));
		
	}
	
	public String snap() throws IOException
	{
		Random r=new Random();
		String dummy="";
		if(r.nextInt()!=0)
		{
			i=i+1;
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		dummy=dest.getAbsolutePath();
		}
		return dummy;
	}
	
	@AfterSuite
	public void end()
	{
	report.endTest(test);	
	report.flush();
	}
}
