package rahulshettyacademy.Appium_practice;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class IOSSlider extends IOSBaseTest {
	
	@Test
	public void IOSLongPressTest()
	{
		driver.findElement(AppiumBy.accessibilityId("steppers")).click();
		WebElement ele= driver.findElement(AppiumBy.iOSClassChain("**//xCUIElementTypeButton[`label=='Increment'`]"));
	
		// you can use javascript lik Android and change to touchAndroid and do long press"
		/*
		((JavascriptExecutor) driver).executeScript("mobile: touchAndroid", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),"duration",2000));*/
		
		//You can create seperate HashMap and and inject the value
		HashMap <String,Object> params = new HashMap();
		params.put("element",((RemoteWebElement)ele).getId());
		params.put("duration",5);
		 driver.executeScript("mobile: touchAndroid", params);
		
		
		
	}

}
