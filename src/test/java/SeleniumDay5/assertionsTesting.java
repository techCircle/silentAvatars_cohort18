package SeleniumDay5;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class assertionsTesting {
	
	String actualText;

	@Ignore
	@Test
	public void assertTrueTestCase() {
		Assert.assertTrue(actualText.equalsIgnoreCase(expectedWelcomeText)); /// hard assertion
		System.out.println("This is line 31");
	}

	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	@After
	public void tearDown() {
		driver.close();
//		driver.quit();
	}

	@Before
	public void openBrowser() {
		driver = new SafariDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		actualText = driver.findElement(By.xpath("//*[@id='content']/h1")).getText();

	}

	@Ignore
	@Test
	public void assertFalseTestCase() {
//		WebElement actualExampleHeaderText = driver.findElement(By.xpath("//*[@id='content']/h2"));
//		driver.navigate().to("https://www.google.com");
//		Assert.assertFalse(actualExampleHeaderText.isDisplayed());
//		System.out.println("This is line 41");	
		int oddNumber = 3;
		Assert.assertFalse(isEven(oddNumber));
		System.out.println("This is line 43");
	}
	
	WebDriver driver;
	String expectedWelcomeText = "Welcome to the-internet";
	
	
	@Test
	public void assertEqualsTestCase(){
		Assert.assertEquals(expectedWelcomeText, actualText);	
	}
	

}
