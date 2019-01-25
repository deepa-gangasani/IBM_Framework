package com.Testcases;

import org.testng.annotations.Test;

import com.training.pom.PasswordResetPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ELTC_012 {
	private WebDriver driver;
	private String baseUrl;
	private PasswordResetPOM PasswordResetPOM;
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
		PasswordResetPOM = new PasswordResetPOM(driver); 
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
  public void pswdrecoverTest() {
		
	  PasswordResetPOM.clickLostmypassword(); 
	  PasswordResetPOM.sendEntermailid("deepabl333@gmail.com");
	  PasswordResetPOM.clickSendmessage();
		String expected= "Password sent to your mail id";
		String actual =PasswordResetPOM.alertnewprofile();
		System.out.println(actual);
		assertEquals(actual, expected);
		
		//insert assert step here
  }
}
