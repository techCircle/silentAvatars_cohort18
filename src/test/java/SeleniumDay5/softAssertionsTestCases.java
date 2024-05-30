package SeleniumDay5;

import org.junit.Before;
import org.junit.Test;
import org.assertj.core.api.SoftAssertions;


public class softAssertionsTestCases {
	
	SoftAssertions softAssert;  //declaring at class level
	
	@Before
	public void setUP() {
		softAssert = new SoftAssertions();
	}
	
	public boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public int add(int a, int b) {
		return a + b; 
	}
	
	public int subtract(int a, int b) {
		return a - b; 
	}
	
	
	@Test
	public void TestCalculatorOperations() {
		softAssert.assertThat(isEven(4)).as("Check if 3 is even").isFalse();
		softAssert.assertThat(add(2, 3)).as("Check addition of 2 and 3").isEqualTo(7);
		softAssert.assertThat(subtract(5, 3)).as("Check subtraction of 3 from 5").isEqualTo(1);
		softAssert.assertAll();
	}
	
	
	
	public void test2() {
		
	}
	
	
	
	
	
	

}
