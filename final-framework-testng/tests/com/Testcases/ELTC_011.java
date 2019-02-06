package com.Testcases;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.PwsdchangePOM;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ELTC_011

 {
	private WebDriver driver;
	private String baseUrl;
	private PwsdchangePOM PwsdchangePOM;
	private static Properties properties;
	
	@BeforeClass
	  public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
	  }
	
    
		//screenShot.captureScreenShot("First");
  @BeforeMethod
  public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		PwsdchangePOM = new PwsdchangePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
  }

  @AfterMethod
  public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
  }
  @Test
  public void PswdchangeTest() {
	  
	  PwsdchangePOM.sendUserName("DeepaStu10");
	  PwsdchangePOM.sendPassword("Eaglecomp@001");
	  PwsdchangePOM.clickLoginBtn(); 
	  PwsdchangePOM.clichomebtn();
	  PwsdchangePOM.cliceditprofile();
	  PwsdchangePOM.sendpass("Eaglecomp@001");
	  PwsdchangePOM.sendnewpassword("Eaglecomp@002");
	  PwsdchangePOM.sendcnfrmpassword("Eaglecomp@002");
	  PwsdchangePOM.clicksavechangesbtn(); 
		String expected= "Your new profile has been saved";
		String actual = PwsdchangePOM.pswdreset();
		System.out.println(actual);
		assertequals(actual, expected);
		
	//insert assert step here
  }


private void assertequals(String actual, String expected) {
	// TODO Auto-generated method stub
	
}
 

}
