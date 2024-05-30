package SeleniumDay4;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browserStackTripTaskVersionForDatePicker {

	WebDriver driver;

	WebDriverWait wait;

	@Before
	public void openBrowser() throws InterruptedException {

		driver = new SafariDriver();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

	@Test
	public void tripDetails() throws InterruptedException {

		// Close the modal dialog box if it appears

		List<WebElement> closeModal = driver.findElements(By.cssSelector("span.commonModal__close"));

		if (closeModal.size() > 0) {

			closeModal.get(0).click();

		}

		try {

			WebElement dept = wait

					.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p[data-cy='departureDate']")));

			dept.click();

			Thread.sleep(2000);

			selectDate("June 2024", "24");

			Thread.sleep(3000);

			String selectedDate = driver.findElement(By.xpath("//p[@data-cy='departureDate']/span[1]")).getText();

			Assert.assertEquals(selectedDate, "8");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void selectDate(String month_year, String day) throws InterruptedException {

		// For selecting month and year

		List<WebElement> months = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));

		System.out.println("months count: " + months.size());

		for (int i = 0; i < months.size(); i++) {

			// Select date corresponding to the the month

			if (months.get(i).getText().equals(month_year)) {

				List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Caption']/div)[" + i

						+ "+1]/..//following-sibling::div[@class='DayPicker-Body']//div[@class='DayPicker-Day']//p"));

				System.out.println("days count: " + days.size());

				for (int j = 0; j < days.size(); j++) {

					if (days.get(j).getText().equals(day)) {

						days.get(j).click();

						break;

					}

				}

			}

		}

	}
	


}
