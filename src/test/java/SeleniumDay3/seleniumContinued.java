package SeleniumDay3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class seleniumContinued {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = new SafariDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
	}

	@Test
	public void checkboxTest() throws InterruptedException {

		WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

		Thread.sleep(3000);

		// checkbox1
		Boolean isCheckboxSelected = checkbox1.isSelected();
		if (isCheckboxSelected) {
			System.out.println("Checkbox 1 was selected");
			checkbox1.click();
			System.out.println("It is now un checked");
		} else {
			System.out.println("It isn't selected");
			checkbox1.click();
			System.out.println("Now it should be selected");
		}

		Thread.sleep(3000);
		// checkbox2
		isCheckboxSelected = checkbox2.isSelected();
		if (isCheckboxSelected) {
			System.out.println("Checkbox 2 is selected");
			checkbox2.click();
			System.out.println("It is now un checked");

		} else {
			System.out.println("It isn't selected");
			checkbox2.click();
			System.out.println("Now it should be selected");
		}

	}

}
