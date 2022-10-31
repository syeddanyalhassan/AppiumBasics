package appiumcourse;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

public class GeneralStore {

	public GeneralStore() {
		// TODO Auto-generated constructor stub
	}
	@Epic("E001")
	@Story("ST001: Check country is selected as Pakistan")
	@Test
	public void checkCountry() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");		

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");

		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\src\\test\\java\\resources\\General-store.apk");


		URL url=new URL("http://localhost:4723/wd/hub");

		AndroidDriver <WebElement> driver = new AndroidDriver <WebElement> (url, dc);


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement access=driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
		access.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		WebElement access2=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]"));
		access2.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//	WebElement access=driver.findElement(By.id("android:id/text1"));
		//	access.click();



		//   Thread.sleep(3000);

		//  WebElement access2=driver.findElement(By.id("android:id/text1"));
		// access2.click();

		//	Thread.sleep(10000);

		driver.quit();



	}
}