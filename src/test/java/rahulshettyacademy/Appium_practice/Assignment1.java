package rahulshettyacademy.Appium_practice;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Assignment1 extends BaseTest {
	//@Test
	public void okwith_amessage() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		// Menu -1 Ok Cancel dialog with message
		WebElement Okwith_amessage = driver.findElement(By.id("io.appium.android.apis:id/two_buttons"));
		Okwith_amessage	.click();
		
		//Click OK
		driver.findElement(By.id("android:id/button1")).click();
		
		//click Cancel
		//driver.findElement(By.id("android:id/button2")).click();	
		
			
		boolean okcheck= driver.findElement(By.id("android:id/action_bar")).isDisplayed();
		Assert.assertEquals(okcheck,true);
		
	
	}

	//@Test
	public void okwith_longmessage() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		// Menu -2 Ok Cancel dialog with long message
		WebElement Okwith_longmessage = driver.findElement(By.id("io.appium.android.apis:id/two_buttons2"));
		Okwith_longmessage	.click();
		
		
		
		//click Cancel
		driver.findElement(By.id("android:id/button2")).click();	
		
			
		boolean okcheck= driver.findElement(By.id("android:id/action_bar")).isDisplayed();
		Assert.assertEquals(okcheck,true);
		
	
	}
	
	
	
	//@Test
	public void okwith_Extralongmessage() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		// Menu -2 Ok Cancel dialog with long message
		WebElement Okwith_longmessage = driver.findElement(By.id("io.appium.android.apis:id/two_buttons2ultra"));
		Okwith_longmessage	.click();
		
		
		
		//click something
		driver.findElement(By.id("android:id/button3")).click();	
		
			
		boolean okcheck= driver.findElement(By.id("android:id/action_bar")).isDisplayed();
		Assert.assertEquals(okcheck,true);
		
	
	}	
	
	
	//@Test
	public void Listdialog() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		WebElement List_dialog = driver.findElement(AppiumBy.accessibilityId("List dialog"));
		List_dialog.click();
		
		//driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
				
		//click command one
			
		driver.findElement(By.xpath("//android.widget.ListView/android.widget.TextView[1]")).click();
		String messageText= driver.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals(messageText,"You selected: 0 , Command one");
		Thread.sleep(2000);
	
	}
	
	//@Test
	public void Progressdialog() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		WebElement List_dialog = driver.findElement(AppiumBy.accessibilityId("Progress dialog"));
		List_dialog.click();
		
		
				
	
			
		//driver.findElement(By.id("android:id/navigationBarBackground")).click();
		
		//Thread.sleep(2000);
	
	}
	
	//@Test
	public void Singlechoice() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		WebElement single_choice = driver.findElement(AppiumBy.accessibilityId("Single choice list"));
		single_choice.click();
		
		driver.findElement(By.xpath("//android.widget.ListView/android.widget.CheckedTextView[2]")).click();
		driver.findElement(By.id("android:id/button1")).click();	
	
	}
	
	//@Test
	public void repeatAlarm() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		WebElement single_choice = driver.findElement(AppiumBy.accessibilityId("Repeat alarm"));
		single_choice.click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")).click();
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")).click();
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]")).click();
		driver.findElement(By.id("android:id/button1")).click();	
	
	}
	
	
	//@Test
	public void sendcall() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		WebElement sendCall = driver.findElement(AppiumBy.accessibilityId("Send Call to VoiceMail"));
		sendCall.click();
		
		//driver.findElement(By.id("android:id/aerr_close")).click();	
	
	}
	
	//@Test
	public void textEntry() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		WebElement sendCall = driver.findElement(AppiumBy.accessibilityId("Text Entry dialog"));
		sendCall.click();
		//enter name
		driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("prathiba");
		driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("password");
		driver.findElement(By.id("android:id/button1")).click();
	}
	
	//@Test
	public void traditionaltheme() throws MalformedURLException, InterruptedException
	{	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		
		WebElement traditionalok = driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with traditional theme"));
		traditionalok.click();
		//enter name
		driver.findElement(By.id("android:id/button1")).click();

	}
	
	@Test
		public void Hololtheme() throws MalformedURLException, InterruptedException
		{	
			driver.findElement(AppiumBy.accessibilityId("App")).click();
			driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
			
			WebElement holook = driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with Holo Light theme"));
			holook.click();
			//enter name
			driver.findElement(By.id("android:id/button2")).click();

		}
	
}
