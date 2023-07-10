package rahulshettyacademy.Appium_practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest  {
	
	@Test
	public void wifiSettingName() throws MalformedURLException
	{	
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		//android.widget.RelativeLayout[2]
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String actual_title = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(actual_title,"WiFi settings");
		
		
		//driver.findElement(AppiumBy.className("android.widget.RelativeLayout"));
		driver.findElement(By.id("android:id/edit")).sendKeys("AndroidAp4c01");
		// for classname due to issues Appium are recommending to use By.Appium
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		//driver.findElement(By.id("android:id/button1")).click();
		
		
		
	}

}
