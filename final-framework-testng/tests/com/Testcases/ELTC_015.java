package com.Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LogoutPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_015 {
	private WebDriver driver;
	private String baseUrl;
	private LogoutPOM LogoutPOM;
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
		LogoutPOM = new LogoutPOM(driver); 
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
  public void validLogoutTest() throws InterruptedException {
		
	  LogoutPOM.sendUserName("Deepa");
	  LogoutPOM.sendPassword("Eaglecomp@006");
	  LogoutPOM.clickLoginBtn(); 
	  LogoutPOM.clickdropdown();
		Thread.sleep(5000);
		LogoutPOM.clicklogout();
  } 
	
	
}
