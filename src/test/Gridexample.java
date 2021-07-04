package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridexample {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
     
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.LINUX);
		cap.setBrowserName("chrome");
		String surl="http://172.17.0.1:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(surl),cap);
		
	    driver.get("https://www.saucedemo.com/");
	}

}
