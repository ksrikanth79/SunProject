package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.findElementByXPath("//*[@placeholder='First Name']").sendKeys("Srikanth");
driver.findElementByXPath("//*[@placeholder='Last Name']").sendKeys("Kumar");
//driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Srikanth");
//driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Kumar");
driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(" 123 Main St, Bangalore");
driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("test@gmail.com");
driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("1234567890");
driver.findElement(By.name("radiooptions")).click();
driver.findElement(By.id("checkbox1")).click();
driver.findElement(By.id("checkbox2")).click();
driver.findElement(By.id("checkbox3")).click();
//driver.findElementByXPath("//*[@[class='ui-corner-all']").selectByVisibleText("Arabic");
Select dropdown = new Select(driver.findElement(By.id("Skills")));
dropdown.selectByVisibleText("Android");
WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
Select c=new Select(country);
c.selectByVisibleText("India");
//driver.findElement(By.id("yearbox")).sendKeys("2000");
WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
Select y=new Select(year);
y.selectByVisibleText("1985");
WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select m=new Select(month);
m.selectByVisibleText("April");
WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
Select d=new Select(day);
d.selectByValue("15");
//driver.findElement(By.xpath("//*[@ng-model='monthbox]")).sendKeys("April");
//driver.findElement(By.id("daybox")).sendKeys("20");
//Select Country = new Country(driver.findElement(By.id("countries"));
//Country.selectByIndex(3);
//(driver.findElement(By.xpath("//div[@role='combobox']")));
//Select drpCountry = new Select(driver.findElement(By.name("country")));
//drpCountry.selectByVisibleText("ANTARCTICA");
driver.findElement(By.id("firstpassword")).sendKeys("Test123");
driver.findElement(By.id("secondpassword")).sendKeys("Test123");


	}

}
