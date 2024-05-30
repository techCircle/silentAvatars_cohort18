package SeleniumDay5;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumAlerts {
	
	WebDriver driver;
	WebDriverWait wait;
	String name; 
	
	@Before
	public void openBrowser() {
		driver = new SafariDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		name = "TechCircle";
	}
	
	
	@Test
	public void alertTesting() throws InterruptedException {	
		
		//first alert
		driver.findElement(By.id("alertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		//second alert
		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
	
		//third alert
		driver.findElement(By.id("confirmButton")).click();
		wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		String canceledText = driver.findElement(By.xpath("//*[@id='confirmResult']")).getText();
		Assert.assertTrue(canceledText.contains("Cancel"));
		
		
		
		//fourth alert
		driver.findElement(By.id("promtButton")).click();
		wait.until(ExpectedConditions.alertIsPresent()).sendKeys(name);
		driver.switchTo().alert().accept();
		String promptText = driver.findElement(By.xpath("//*[@id='promptResult']")).getText();
		Assert.assertTrue(promptText.contains(name));

	}
	
	
	

}
