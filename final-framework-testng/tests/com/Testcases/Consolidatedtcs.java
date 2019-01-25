package com.Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Consolidatedtcs {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority =0)
	public void PswdRecoverTest()
	{
		loginPOM.clicklostpassowrd(); 
		loginPOM.sendentermailid("Eaglecomp@001");
	}
	
	@Test(priority =4)
	public void PswdchnageTest() {
		loginPOM.sendUserName("Deepa");
		loginPOM.sendPassword("Eaglecomp@002");
		loginPOM.clickLoginBtn(); 
		loginPOM.clichomebtn();
		loginPOM.cliceditprofile();
		loginPOM.sendpass("Eaglecomp@002");
		loginPOM.sendnewpassword("Eaglecomp@003");
		loginPOM.sendcnfrmpassword("Eaglecomp@003");
		loginPOM.clicksavechangesbtn(); 
	} 
	
		
	@Test(priority =3 )
	public void RegcourseTest()
	{
		
		  loginPOM.sendUserName("Deepa");
			loginPOM.sendPassword("Eaglecomp@002");
			loginPOM.clickLoginBtn(); 
			loginPOM.clickMycourses();
			loginPOM.clickCoursecatalog();
			loginPOM.sendSearchcourse("Selenium");
			loginPOM.clicksubscribe();
	}
	
	@Test(priority = 1)
	public void CrcdetailsTest()
	{
		loginPOM.sendUserName("Deepa");
		loginPOM.sendPassword("Eaglecomp@002");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickMycourses();
		loginPOM.clicksubscribedcrc();
		loginPOM.clickcrcdecription();
	}
	
	@Test(priority =2)
	
	public void validLogoutTest() throws InterruptedException
	{
		loginPOM.sendUserName("Deepa");
		loginPOM.sendPassword("Eaglecomp@002");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickdropdown();
		Thread.sleep(5000);
		loginPOM.clicklogout();
	}
  }

