package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Utility;

public class LoginPage extends Utility{

	@FindBy (xpath ="// span[text()='Hello, sign in']")
	private WebElement helloSignIn;
	
	@FindBy (xpath ="// input[@ type='email']")
	private WebElement eMailOrPhone;
	
	@FindBy (xpath ="// input[@ id='continue']")
	private WebElement continueButton;

	@FindBy (xpath ="// input[@ type='password']")
	private WebElement password;
	
	@FindBy (xpath ="// input[@ id='signInSubmit']")
	private WebElement signIn;
	
	         // constructor for webelement initialize
	public LoginPage(WebDriver driver)
			{
		      PageFactory.initElements(driver, this);
			}
	       // methods for webelement actions
	
	public void clickhelloSignIn()
	{
		helloSignIn.click();
	}
	public void sendeMailOrPhone(String user)
	{
		eMailOrPhone.sendKeys(user);
	}
	public void cliccontinueButton()
	{
		continueButton.click();
	}
	public void sendpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clicksignIn()
	{
		signIn.click();
	}
	
	
}
