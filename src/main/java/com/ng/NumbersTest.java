package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumbersTest {
	@Test
	public void one()
	{
		System.out.println("One Test");
	}
	@AfterMethod
	public void two()
	{
		System.out.println("Two Test");	
	}
	@BeforeMethod
	public void three()
	{
		System.out.println("Three Test");
	}
	@AfterClass
	public void four()
	{
		System.out.println("Four Test");
	}
	@BeforeClass
	public void five()
	{
		System.out.println("Five Test");
	}
	@AfterTest
	public void six()
	{
		System.out.println("Six Test");
	}
	@BeforeTest
	public void seven()
	{
		System.out.println("Seven Test");
	}
	@AfterSuite
	public void eight()
	{
		System.out.println("Eight Test");
	}
	@BeforeSuite
	public void nine()
	{
		System.out.println("Nine Test");
	}
}

