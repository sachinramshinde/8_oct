package testClasses;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AddToCart;
import pomClasses.LanguagePage;
import pomClasses.LogOutPage;
import pomClasses.LoginPage;
import pomClasses.MRecharge;

public class TestClss {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","F:\\sachin\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        
		driver.get("https://www.amazon.in");

//		LoginPage loginPage= new LoginPage(driver);
//		loginPage.clickhelloSignIn();
//		loginPage.sendeMailOrPhone();
//		loginPage.cliccontinueButton();
//		loginPage.sendpassword();
//		loginPage.clicksignIn();
		
		
//		AddToCart addToCart = new AddToCart(driver);
//		addToCart.clickSearch();
//		addToCart.clickSubmit();
//		Thread.sleep(5000);
//		addToCart.clickSamsung();
//		addToCart.clickItem();
//		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(1));
//		addToCart.clickaddCart();
//
//		addToCart.clickCart();
//		Thread.sleep(5000);

//		LanguagePage languagePage = new LanguagePage(driver);
//		languagePage.clicklanguageopt();
//		languagePage.clickSaveChanges();
//		Thread.sleep(5000);

//		LogOutPage logOutPage= new LogOutPage(driver);
//		logOutPage.clickallmenu();
//		logOutPage.clicksignOut();
		
		MRecharge mRecharge =new MRecharge(driver);
		mRecharge.doRecharge();
		Thread.sleep(5000);
		mRecharge.doRecharge2();
		Thread.sleep(15000);

		driver.close(); 
		
		
}
}
