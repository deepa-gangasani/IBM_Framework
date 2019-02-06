package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_044_StudentToDiscussintheForumPOM {
	
private WebDriver driver; 
	
	public ELTC_044_StudentToDiscussintheForumPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Login
	@FindBy(id="login")
	private WebElement userName; 
	
	public void sendUserName(String userName) {
		System.out.println("Enter Username");
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	@FindBy(id="password")
	private WebElement password;
	
	public void sendPassword(String password) {
		System.out.println("password");
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn;
	
	public void clickLoginBtn() {
		System.out.println("clicking login button");
		this.loginBtn.click(); 
	}
		
			
	//Search for course
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement Mycourses;
	
	public void clickMycourses() {
		System.out.println("Click on my course");
		this.Mycourses.click(); 
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement Coursecatalog;
	
	public void clickCoursecatalog() {
		System.out.println("course catalog page");
		this.Coursecatalog.click(); 
	}
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement Searchcourse;
	
	public void sendSearchcourse(String Searchcourse) {
		System.out.println("Searching for course");
		this.Searchcourse.clear(); 
		this.Searchcourse.sendKeys(Searchcourse); 
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitcourse;
	
	public void clicksubmitcourse() {
		System.out.println("clicking on search");
		this.submitcourse.click(); 
	}
	
	
	@FindBy(xpath="//div[@class='row']//div[5]//div[1]//div[2]//div[4]//div[2]//div[1]//a[1]")
	private WebElement subscribecorejava;
	
	public void clicksubscribecorejava() {
		System.out.println("subscribing course");
		this.subscribecorejava.click(); 
	}
	

	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement coursesubscitionmsg;
	
	public String coursesubscitionmsg()
	{
	 String alertmsg= coursesubscitionmsg.getText();
	return alertmsg;
	
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Selenium_Basics')]")
	private WebElement subscribedcrc;
	
	public void clicksubscribedcrc() {
		System.out.println("Clicking on subscribed course");
		this.subscribedcrc.click(); 
	}
	
	@FindBy(id="toolimage_635")
		private WebElement Forum;
	
	public void clickForum()
	{
		this.Forum.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Group 0001')]")
	   private WebElement Group;
	
	public void clickGroup()
	{
		this.Group.click();
	}
	
	@FindBy(xpath="//img[@title='Create thread']")
	private WebElement CreateThread;
	
	public void clickCreateThread()
	{
		this.CreateThread.click();
	}
	
	@FindBy(id="thread_post_title")
	private WebElement Threadtitle;
	
	public void ThreadTitle(String Threadtitle)
	{
		this.Threadtitle.sendKeys(Threadtitle);
	}
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	private WebElement richtextbox;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, post_text']")
	private WebElement iframetextbox;
	
	public void richtextbox(String richtextbox)
	
	{
		driver.switchTo().frame(iframetextbox);//this is i frame

		 this.richtextbox = driver.switchTo().activeElement();//we are accessing same rich text box active
		 this.richtextbox.sendKeys(richtextbox);

		 String commentvalue=this.richtextbox.getText();
		 System.out.println(commentvalue);//getting value of rich textcomment box

		      driver.switchTo().defaultContent();
		
		/*driver.switchTo().frame(richtextbox);
		
		WebElement body= driver.switchTo().activeElement();
		//richtextbox.click();
		body.sendKeys("this is my frst comment");
		driver.switchTo().defaultContent();*/
		
	}
	
	@FindBy(xpath="//button[@class=' btn btn-primary ']")
	private WebElement SubmitPost;
	
	public void clickSubmitPost()
	{
		this.SubmitPost.click();
		
	}
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement threadaddedmsg;
	
	public String threadaddedmsg()
	{
		String abc= this.threadaddedmsg.getText();
		System.out.println(abc);
		return abc;
	}
	
	@FindBy(xpath="//a[@title='Reply to this message']")
	private WebElement Replytomessage;
	
	public void clickReplytomessage() {
		this.Replytomessage.click();
	}
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	private WebElement grouprichtext;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, post_text']")
	private WebElement replymsgtextbox;
	
public void grouprichtext(String grouprichtext)
	
	{
	
	driver.switchTo().frame(replymsgtextbox);//this is i frame

	 this.grouprichtext = driver.switchTo().activeElement();//we are accessing same rich text box active
	 this.grouprichtext.sendKeys(grouprichtext);

	 String commentvalue=this.grouprichtext.getText();
	 System.out.println(commentvalue);//getting value of rich textcomment box

	      driver.switchTo().defaultContent();

		
	} 
	
	@FindBy(xpath="//button[@class=' btn btn-primary ']")
	private WebElement replytomessage2;
	
	public void clickreplytomessage2()
	{
		this.replytomessage2.click();
	}
	
	@FindBy(xpath="//div[contains(text(),'The reply has been added')]")
	
	private WebElement Replymessage;
	
	public String Replymessage()
	{
		return this.Replymessage.getText();
	}
	
}

	
	