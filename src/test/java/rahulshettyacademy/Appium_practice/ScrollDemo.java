package rahulshettyacademy.Appium_practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ScrollDemo extends BaseTest  {
	
	@Test
	public void longpress() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//you are relying on google engine script -- > android UI Automator  is one of the script. This class has Ui Selector as argument / There is method called scroll into view and you have to give test of the view 
				//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
			
				
		scrollToEndAction ();
		Thread.sleep(2000);
	}

}
