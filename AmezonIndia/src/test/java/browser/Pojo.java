package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import util.Utility;

public class Pojo {
	   WebDriver driver;
	 public  WebDriver openChromeBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver","F:\\sachin\\selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 return driver;
	 }
	 public  WebDriver openEdgeBrowser()
	 {
		 System.setProperty("webdriver.edge.driver","F:\\sachin\\selenium\\msedgedriver.exe");
		 driver = new EdgeDriver();
		 return driver;

	 }
	 
	}
