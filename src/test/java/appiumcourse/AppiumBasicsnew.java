package appiumcourse;


import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

public class AppiumBasicsnew {

	public AppiumBasicsnew() {
		// TODO Auto-generated constructor stub
	}

	@Epic("E001")
	@Story("ST001: Checking accessibily")
	@Test
	public void Check() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");		

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");

		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\src\\test\\java\\resources\\General-store.apk");

		
		URL url=new URL("http://localhost:4723/wd/hub");

		AndroidDriver <WebElement> driver = new AndroidDriver <WebElement> (url, dc);


	//	WebElement access=driver.findElement(By.id("android:id/text1"));
	//	access.click();

	 //   Thread.sleep(3000);
	    
	  //  WebElement access2=driver.findElement(By.id("android:id/text1"));
	   // access2.click();
	    
	//	Thread.sleep(10000);

		driver.quit();

		//driver.quit();
	}
	
	

}
