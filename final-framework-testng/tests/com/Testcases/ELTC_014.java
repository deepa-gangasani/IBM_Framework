package com.Testcases;

import org.testng.annotations.Test;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.CourseDescPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ELTC_014 {
	private WebDriver driver;
	private String baseUrl;
	private CourseDescPOM CourseDescPOM;
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
		CourseDescPOM = new CourseDescPOM(driver); 
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
  public void subscribedcrcTest() {
		
	  CourseDescPOM.sendUserName("Deepa");
	  CourseDescPOM.sendPassword("Eaglecomp@006");
	  CourseDescPOM.clickLoginBtn(); 
	  CourseDescPOM.clickMycourses();
	  CourseDescPOM.clicksubscribedcrc();
	  CourseDescPOM.clickcrcdecription();
		
		
		//insert assert step here
  }

}
