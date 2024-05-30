package SeleniumDay6;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class arrayOfProductsTest {
	
	
	static WebDriver driver;
	 
	
	@Before
	public void openBrowser() {
		driver = new SafariDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		login("Admin", "admin123");
	}
	
	
	@Test
	public void clickDynamically() throws InterruptedException {
		mainMenuOptions("PIM");
		userDropdownOptions("logout");
	}
	
	
	public static void login(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();	
	}
	
	
	public static void userDropdownOptions(String option) throws InterruptedException {
		Thread.sleep(3000);
		//clicking on the name dropdown on the top right corner
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']/li"));
		for(WebElement oneOption: options) {
			if(oneOption.getText().equalsIgnoreCase(option)) {
				oneOption.click();
				break;
			}
		}
	}
	
	
	public static void mainMenuOptions(String option) throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
		for(WebElement oneOption: options) {
			if(oneOption.getText().equalsIgnoreCase(option)) {
				oneOption.click();
				break;
			}
		}
	}
	

}
