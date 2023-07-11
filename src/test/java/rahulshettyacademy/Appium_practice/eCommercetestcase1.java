package rahulshettyacademy.Appium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class eCommercetestcase1 extends BaseTest {
	
	//@Test
	public void fill_form()
	{
		
		driver.findElement(By.id("android:id/text1")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("prathiba");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}

	//@Test
	public void toastmessage()
	{
		
	
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastmessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastmessage,"Please enter your name");
	}
	
	//@Test
	public void addToCart() throws InterruptedException
	{
		
		//driver.findElement(By.id("android:id/text1")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("prathiba");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Jordan 6 Rings']/following-sibling::android.widget.LinearLayout//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
		
		/*
		List<WebElement> productnames = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
		
		
		for (WebElement productname:productnames)
		{
			String name = productname.getText();
			
			if(name.equals("Jordan 6 Rings"))
					{
						
						driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
						
						break;
					}
		}
		*/
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text","cart"));
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		String added_product_name = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		Assert.assertEquals(added_product_name,"Jordan 6 Rings");
		
	}
	
	

	@Test
	public void addToCart_checkamount() throws InterruptedException
	{
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("prathiba");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/following-sibling::android.widget.LinearLayout//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']/following-sibling::android.widget.LinearLayout//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
		List<WebElement> prices= driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice']"));
		double total_amount = 0;
		for (WebElement price :prices)
		{
			String value = (price.getText());
			String value_double=value.substring(1);
			double item_price = Double.parseDouble(value_double);
						total_amount = item_price+total_amount;
			System.out.println(total_amount);
			
		}
		String actual_value=driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/totalAmountLbl']")).getText();
		String remove_actual_total = actual_value.substring(1);
		double actual_total = Double.parseDouble(remove_actual_total);
		
		Assert.assertEquals(total_amount,actual_total);
		
		
		//LongPress
	WebElement condition=	driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
	longpressAction(condition);
	driver.findElement(By.id("android:id/button1")).click();
	
	driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
	}
	
	
}
