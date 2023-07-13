package rahulshettyacademy.Appium_practice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSScrollTest extends IOSBaseTest {
	@Test
	public void IOSScrollTest() throws InterruptedException
	{
		WebElement ele = driver.findElement(AppiumBy.accessibilityId("Web View"));
		HashMap <String,Object> params = new HashMap();
		params.put("element",((RemoteWebElement)ele).getId());
		params.put("direction","down");
		driver.executeScript("mobile:scroll", params);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();
		driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		
		//Picker View ( You can just send keys for picker )
		driver.findElement(AppiumBy.accessibilityId("Red Color componenet")).sendKeys("30");
		driver.findElement(AppiumBy.accessibilityId("Green Color componenet")).sendKeys("220");
		driver.findElement(AppiumBy.iOSClassChain("label == 'Blue Color componenet'")).sendKeys("105");
		String actual = driver.findElement(AppiumBy.iOSClassChain("label == 'Blue Color componenet'")).getText();
		Assert.assertEquals(actual, "105");
	}

}
