package rahulshettyacademy.Appium_practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BrowserBaseTest {
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	@BeforeClass
	public void configureAppium() throws MalformedURLException, InterruptedException
	{
		//Appium Codecode
		
		//To start server Automatically (main .js file is responsible to invoke the server)
		service = new AppiumServiceBuilder().withAppiumJS(new File ("C://Users//sanpr//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		//UI Automator globally automate all the apps and browsers in the Android
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("PrathibaEmulator");
		options.setChromedriverExecutable("C://Appium_webDrivers//chromedriver.exe");
		options.setCapability("browserName","Chrome");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		service.stop();
	}

}
