package SeleniumDay6;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class switchingWindowsTabUsingWindowHandles {

	static WebDriver driver;

	@Before
	public void openBrowser() {
		driver = new SafariDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	public void swtichNewTabTest() throws InterruptedException {
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		switchWindows();
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	}


	public static void switchWindows() {
		// Grabs the ids of the both parent and the child windows
		Set<String> ids = driver.getWindowHandles();
		// we are setting the ids into an iterator object
		Iterator<String> it = ids.iterator();
		// we are storing the ids into its respective string names
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		
		
	}
	

}
