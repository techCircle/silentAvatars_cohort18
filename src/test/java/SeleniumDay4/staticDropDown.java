package SeleniumDay4;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {
	
	
	
	WebDriver driver;
	
	
	@Before
	public void setUp() {
		driver = new SafariDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
	}
	
	
	@Test
	public void selectingDropdowns() throws InterruptedException {
		
		
		Select select = new Select(driver.findElement(By.id("dropdown")));
		
		Thread.sleep(2000);
		
		select.selectByIndex(1);
		
		Thread.sleep(2000);
		
		select.selectByValue("2");
		
		Thread.sleep(2000);
		
		select.selectByVisibleText("Option 1");
		
	}
	

}
