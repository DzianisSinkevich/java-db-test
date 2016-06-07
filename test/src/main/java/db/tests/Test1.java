package db.tests;

import java.math.BigDecimal;
import java.math.MathContext;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pages.TestBaseRecon;

public class Test1 extends TestBaseRecon {

	private Logger log = Logger.getLogger("file");
	private Logger logConsole = Logger.getLogger("console");

	// @BeforeTest
	// public void setUp() {
	// log = Logger.getLogger("file");
	// }

	@Test
	public void testUntitled() {
		BigDecimal first = new BigDecimal("3419229223372036854775807.23343");
	    BigDecimal second = new BigDecimal("2.0");
	    System.out.println(first.add(second));
	    System.out.println(first.subtract(second));
	    System.out.println(first.divide(second));
	    System.out.println(first.equals(second));
	    System.out.println(first.abs());
	    System.out.println(first.max(second));
	    System.out.println(first.min(second));
	    System.out.println(first.remainder(second));
	}
}