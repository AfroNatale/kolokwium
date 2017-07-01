package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest
{
	private int number;
	private String result;
	private FizzBuzz fizzBuzz;
	
	public FizzBuzzTest(int testParameter, String result) {
		number = testParameter;
		this.result = result;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 15, "FizzBuzz" }, { 6, "Fizz" }, { 10, "Buzz" }, { 7, "7"} };
		return Arrays.asList(data);
	}
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testCalc() {
		String currentResult = fizzBuzz.calculate(number);
		
		assertEquals(currentResult, result);
	}
}