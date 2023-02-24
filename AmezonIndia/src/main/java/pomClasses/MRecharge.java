package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MRecharge {
  @FindBy (xpath="// span [@ class='hm-icon-label']")
  private WebElement allmenu;
  
  @FindBy (xpath="// div[text()='Gift Cards & Mobile Recharges']")
  private WebElement giftAndMobile;
  
  @FindBy (xpath="// a[ text()='Mobile Recharges']")
  private WebElement mobileAndRecharge;
  
  @FindBy (xpath="// a[ @ title='Mobile Recharges']")
  private WebElement mobileAndRecharge2;
  
  @FindBy (xpath="// input[ @ name='phoneNumber']")
  private WebElement mobileNumber;
  
  @FindBy (xpath="// input[ @ name='rechargePlan']")
  private WebElement RechargeAmount;
  
  @FindBy (xpath="// button[ @ id='buyButtonNative']")
  private WebElement payButton;
  
  WebDriver driver;
  public MRecharge(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  public void doRecharge()
  {
	  allmenu.click();
	  giftAndMobile.click();
	  mobileAndRecharge.click();
	  mobileAndRecharge2.click();
	  mobileNumber.sendKeys("8975223287");
  }
  public void doRecharge2()
  {
	  RechargeAmount.sendKeys("99");
	  payButton.click();
  }
  
  
  
  
  
  
  
  
  
  
  
}
