package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.exception.FilloException;

import datadrive.data;

public class loginpage {
	
	public WebDriver driver;
	private static String PAGE_URL = "http://newtours.demoaut.com/mercurysignon.php";
	
	@FindBy(name="userName")
    public WebElement ouser;

	@FindBy(name="password")
    public WebElement opass;
	
	@FindBy(name="login")
    public WebElement ologin;
	
	  public loginpage(WebDriver driver) {
	        this.driver = driver;
	        //driver.get(PAGE_URL);
	        //Initialise Elements
	        PageFactory.initElements(driver, this);
	  }
	
	  public void username(String qry) throws FilloException{
	    	data.inText(ouser, "Username", qry);
	  }
	  public void password(String qry) throws FilloException{
	    	data.inText(opass, "Password", qry);
	  }
	  public mercuryreservationpage clicksubmit(String qry) throws FilloException{
	    	ologin.click();
	    	return new mercuryreservationpage(driver);
	    		
	  }
	  
	  public mercuryreservationpage Login(String qry) throws FilloException{
		  this.username(qry);
		  this.password(qry);
		  return clicksubmit(qry);
		  
		  
	  }
}
