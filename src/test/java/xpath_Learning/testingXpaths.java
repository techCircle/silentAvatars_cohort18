package xpath_Learning;

import org.junit.Before;
import org.junit.Test;

import Utilities.BaseClass;
import Utilities.propertiesReader;

public class testingXpaths {
	
	
	@Before
	public void setUp() {
		BaseClass.getDriver();
	}
	
	
	@Test
	public void test1() {
		System.out.println(BaseClass.getDriver().getTitle());
		System.out.println(propertiesReader.getProperty("testingKey"));
		System.out.println(BaseClass.getProperty51("testingKey"));
	}
	
	

	
	
	
	
	
	

}
