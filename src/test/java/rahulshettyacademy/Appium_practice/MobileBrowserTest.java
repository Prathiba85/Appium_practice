package rahulshettyacademy.Appium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest {
@Test
	public void openbrowser() throws Exception
	{
	//driver.findElement(By.name("q")).sendKeys("Rahul shetty academey");
	//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	//System.out.println(driver.getTitle());
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-success']")).click();
		WebElement devOps=driver.findElement(By.xpath("//a[text()='Devops']"));
		Thread.sleep(7000);
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		jsexec.executeScript("arguments[0].scrollIntoView(true);",devOps);
		String actual_text=devOps.getText();
		Assert.assertEquals(actual_text, "Devops");
		
		
	}

}
