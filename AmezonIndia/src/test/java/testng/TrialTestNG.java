package testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.AddToCart;
import pomClasses.LanguagePage;
import pomClasses.LogOutPage;
import pomClasses.LoginPage;
import pomClasses.MRecharge;

public class TrialTestNG {
	
	@BeforeSuite
	public void launchBrowserrr()
	{  
		System.out.println("before suite");
        }
	@BeforeTest
	public void launchBrowser()
	{  
		System.out.println("before test");
        }
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");

    }
	@BeforeMethod
	public void gotoHomePage()
	{ 
		System.out.println("before method");

	}
	@Test
	public void addItemToCart() 
	{
		System.out.println("Test Case");
	}
	
	@AfterMethod
	public void afterMethod()
	{ 
		System.out.println("after method");

	}
	@AfterClass
	public void afterClass()
	{	
		System.out.println("after class");

    }
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");

    }
	@AfterSuite
	public void launchBrowserr()
	{  
		System.out.println("after suite");
        }
}


