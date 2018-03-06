package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;

public class mercuryreservationpage {
	
	
	public WebDriver driver;
	
	@FindBy(name="findFlights")
    public WebElement findflights;

	
	  public mercuryreservationpage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	  }

	  public mercuryreservationpage1 clickcontinue() throws FilloException{
		findflights.click();
	    return new mercuryreservationpage1(driver);	
	  }
	  
	  public mercuryreservationpage1 Navigate() throws FilloException{		 
		  return clickcontinue();
}
}
