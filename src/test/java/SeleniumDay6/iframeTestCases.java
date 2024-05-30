package SeleniumDay6;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class iframeTestCases {

	static WebDriver driver;

	@Before
	public void openBrowser() {
		driver = new SafariDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	public void testCase1() throws InterruptedException {
		String parentHeader = driver.findElement(By.xpath("//div[@id='framesWrapper']/h1")).getText();
		System.out.println(parentHeader);

		driver.switchTo().frame("frame1");

		String insideIframe1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(insideIframe1 + "  -- this is from iframe1");

		driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");

		String insideIframe2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(insideIframe2+ "  -- this is from iframe2");

		driver.switchTo().defaultContent();

	}

}
