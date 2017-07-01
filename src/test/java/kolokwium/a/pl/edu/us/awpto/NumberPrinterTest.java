package kolokwium.a.pl.edu.us.awpto;

import org.junit.Before;
import org.junit.Test;

public class NumberPrinterTest
{
	private NumberPrinter np;
	
	@Before
	public void setUp() {
		np = new NumberPrinter(new FizzBuzz(), new ConsolePrinter());
	}
	
	@Test(expected = RuntimeException.class)
	public void testException() {
		np.printNumbers(0);
	}
	
}