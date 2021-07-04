package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.Loginpage;
@Listeners(Testnglistnerex.class)

public class Logintest1 extends Baseclass {
	
	
		
	@Test(enabled=false)
	@Parameters({ "username", "password" })

	public void login(String uname, String pwd)
	{
        Loginpage loginobj=new Loginpage();
        loginobj.logintest(uname, pwd);
    
    
}
	
	@Test
	public void logintest2()
	{
        Loginpage loginobj=new Loginpage();
        String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pwd= sheet.getRow(1).getCell(1).getStringCellValue();
        loginobj.logintest(uname, pwd);
    
    
}
	
}