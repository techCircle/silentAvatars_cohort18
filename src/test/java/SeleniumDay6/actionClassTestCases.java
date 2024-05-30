package SeleniumDay6;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class actionClassTestCases {
	
	static WebDriver driver;
	static 	Actions action ;
	 
	
	@Before
	public void openBrowser() {
		driver = new SafariDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		action = new Actions(driver);
	}
	
	
	@Test
	public void hoverOverTest() throws InterruptedException {
		WebElement menuItem = driver.findElement(By.xpath("//*[text()='Main Item 2']"));
		action.moveToElement(menuItem).build().perform();
		Thread.sleep(5000);

	}
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		action.dragAndDrop(draggable, droppable).build().perform();	
		Thread.sleep(5000);
	}
	
	
	@Test
	public void otherActionMethods() throws InterruptedException {
			//moveToElement
			//dragAndDrop
			//contextClick  -- if regular selenium click doesn't work
			//doubleClick
			//keyDown
			//SendKeys -- if regular selenium sendKeys method doesn't work
	}
	
	
	
	@After
	public void tearDown() {
		driver.close();
//		driver.quit();
	}
	
	
	
	

}
