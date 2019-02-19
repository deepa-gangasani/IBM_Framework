package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_071_AuthorATestPOM {
	private WebDriver driver; 
	
	public ELTC_071_AuthorATestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
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
	
	@FindBy(xpath="//a[contains(text(), 'My courses')]")
	private WebElement Courses;
	
	public void clickcourses()
	{
		this.Courses.click();
	}
	@FindBy(xpath="//a[contains(text(), 'Selenium_Basics')]")
	private WebElement Subscribedcourse;
	
	public void clickSubscribedcourse()
	{
		this.Subscribedcourse.click();
	}
	
	@FindBy(xpath="//img[@title='Tests']")
	private WebElement testicon;
	
	public void clicktesticon() {
		this.testicon.click();
	}
	
	@FindBy(xpath="//img[@title='Create a new test']")
	private WebElement createTest;
	
	public void clickcreatetest()
	{
		this.clickcreatetest();
	}
	
	@FindBy(id="exercise_title")
	private WebElement TestName;
	
	public void sendTestName()
	{
		this.TestName.clear();
		this.TestName.sendKeys("Online Quiz");
	}
	
	@FindBy(id="advanced_params")
	private WebElement AdvancedSettings;
	
	public void clickAdvancedSettings()
	{
		this.AdvancedSettings.click();
		
	}
	
	@FindBy(xpath="//body[@class='cke_1 cke cke_reset cke_chrome cke_editor_exerciseDescription cke_ltr cke_browser_webkit")
	private WebElement richtextbox;
	
	@FindBy(xpath="//iframe[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement iframetextbox;
	
	public void richtextbox(String richtextbox)
	
	{
		driver.switchTo().frame(iframetextbox);//this is i frame

		 this.richtextbox = driver.switchTo().activeElement();//we are accessing same rich text box active
		 this.richtextbox.sendKeys(richtextbox);

		 String commentvalue=this.richtextbox.getText();
		 System.out.println(commentvalue);//getting value of rich textcomment box

		      driver.switchTo().defaultContent();
		
		
	}
	
		
	@FindBy(name="activate_start_date_check")
	private WebElement EnableStartTime;
	
	public void clickEnablestarttime()
	{
		this.clickEnablestarttime();
	}
	
	@FindBy(name="pass_percentage")
	private WebElement Passpercentage;
	
	public void sendpasspercentage()
	{
		this.Passpercentage.clear();
		this.Passpercentage.sendKeys("10%");
		
	}
	
	
		}
