package SeleniumDay2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationDemoSite {
	
	
	WebDriver driver;
	
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
	}
	
	
	@Test
	public void register() {
		
		//enter email and press the arrow button to submit
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		
		
		// entering first name , last name and address
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Malak");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Som");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("123 abc St. Fairfax VA 22033");	
		
		//entering email, tell
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("703.731.9625");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		//click on language input, and selection one or more options
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//label[text()='Languages']/following-sibling::div//div[2]/ul/li[8]")).click();
	}
	
	
}
