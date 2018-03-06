package com.rotest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;

import pages.loginpage;
import pages.mercurypurchase;
import pages.mercurypurchase2;
import pages.mercuryreservationpage;
import pages.mercuryreservationpage1;

public class TestCase {

	//Pages
	loginpage lpage;
	mercuryreservationpage mrpage;
	mercuryreservationpage1 mr1page;
	mercurypurchase mppage;
	mercurypurchase2 mp2page;
	
	
	Fillo fillo;	
	WebDriver driver;
	
	@Before
	
	 public void setUp() {
  	  //String browserName = getParameter("browser");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://newtours.demoaut.com/mercurysignon.php");
	    }
	
	
	@Test
	public void test() throws FilloException {
		String qry="Select * from Sheet1 where TCID='1'";
	    //firstpage-loginpage
		lpage =new loginpage(driver); 
		//lastpage--mp2page
	    mp2page = lpage.Login(qry).Navigate().reserveclick().enterdetails(qry);
	    
	    /*lpage.Login(qry);
	    mrpage =new mercuryreservationpage(driver);
	    mrpage.Navigate();
	    mr1page =new mercuryreservationpage1(driver);
	    mr1page.reserveclick();
	    mppage = new mercurypurchase(driver);
	    mppage.a_fname(qry);
	    */
	    
	    // mr1page =lpage.Login(qry).Navigate();
	
	    //mppage = new mercurypurchase(driver);
	    //mppage.a_fname(qry);
	
	
	}

}
