package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordResetPOM {
	private WebDriver driver; 
	
	public PasswordResetPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'I lost my password')]")
	private WebElement Lostmypassword;
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement Entermailid;
	
	@FindBy(xpath="//button[@id='lost_password_submit']")
	private WebElement Sendmessage;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alertnewprofile;
	
	
		
	public void clickLostmypassword() {
		this.Lostmypassword.click(); 
	}
	
	public void sendEntermailid(String Entermailid) {
		this.Entermailid.clear(); 
		this.Entermailid.sendKeys(Entermailid); 
	}
	
	public void clickSendmessage() {
		this.Sendmessage.click(); 
	}
	public String alertnewprofile()
	{
	 String alertmsg= alertnewprofile.getText();
	return alertmsg;
	
	}
		
		}
