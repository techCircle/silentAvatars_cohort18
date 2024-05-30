package SeleniumDay4;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWaitForlogin {
	
	

	WebDriver driver;
	Wait<WebDriver> fluentWait;
	

	@Before
	public void setUp() {
		driver = new SafariDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //selenium 3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	//	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
	
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//	fluentWait.until(ExpectedConditions.(driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")))).click();
		//fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"))).click();
	
		String nameOfTheEmpHeader = fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Employee Name']"))).getText();;
		System.out.println(nameOfTheEmpHeader);
	
	}

}
