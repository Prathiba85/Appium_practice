package rahulshettyacademy.Appium_practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Miscellaneous extends BaseTest  {
	
	
	@Test
	public void miscellaneous() throws MalformedURLException
	{	
		//App package and App activity
		//windows - adb shell dumpsys window |find "mCurrentFocus" -window
		
		Activity activity = new Activity("io.appium.android.apis/io.appium","io.appium.android.apis.preference.PreferenceDependencies");
		
	driver.startActivity(activity); 
		
		//driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		//driver.findElement(By.id("android:id/checkbox")).click();
		//Turning to landscape
		DeviceRotation landscape = new DeviceRotation(0,0,90);
		driver.rotate(landscape);
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String actual_title = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(actual_title,"WiFi settings");
		// copy paste
		//copy to clipboard -paste it clipboard
		driver.setClipboardText("AndroidAp4c01");
		
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	//keyboard activities - Home back or enter
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
		
	}

}
