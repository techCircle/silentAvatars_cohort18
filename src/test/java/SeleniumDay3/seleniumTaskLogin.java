package SeleniumDay3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class seleniumTaskLogin {
	
	
	WebDriver driver;
	
	
	@Before
	public void setUp() {
		driver = new SafariDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void verifyLogin() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='menu-item-50']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("techcirclecohort18@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TechCircleCohort18");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		

	}
	
	
	
	

}
