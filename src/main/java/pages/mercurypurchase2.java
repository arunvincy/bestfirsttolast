package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mercurypurchase2 {
	
	WebDriver driver;
	@FindBy(name="spassFirst0")
    public WebElement dfrname;
	
	 public mercurypurchase2(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	  }

}
