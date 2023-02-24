package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguagePage {

	@FindBy (xpath ="(// span [@ class='nav-line-2'])[1]")
	private WebElement language;
	
	@FindBy (xpath ="(// i[@ class='a-icon a-icon-radio'])[8]")
	private WebElement marathi;
	
	@FindBy (xpath ="(// i[@ class='a-icon a-icon-radio'])[1]")
	private WebElement english;
	
	@FindBy (xpath ="// input [@ aria-labelledby='icp-save-button-announce']")
	private WebElement saveChanges;
	
	private WebDriver driver;
	
	         // constructor for webelement initialize
	public LanguagePage(WebDriver driver)
			{
		      this.driver=driver;
		      PageFactory.initElements(driver, this);
			}
	       // methods for webelement actions
	private Actions action= new Actions(driver);

	public void clicklanguageopt()
	{
		action.moveToElement(language).click().perform();
		action.moveToElement(marathi).click().perform();

	}
	public void clickSaveChanges()
	{
		saveChanges.click();
	}
	public void clickEnglanguage()
	{
		
		action.moveToElement(language).click().perform();
		action.moveToElement(english).click().perform();

	}
	
	
	
}

	

