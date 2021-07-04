package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Logintest1;
import test.Testnglistnerex;

@Listeners(Testnglistnerex.class)
public class Loginpage {
	
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@FindBy(linkText="Log in")
    WebElement loginlink;
    
    @FindBy(name="user_login")
    WebElement username;
    
    @FindBy(id="password")
    WebElement password;
    
    @FindBy(className="rememberMe")
    WebElement remember;
    
    @FindBy(name="btn_login")
    WebElement loginsubmit;
    
    @FindBy(id="msg_box")
    WebElement error;
	
	public Loginpage()
	{
     driver=Logintest1.driver;
     report=Logintest1.report;
     test=Logintest1.test;
     
     PageFactory.initElements(driver, this);
     	}
	
	public void logintest(String uname, String pwd)
	{
		test=report.startTest("Login test case");
		
	   // WebElement loginlink= driver.findElement(By.linkText("Log in"));
	    
	    loginlink.click();
	    
	    test.log(LogStatus.PASS, "successfully clicked on login button");
	    
	    //WebElement username=driver.findElement(By.name("user_login"));
	    
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(username));
	    
	    username.sendKeys(uname);
	    
	    test.log(LogStatus.PASS, "successfully entered username");

	    
	    //WebElement password=driver.findElement(By.name("user_pwd"));
	    
	       
	    password.sendKeys(pwd);
	    
	    test.log(LogStatus.PASS, "successfully entered password");

	    
	    //WebElement remember= driver.findElement(By.className("rememberMe"));
	    
	    remember.click();
	    
	    //WebElement loginsubmit= driver.findElement(By.name("btn_login"));
	    loginsubmit.click();
	    
	    test.log(LogStatus.PASS, "successfully clicked on login link");

	    
	   // WebElement error=driver.findElement(By.id("msg_box"));
	    
	    String Actmsg=error.getText();
	    String ClassName=error.getAttribute("class");
	    String TagName=error.getTagName();
	    System.out.println(ClassName);
	    System.out.println(TagName);
	    
	          
	    String expmsg="The email or password you have entered is invalid";
	    
	        Assert.assertTrue(error.isDisplayed());
		    Assert.assertEquals(Actmsg, expmsg);
/*
	    
	    try {
	        Assert.assertEquals(Actmsg, expmsg);
	        test.log(LogStatus.PASS, "Expected and Actual value matches");
	        
	    }catch(Throwable e) {
	        test.log(LogStatus.FAIL, "Expected and Actual value does not match");
	    }
	    
	}*/

}
}
