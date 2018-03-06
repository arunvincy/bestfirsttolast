package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;

public class mercuryreservationpage1 {
	
public WebDriver driver;
	
	@FindBy(name="reserveFlights")
    public WebElement reserveflights;

	
	  public mercuryreservationpage1(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	  }

	  //mercurypurchase
	  public mercurypurchase reserveclick() throws FilloException{
			reserveflights.click();
		    return new mercurypurchase(driver);	
		  }
		  
		  public mercurypurchase a_reserveclick() throws FilloException{		 
			  return reserveclick();
		  }
	  
}
