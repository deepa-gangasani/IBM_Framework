package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDescPOM {
	private WebDriver driver; 
	
	public CourseDescPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Learn Selenium')]")
	private WebElement subscribedcrc;
	
	@FindBy(xpath="//img[@id='toolimage_1934']")
	private WebElement crcdescription;
	
		
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alertnewprofile;
	
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
		
			
		public void clicksubscribedcrc() {
			this.subscribedcrc.click(); 
		}
		
		public void clickcrcdecription() {
			this.crcdescription.click(); 
		}
		
				}
