package com.Testcases;

import org.testng.annotations.Test;

import com.training.pom.CourseRegisterPOM;
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

public class ELTC_013 {
	private WebDriver driver;
	private String baseUrl;
	private CourseRegisterPOM CourseRegisterPOM;
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
		CourseRegisterPOM = new CourseRegisterPOM(driver); 
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
  public void subscribecrc() {
		
	  CourseRegisterPOM.sendUserName("Deepa");
	  CourseRegisterPOM.sendPassword("Eaglecomp@006");
	  CourseRegisterPOM.clickLoginBtn(); 
	  CourseRegisterPOM.clickMycourses();
	  CourseRegisterPOM.clickCoursecatalog();
	  CourseRegisterPOM.sendSearchcourse("Selenium");
	  
	  CourseRegisterPOM.clicksubscribe();
		String expected= "You have been registered to course:";
		String actual =CourseRegisterPOM .regcnfrmation();
		System.out.println(actual);
		assertEquals(actual, expected);
		
		
		
		//insert assert step here
  }


}
