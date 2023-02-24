package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
  
	@FindBy (xpath ="// input [@ id='twotabsearchtextbox']")
	private WebElement search;
	
	@FindBy (xpath ="// input [@ type='submit']")
	private WebElement submit;
	
	@FindBy (xpath ="(// i [@ class='a-icon a-icon-checkbox'])[1]")
	private WebElement samsung;
	
	@FindBy (xpath ="(//span[contains(text(), 'Samsung')])[22]")
	private WebElement item;
	
	@FindBy (xpath ="// input [@ title='Add to Shopping Cart']")
	private WebElement addCart;
	
	@FindBy (xpath ="//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
	private WebElement cart;
	
	private WebDriver driver;
	private Actions action;
	         
	public AddToCart(WebDriver driver)
			{
		      this.driver=driver;
		      action = new Actions(driver);
		      PageFactory.initElements(driver, this);
			}
	
	public void clickSearch()
	{
		search.sendKeys("mobile");
		
	}
	public void clickSubmit()
	{
		submit.click();
	}
	public void clickSamsung()
	{
		samsung.click();
	}
	public void clickItem()
	{
		item.click();
	}
	public void clickaddCart()
	{
		addCart.click();
	}
	public void clickCart()
	{
		cart.click();
	}
	
	
}

	



