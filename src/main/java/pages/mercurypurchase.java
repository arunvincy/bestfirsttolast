package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;

import datadrive.data;

public class mercurypurchase {

	WebDriver driver;
	@FindBy(name="passFirst0")
    public WebElement fname;
	
	@FindBy(name="passLast0")
    public WebElement lname;
	
	@FindBy(name="creditnumber")
    public WebElement ccno;
	
	
	@FindBy(name="buyFlights")
    public WebElement buyflights;
	
	
	 public mercurypurchase(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	  }
	
	 public void a_fname(String qry) throws FilloException{
	    	data.inText(fname,"Firstname",qry);
	  }
	 
	 public void a_lname(String qry) throws FilloException{
	    	data.inText(lname, "Lastname", qry);
	  }
	 
	 public void a_ccno(String qry) throws FilloException{
	    	data.inText(ccno, "Creditnum", qry);
	  }
	 
	/** public mercurypurchase2 a_buyflights() throws FilloException{
	    	buyflights.click();
	    	return new mercurypurchase2(driver);
	  }
	 * @return 
	 **/
	 
	 public void a_buyflights() throws FilloException{
	    	buyflights.click();
	    	
	  }
	 
	 public mercurypurchase2 enterdetails(String qry) throws FilloException{
		// this.a_fname(qry);
		// this.a_lname(qry);
		// this.a_ccno(qry);
		 //return new mercuryreservationpage(driver);
		 data.inText(fname, "Firstname", qry);
		data.inText(lname, "Lastname", qry);
		data.inText(ccno, "Creditnum", qry);
		buyflights.click();
		 //return a_buyflights();
		//this.a_buyflights();
		// return new mercurypurchase2(driver);
		  //return clicksubmit(qry);
		 return new mercurypurchase2(driver);
		  
		  
	  }
	 
	 
}
