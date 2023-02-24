package testng;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Pojo;
import pomClasses.AddToCart;
import pomClasses.LanguagePage;
import pomClasses.LogOutPage;
import pomClasses.LoginPage;
import pomClasses.MRecharge;
import util.Utility;

public class MobileRechargePage extends Pojo{
	WebDriver driver; 
	LogOutPage logOutPage;
	AddToCart addToCart;
	LoginPage loginPage;
	MRecharge mRecharge;
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String webBrowser)
	{
		if(webBrowser.equals("chrome"))
		{
			driver=openChromeBrowser();
		}
		if(webBrowser.equals("edge"))
		{
			driver=openEdgeBrowser();		
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
	@BeforeClass
	public void beforeClass()
	{
		loginPage= new LoginPage(driver);
		logOutPage= new LogOutPage(driver);
		 mRecharge =new MRecharge(driver);

    }
	@BeforeMethod
	public void gotoHomePage() throws IOException
	{ 
		driver.navigate().to("https://www.amazon.in");
		loginPage.clickhelloSignIn();
		loginPage.sendeMailOrPhone("9082796541");
		loginPage.cliccontinueButton();
		loginPage.sendpassword("922080");
		loginPage.clicksignIn();
		
	}			
	@Test 
	public void recharge() throws InterruptedException 
	{
		mRecharge.doRecharge();
		Thread.sleep(3000);
		mRecharge.doRecharge2();
		Thread.sleep(5000);
		driver.navigate().back();
		
	}
	
	@AfterMethod
	public void afterMethod()
	{ 
		logOutPage.clickallmenu();
		logOutPage.clicksignOut();
		driver.close();
	}
	@AfterClass
	public void afterClass()
	{
		logOutPage=null;
		loginPage=null;
     
    }
	@AfterTest
	public void afterTest()
	{
		
      driver.quit();
      driver=null;
      System.gc();
    }
}


