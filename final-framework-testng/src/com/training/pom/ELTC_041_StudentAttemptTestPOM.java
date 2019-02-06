package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_041_StudentAttemptTestPOM {
	
private WebDriver driver; 
	
	public ELTC_041_StudentAttemptTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement Mycourses;
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement Coursecatalog;
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement Searchcourse;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitcourse;
	
	
	@FindBy(xpath="//div[@class='row']//div[5]//div[1]//div[2]//div[4]//div[2]//div[1]//a[1]")
	private WebElement subscribecorejava;
	
	@FindBy(xpath="//a[contains(text(),'Selenium_Basics')]")
	private WebElement subscribedcrc;
	
	@FindBy(xpath="//a[contains(text(),'Tests')]")
	private WebElement testicon;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Selenium basics')]")
	private WebElement testname;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-large']")
	private WebElement startTest;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement registeredtocoursemsg;
		
	
	@FindBy(xpath="//strong[contains(text(),'1. Select the operating system which is NOT suppor')]")
	private WebElement q1;
	
	@FindBy(xpath="//input[@id='choice-9-2']")
	private WebElement answer1;
	
	@FindBy(xpath="//button[@name='save_now']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@id='choice-10-1']")
	private WebElement answer2;
	
	@FindBy(xpath="//input[@id='choice-11-2']")
	private WebElement answer3;
	
	@FindBy(xpath="//h2[@class='page-header']")
	private WebElement testresults;
	
	@FindBy(xpath="//div[@class='question-result']")
	private WebElement detailedresults;
	
	@FindBy(xpath="//a[contains(text(),'Selenium basics')]")
	private WebElement testdetails;
	
	@FindBy(xpath="//td[contains(text(),'Latest attempt :')]")
	private WebElement teststatus;
	
	
	
	
	
	/*@FindBy(xpath="//iframe[@id='description_ifr']")
		private WebElement descriptionElement;
	
	
	 	
	public void richrtext()
	{
		driver.switchTo().frame(descriptionElement);
	      WebElement editable = driver.switchTo().activeElement();
	        		  
	      editable.sendKeys("Anand Somani");
	      driver.switchTo().defaultContent();
	}*/
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
		public void clickMycourses() {
			this.Mycourses.click(); 
		}
		
		public void clickCoursecatalog() {
			this.Coursecatalog.click(); 
		}
				
		public void sendSearchcourse(String Searchcourse) {
			this.Searchcourse.clear(); 
			this.Searchcourse.sendKeys(Searchcourse); 
		}

		public void clicksubmitcourse() {
			this.submitcourse.click(); 
		}
			
		public void clicksubscribecorejava() {
			this.subscribecorejava.click(); 
		}
		
		public void clicksubscribedcrc() {
			this.subscribedcrc.click(); 
		}
		public void clicktesticon() {
			this.testicon.click(); 
		}
		

		
		public void clicktestname() {
			this.testname.click(); 
		}
		

	       public String testdetails()
	        {
	    	   String Testname = this.testdetails.getText();
	    	   System.out.println("Test Name is::"+Testname);
	    	   return Testname;
	 
	 
	        }

	       public String teststatus()
	       {
	 		 
	    	   String Teststatus = this.teststatus.getText();
	    	   System.out.println("Test status is::"+Teststatus);
	    	   return Teststatus;
	 
	       }
		
		public void clickstartTest()
		{
			this.startTest.click();
		}
		
		public void q1()
		{
			System.out.println(this.q1.getText());
			
		}
		
		public void clickanswer1()
		{
			this.answer1.click();
			
		}
		
		public void submit()
		{
			this.submit.click();
		}
		
		public void clickanswer2()
		{
			this.answer2.click();
		}
		public void clickanswer3()
		{
			this.answer3.click();
		}
		
		public void detailedresults()
		{
			
			String results = this.detailedresults.getText();
			System.out.println("Results::"+results);
					
		}
		
	public String registeredtocoursemsg()
		{
			
			String results = this.registeredtocoursemsg.getText();
			return results;
					
			
		
				}
}
