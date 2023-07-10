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

public class SwipeDemo extends BaseTest  {
	
	@Test
	public void longpress() throws MalformedURLException, InterruptedException
	{	
		
driver.findElement(AppiumBy.accessibilityId("Views")).click();
driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();		
WebElement firstimage =driver.findElement(By.xpath("//android.widget.ImageView[1]"));
//String immage_focus = firstimage.getAttribute("focusable");

Assert.assertEquals(firstimage.getAttribute("focusable"),"true");		

//Swipe
//Java
swipeAction(firstimage,"left");
		
		
		Assert.assertEquals(firstimage.getAttribute("focusable"),"false");	
	}

}
