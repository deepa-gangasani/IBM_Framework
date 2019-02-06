package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseRegisterPOM {
	
private WebDriver driver; 
	
	public CourseRegisterPOM(WebDriver driver) {
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
	
		
	@FindBy(xpath="//div[@class='row']//div[8]//div[1]//div[2]//div[4]//div[2]//div[1]//a[1]")
	private WebElement subscribe;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alertnewprofile;
	
	public String regcnfrmation()
	{
	 String alertmsg= alertnewprofile.getText();
	return alertmsg;
	
	}
	
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

		public void clicksubscribe() {
			this.subscribe.click(); 
		}

		}
