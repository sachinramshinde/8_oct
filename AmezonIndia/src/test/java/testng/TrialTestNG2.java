package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrialTestNG2 {

	@BeforeSuite
	public void launchBrowserr()
	{  
		System.out.println("before suite2");
        }
	@BeforeTest
	public void launchBrowser()
	{  
		System.out.println("before test2");
        }
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class2");

    }
	@BeforeMethod
	public void gotoHomePage()
	{ 
		System.out.println("before method2");

	}
	@Test
	public void addItemToCart() 
	{
		System.out.println("Test Case2");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{ 
		System.out.println("after method2");

	}
	@AfterClass
	public void afterClass()
	{	
		System.out.println("after class2");

    }
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test2");

    }
	@AfterSuite
	public void launchBrowserrr()
	{  
		System.out.println("after suite2");
        }
}



