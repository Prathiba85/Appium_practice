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

public class dragDropDemo extends BaseTest  {
	
	@Test
	public void dragdrop() throws MalformedURLException, InterruptedException
	{	
		
driver.findElement(AppiumBy.accessibilityId("Views")).click();
driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();


WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	    "elementId", ((RemoteWebElement) source).getId(),
	    "endX", 842,
	    "endY", 733
	));
String result_text= driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
Assert.assertEquals(result_text, "Dropped!");

Thread.sleep(3000);
}
}