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

public class LongPress extends BaseTest  {
	
	@Test
	public void longpress() throws MalformedURLException, InterruptedException
	{	
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement people = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		//log press methods has been written as reusable method in base class.
		longpressAction(people);
		Thread.sleep(2000);
		String actual_text = driver.findElement(AppiumBy.className("android.widget.TextView")).getText();
		Assert.assertEquals(actual_text,"Sample menu");
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		
	}

}
