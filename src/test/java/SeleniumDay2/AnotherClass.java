package SeleniumDay2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnotherClass {
	
	@After
	public void tearDown() {
		System.out.println("I am tearDown method in after");
	}
	
	@Test
	public void ValidationPinOrderForChecks() {
		System.out.println("Hello World, i am Test2");
	}

	@Before
	public void setUp() {
		System.out.println("I am setUp method in before");
	}

	@Test
	public void OrderingPinForloanNumbers() {
		System.out.println("Hello World, i am Test1");
	}

	

	

}
