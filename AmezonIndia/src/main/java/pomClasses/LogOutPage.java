package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	@FindBy (xpath ="// span [@ class='hm-icon-label']")
	private WebElement allmenu;
	
	@FindBy (xpath ="// a[text()='Sign Out']")
	private WebElement signOut;
	WebDriver driver;
	public LogOutPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickallmenu()
	{
		allmenu.click();	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", signOut);
	}
	public void clicksignOut()
	{
		signOut.click();
	}
}
