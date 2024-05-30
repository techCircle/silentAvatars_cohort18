package SeleniumDay2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicSeleniumMethods {
	
	
	WebDriver driver;
	
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.realmadrid.com");
	}
	
	@Test
	public void test1() {
		System.out.println(driver.getTitle());
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}

	@Test
	public void test2() {
		driver.navigate().to("https://www.techcircleschool.com");
		String title = driver.getCurrentUrl();
		System.out.println("Title of the page after it navigates to another page - " + title);
		
		driver.navigate().back();
		title = driver.getCurrentUrl();
		System.out.println("Title of the page after it navigates back to madrid - " + title);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	
	
}
