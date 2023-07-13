package rahulshettyacademy.Appium_practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class IOSBaseTest {
	public static IOSDriver driver;
	public static AppiumDriverLocalService service;
	@BeforeClass
	public void configureAppium() throws MalformedURLException
	{
		//IOS Code
		
		//To start server Automatically (main .js file is responsible to invoke the server)
		service = new AppiumServiceBuilder().withAppiumJS(new File ("C://Users//sanpr//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		XCUITestOptions options = new XCUITestOptions();
		
		options.setDeviceName("iPhone 13 Pro");
		options.setApp("Applocation(i.e:path where apk file is stored/ You can save in resources as well which is recommended");
		// **It is mandatory to set up ios version Ex: for 13 pro it is 15.5
		options.setPlatformVersion("15.5");
		
		//Appium -webdriver Agent ->IOS Apps.  IOS it can't talk directly to the Appium. so you have to write teh command.
		options.setWdaLaunchTimeout(Duration.ofSeconds(10));
		
		
		driver=new IOSDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		service.stop();
	}
}
