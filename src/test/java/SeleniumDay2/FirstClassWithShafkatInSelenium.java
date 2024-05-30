package SeleniumDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClassWithShafkatInSelenium {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.realmadrid.com");
		
		
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.google.com");
		
	}

}
