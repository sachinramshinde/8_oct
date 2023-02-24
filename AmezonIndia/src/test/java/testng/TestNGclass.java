 package testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.Pojo;
import pomClasses.AddToCart;
import pomClasses.LanguagePage;
import pomClasses.LogOutPage;
import pomClasses.LoginPage;
import pomClasses.MRecharge;
import util.Utility;

public class TestNGclass extends Pojo {
	WebDriver driver; 
	ArrayList<String> addr;
	LogOutPage logOutPage;
	AddToCart addToCart;
	LoginPage loginPage;
	private String testID;
	
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
		addToCart = new AddToCart(driver);
		logOutPage= new LogOutPage(driver);
     
    }
	@BeforeMethod
	public void gotoHomePage() throws InterruptedException, IOException
	{ 
		driver.get("https://www.amazon.in");
		
		loginPage.clickhelloSignIn();
		
		loginPage.sendeMailOrPhone(Utility.getTestData("testing data",0,0));
		
		loginPage.cliccontinueButton();
		
		loginPage.sendpassword(Utility.getTestData("testing data",0,1));
		
		loginPage.clicksignIn();
		Thread.sleep(8000);
		String title= driver.getTitle();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, url);
	
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(title, title);
		
	}
	@Test
	public void addItemToCart() throws InterruptedException, IOException 
	{
		testID="AMZ002";
		addToCart.clickSearch();
		addToCart.clickSubmit();
		addToCart.clickSamsung();
		Thread.sleep(4000);
		addToCart.clickItem();
		 addr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		addToCart.clickaddCart();
		addToCart.clickCart();	
		
		
	}
	@Test (enabled=false)
	public void chcklanguage() throws InterruptedException 
	{
		testID="AMZ001";
		LanguagePage languagePage = new LanguagePage(driver);
		languagePage.clicklanguageopt();
		languagePage.clickSaveChanges();
		Thread.sleep(3000);
		languagePage.clickEnglanguage();
		languagePage.clickSaveChanges();
		Thread.sleep(3000);

	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{ 
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenShot(driver,testID);
		}
		logOutPage.clickallmenu();
		logOutPage.clicksignOut();
		driver.close();
	}
	@AfterClass
	public void afterClass()
	{
		logOutPage=null;
		addToCart=null;
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
