package SeleniumDay4;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class makeMyTripTask {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = new SafariDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	public void searchForFlight() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("IAD");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();

		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("URC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		Thread.sleep(2000);
		// click on today's clanedar date
		// driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]")).click();

		// pickDepartureDate(driver, "Tue May 29 2024");

		driver.findElement(By.xpath("//p[@data-cy='submit']/a")).click();

	}


}
