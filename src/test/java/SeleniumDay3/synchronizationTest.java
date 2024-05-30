package SeleniumDay3;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronizationTest {
	
	

	WebDriver driver;
	WebDriverWait wait ;

	@Before
	public void setUp() {
		driver = new SafariDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //selenium 3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"))).click();
		String nameOfTheEmpHeader = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Employee Name']"))).getText();;
		System.out.println(nameOfTheEmpHeader);
	
	}
	
	
	
	
	
	
	
	

}
